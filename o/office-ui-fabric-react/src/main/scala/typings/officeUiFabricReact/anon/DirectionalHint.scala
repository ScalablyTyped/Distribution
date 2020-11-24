package typings.officeUiFabricReact.anon

import typings.officeUiFabricReact.officeUiFabricReactNumbers.`12`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectionalHint extends js.Object {
  
  var beakWidth: Double = js.native
  
  var directionalHint: `12` = js.native
  
  var doNotLayer: Boolean = js.native
  
  var gapSpace: Double = js.native
  
  var setInitialFocus: Boolean = js.native
}
object DirectionalHint {
  
  @scala.inline
  def apply(
    beakWidth: Double,
    directionalHint: `12`,
    doNotLayer: Boolean,
    gapSpace: Double,
    setInitialFocus: Boolean
  ): DirectionalHint = {
    val __obj = js.Dynamic.literal(beakWidth = beakWidth.asInstanceOf[js.Any], directionalHint = directionalHint.asInstanceOf[js.Any], doNotLayer = doNotLayer.asInstanceOf[js.Any], gapSpace = gapSpace.asInstanceOf[js.Any], setInitialFocus = setInitialFocus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionalHint]
  }
  
  @scala.inline
  implicit class DirectionalHintOps[Self <: DirectionalHint] (val x: Self) extends AnyVal {
    
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
    def setBeakWidth(value: Double): Self = this.set("beakWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionalHint(value: `12`): Self = this.set("directionalHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoNotLayer(value: Boolean): Self = this.set("doNotLayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGapSpace(value: Double): Self = this.set("gapSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetInitialFocus(value: Boolean): Self = this.set("setInitialFocus", value.asInstanceOf[js.Any])
  }
}
