package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonRunnersTotalcount extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: RunnersTotalcount
}
object ApplicationjsonRunnersTotalcount {
  
  inline def apply(applicationSlashjson: RunnersTotalcount): ApplicationjsonRunnersTotalcount = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonRunnersTotalcount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonRunnersTotalcount] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: RunnersTotalcount): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
