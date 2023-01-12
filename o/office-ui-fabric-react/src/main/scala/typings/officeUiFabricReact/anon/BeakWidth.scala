package typings.officeUiFabricReact.anon

import typings.officeUiFabricReact.officeUiFabricReactInts.`7`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BeakWidth extends StObject {
  
  var beakWidth: Double
  
  var directionalHint: `7`
  
  var gapSpace: Double
  
  var isBeakVisible: Boolean
  
  var minPagePadding: Double
  
  var preventDismissOnLostFocus: Boolean
  
  var preventDismissOnResize: Boolean
  
  var preventDismissOnScroll: Boolean
}
object BeakWidth {
  
  inline def apply(
    beakWidth: Double,
    gapSpace: Double,
    isBeakVisible: Boolean,
    minPagePadding: Double,
    preventDismissOnLostFocus: Boolean,
    preventDismissOnResize: Boolean,
    preventDismissOnScroll: Boolean
  ): BeakWidth = {
    val __obj = js.Dynamic.literal(beakWidth = beakWidth.asInstanceOf[js.Any], directionalHint = 7, gapSpace = gapSpace.asInstanceOf[js.Any], isBeakVisible = isBeakVisible.asInstanceOf[js.Any], minPagePadding = minPagePadding.asInstanceOf[js.Any], preventDismissOnLostFocus = preventDismissOnLostFocus.asInstanceOf[js.Any], preventDismissOnResize = preventDismissOnResize.asInstanceOf[js.Any], preventDismissOnScroll = preventDismissOnScroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeakWidth]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BeakWidth] (val x: Self) extends AnyVal {
    
    inline def setBeakWidth(value: Double): Self = StObject.set(x, "beakWidth", value.asInstanceOf[js.Any])
    
    inline def setDirectionalHint(value: `7`): Self = StObject.set(x, "directionalHint", value.asInstanceOf[js.Any])
    
    inline def setGapSpace(value: Double): Self = StObject.set(x, "gapSpace", value.asInstanceOf[js.Any])
    
    inline def setIsBeakVisible(value: Boolean): Self = StObject.set(x, "isBeakVisible", value.asInstanceOf[js.Any])
    
    inline def setMinPagePadding(value: Double): Self = StObject.set(x, "minPagePadding", value.asInstanceOf[js.Any])
    
    inline def setPreventDismissOnLostFocus(value: Boolean): Self = StObject.set(x, "preventDismissOnLostFocus", value.asInstanceOf[js.Any])
    
    inline def setPreventDismissOnResize(value: Boolean): Self = StObject.set(x, "preventDismissOnResize", value.asInstanceOf[js.Any])
    
    inline def setPreventDismissOnScroll(value: Boolean): Self = StObject.set(x, "preventDismissOnScroll", value.asInstanceOf[js.Any])
  }
}
