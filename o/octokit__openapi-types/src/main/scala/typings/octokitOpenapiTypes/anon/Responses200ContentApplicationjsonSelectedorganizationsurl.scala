package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonSelectedorganizationsurl extends StObject {
  
  var parameters: PathEnterpriseString
  
  var responses: `200ContentApplicationjsonSelectedorganizationsurl`
}
object Responses200ContentApplicationjsonSelectedorganizationsurl {
  
  inline def apply(parameters: PathEnterpriseString, responses: `200ContentApplicationjsonSelectedorganizationsurl`): Responses200ContentApplicationjsonSelectedorganizationsurl = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonSelectedorganizationsurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonSelectedorganizationsurl] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathEnterpriseString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonSelectedorganizationsurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
