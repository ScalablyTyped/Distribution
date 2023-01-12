package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonMachinesTotalcount extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: MachinesTotalcount
}
object ApplicationjsonMachinesTotalcount {
  
  inline def apply(applicationSlashjson: MachinesTotalcount): ApplicationjsonMachinesTotalcount = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonMachinesTotalcount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonMachinesTotalcount] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: MachinesTotalcount): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
