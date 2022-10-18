package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonAllowforcepushes extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Allowforcepushes
}
object ApplicationjsonAllowforcepushes {
  
  inline def apply(applicationSlashjson: Allowforcepushes): ApplicationjsonAllowforcepushes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonAllowforcepushes]
  }
  
  extension [Self <: ApplicationjsonAllowforcepushes](x: Self) {
    
    inline def setApplicationSlashjson(value: Allowforcepushes): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
