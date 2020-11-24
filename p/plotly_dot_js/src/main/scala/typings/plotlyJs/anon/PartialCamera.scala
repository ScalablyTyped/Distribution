package typings.plotlyJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.Camera> */
@js.native
trait PartialCamera extends js.Object {
  
  var center: js.UndefOr[PartialPoint] = js.native
  
  var eye: js.UndefOr[PartialPoint] = js.native
  
  var up: js.UndefOr[PartialPoint] = js.native
}
object PartialCamera {
  
  @scala.inline
  def apply(): PartialCamera = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCamera]
  }
  
  @scala.inline
  implicit class PartialCameraOps[Self <: PartialCamera] (val x: Self) extends AnyVal {
    
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
    def setCenter(value: PartialPoint): Self = this.set("center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    
    @scala.inline
    def setEye(value: PartialPoint): Self = this.set("eye", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEye: Self = this.set("eye", js.undefined)
    
    @scala.inline
    def setUp(value: PartialPoint): Self = this.set("up", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUp: Self = this.set("up", js.undefined)
  }
}
