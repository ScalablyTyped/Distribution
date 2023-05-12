package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonInstallationsTotalcount304 extends StObject {
  
  var parameters: Query473
  
  var responses: `200ContentApplicationjsonInstallationsTotalcount304`
}
object Responses200ContentApplicationjsonInstallationsTotalcount304 {
  
  inline def apply(parameters: Query473, responses: `200ContentApplicationjsonInstallationsTotalcount304`): Responses200ContentApplicationjsonInstallationsTotalcount304 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonInstallationsTotalcount304]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonInstallationsTotalcount304] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Query473): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonInstallationsTotalcount304`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
