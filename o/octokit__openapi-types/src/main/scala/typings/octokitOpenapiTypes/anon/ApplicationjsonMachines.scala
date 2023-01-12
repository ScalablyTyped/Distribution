package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonMachines extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Machines
}
object ApplicationjsonMachines {
  
  inline def apply(applicationSlashjson: Machines): ApplicationjsonMachines = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonMachines]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonMachines] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Machines): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
