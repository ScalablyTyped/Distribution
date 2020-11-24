package typings.officeUiFabricReact.anon

import typings.officeUiFabricReact.officeUiFabricReactNumbers.`7`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BeakWidth extends js.Object {
  
  var beakWidth: Double = js.native
  
  var directionalHint: `7` = js.native
  
  var gapSpace: Double = js.native
  
  var isBeakVisible: Boolean = js.native
  
  var minPagePadding: Double = js.native
  
  var preventDismissOnLostFocus: Boolean = js.native
  
  var preventDismissOnResize: Boolean = js.native
  
  var preventDismissOnScroll: Boolean = js.native
}
object BeakWidth {
  
  @scala.inline
  def apply(
    beakWidth: Double,
    directionalHint: `7`,
    gapSpace: Double,
    isBeakVisible: Boolean,
    minPagePadding: Double,
    preventDismissOnLostFocus: Boolean,
    preventDismissOnResize: Boolean,
    preventDismissOnScroll: Boolean
  ): BeakWidth = {
    val __obj = js.Dynamic.literal(beakWidth = beakWidth.asInstanceOf[js.Any], directionalHint = directionalHint.asInstanceOf[js.Any], gapSpace = gapSpace.asInstanceOf[js.Any], isBeakVisible = isBeakVisible.asInstanceOf[js.Any], minPagePadding = minPagePadding.asInstanceOf[js.Any], preventDismissOnLostFocus = preventDismissOnLostFocus.asInstanceOf[js.Any], preventDismissOnResize = preventDismissOnResize.asInstanceOf[js.Any], preventDismissOnScroll = preventDismissOnScroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeakWidth]
  }
  
  @scala.inline
  implicit class BeakWidthOps[Self <: BeakWidth] (val x: Self) extends AnyVal {
    
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
    def setDirectionalHint(value: `7`): Self = this.set("directionalHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGapSpace(value: Double): Self = this.set("gapSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBeakVisible(value: Boolean): Self = this.set("isBeakVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinPagePadding(value: Double): Self = this.set("minPagePadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventDismissOnLostFocus(value: Boolean): Self = this.set("preventDismissOnLostFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventDismissOnResize(value: Boolean): Self = this.set("preventDismissOnResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventDismissOnScroll(value: Boolean): Self = this.set("preventDismissOnScroll", value.asInstanceOf[js.Any])
  }
}
