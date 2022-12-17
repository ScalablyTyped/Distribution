package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonRule extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Rule
}
object ApplicationjsonRule {
  
  inline def apply(applicationSlashjson: Rule): ApplicationjsonRule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonRule]
  }
  
  extension [Self <: ApplicationjsonRule](x: Self) {
    
    inline def setApplicationSlashjson(value: Rule): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
