package typings.metismenu

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetisMenuOptions extends StObject {
  
  var parentTrigger: js.UndefOr[String] = js.undefined
  
  var preventDefault: js.UndefOr[Boolean] = js.undefined
  
  var subMenu: js.UndefOr[String] = js.undefined
  
  var toggle: js.UndefOr[Boolean] = js.undefined
  
  var triggerElement: js.UndefOr[String] = js.undefined
}
object MetisMenuOptions {
  
  inline def apply(): MetisMenuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetisMenuOptions]
  }
  
  extension [Self <: MetisMenuOptions](x: Self) {
    
    inline def setParentTrigger(value: String): Self = StObject.set(x, "parentTrigger", value.asInstanceOf[js.Any])
    
    inline def setParentTriggerUndefined: Self = StObject.set(x, "parentTrigger", js.undefined)
    
    inline def setPreventDefault(value: Boolean): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    
    inline def setPreventDefaultUndefined: Self = StObject.set(x, "preventDefault", js.undefined)
    
    inline def setSubMenu(value: String): Self = StObject.set(x, "subMenu", value.asInstanceOf[js.Any])
    
    inline def setSubMenuUndefined: Self = StObject.set(x, "subMenu", js.undefined)
    
    inline def setToggle(value: Boolean): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
    
    inline def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
    
    inline def setTriggerElement(value: String): Self = StObject.set(x, "triggerElement", value.asInstanceOf[js.Any])
    
    inline def setTriggerElementUndefined: Self = StObject.set(x, "triggerElement", js.undefined)
  }
}
