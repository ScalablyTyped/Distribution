package typings.photoshop.domCoreModulesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuCommandMenuIDOptions extends StObject {
  
  var menuID: Double
  
  var scheduling: js.UndefOr[Scheduling] = js.undefined
}
object MenuCommandMenuIDOptions {
  
  inline def apply(menuID: Double): MenuCommandMenuIDOptions = {
    val __obj = js.Dynamic.literal(menuID = menuID.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuCommandMenuIDOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MenuCommandMenuIDOptions] (val x: Self) extends AnyVal {
    
    inline def setMenuID(value: Double): Self = StObject.set(x, "menuID", value.asInstanceOf[js.Any])
    
    inline def setScheduling(value: Scheduling): Self = StObject.set(x, "scheduling", value.asInstanceOf[js.Any])
    
    inline def setSchedulingUndefined: Self = StObject.set(x, "scheduling", js.undefined)
  }
}
