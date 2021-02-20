package typings.metismenu

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetisMenuOptions extends StObject {
  
  var parentTrigger: js.UndefOr[String] = js.native
  
  var preventDefault: js.UndefOr[Boolean] = js.native
  
  var subMenu: js.UndefOr[String] = js.native
  
  var toggle: js.UndefOr[Boolean] = js.native
  
  var triggerElement: js.UndefOr[String] = js.native
}
object MetisMenuOptions {
  
  @scala.inline
  def apply(): MetisMenuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetisMenuOptions]
  }
  
  @scala.inline
  implicit class MetisMenuOptionsMutableBuilder[Self <: MetisMenuOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParentTrigger(value: String): Self = StObject.set(x, "parentTrigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentTriggerUndefined: Self = StObject.set(x, "parentTrigger", js.undefined)
    
    @scala.inline
    def setPreventDefault(value: Boolean): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventDefaultUndefined: Self = StObject.set(x, "preventDefault", js.undefined)
    
    @scala.inline
    def setSubMenu(value: String): Self = StObject.set(x, "subMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubMenuUndefined: Self = StObject.set(x, "subMenu", js.undefined)
    
    @scala.inline
    def setToggle(value: Boolean): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
    
    @scala.inline
    def setTriggerElement(value: String): Self = StObject.set(x, "triggerElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerElementUndefined: Self = StObject.set(x, "triggerElement", js.undefined)
  }
}
