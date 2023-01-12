package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonRunnergroups extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Runnergroups
}
object ApplicationjsonRunnergroups {
  
  inline def apply(applicationSlashjson: Runnergroups): ApplicationjsonRunnergroups = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonRunnergroups]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonRunnergroups] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Runnergroups): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
