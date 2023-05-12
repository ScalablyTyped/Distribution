package typings.photoshop.domCoreModulesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuCommandOptions extends StObject {
  
  var commandID: Double
  
  var scheduling: js.UndefOr[Scheduling] = js.undefined
}
object MenuCommandOptions {
  
  inline def apply(commandID: Double): MenuCommandOptions = {
    val __obj = js.Dynamic.literal(commandID = commandID.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuCommandOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MenuCommandOptions] (val x: Self) extends AnyVal {
    
    inline def setCommandID(value: Double): Self = StObject.set(x, "commandID", value.asInstanceOf[js.Any])
    
    inline def setScheduling(value: Scheduling): Self = StObject.set(x, "scheduling", value.asInstanceOf[js.Any])
    
    inline def setSchedulingUndefined: Self = StObject.set(x, "scheduling", js.undefined)
  }
}
