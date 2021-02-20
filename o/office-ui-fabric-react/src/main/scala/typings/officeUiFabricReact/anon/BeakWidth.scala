package typings.officeUiFabricReact.anon

import typings.officeUiFabricReact.officeUiFabricReactNumbers.`7`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BeakWidth extends StObject {
  
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
  implicit class BeakWidthMutableBuilder[Self <: BeakWidth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeakWidth(value: Double): Self = StObject.set(x, "beakWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionalHint(value: `7`): Self = StObject.set(x, "directionalHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGapSpace(value: Double): Self = StObject.set(x, "gapSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBeakVisible(value: Boolean): Self = StObject.set(x, "isBeakVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinPagePadding(value: Double): Self = StObject.set(x, "minPagePadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventDismissOnLostFocus(value: Boolean): Self = StObject.set(x, "preventDismissOnLostFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventDismissOnResize(value: Boolean): Self = StObject.set(x, "preventDismissOnResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventDismissOnScroll(value: Boolean): Self = StObject.set(x, "preventDismissOnScroll", value.asInstanceOf[js.Any])
  }
}
