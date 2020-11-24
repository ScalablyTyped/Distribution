package typings.openlayers.mod.olx.interaction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PinchZoomOptions extends js.Object {
  
  var constrainResolution: js.UndefOr[Boolean] = js.native
  
  var duration: js.UndefOr[Double] = js.native
}
object PinchZoomOptions {
  
  @scala.inline
  def apply(): PinchZoomOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PinchZoomOptions]
  }
  
  @scala.inline
  implicit class PinchZoomOptionsOps[Self <: PinchZoomOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConstrainResolution(value: Boolean): Self = this.set("constrainResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConstrainResolution: Self = this.set("constrainResolution", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
  }
}
