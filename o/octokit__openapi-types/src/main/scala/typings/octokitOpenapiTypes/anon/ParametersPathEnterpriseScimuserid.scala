package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathEnterpriseScimuserid extends StObject {
  
  var parameters: PathEnterpriseScimuserid
  
  var responses: `200ContentApplicationjsonEmailsExternalId`
}
object ParametersPathEnterpriseScimuserid {
  
  inline def apply(parameters: PathEnterpriseScimuserid, responses: `200ContentApplicationjsonEmailsExternalId`): ParametersPathEnterpriseScimuserid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathEnterpriseScimuserid]
  }
  
  extension [Self <: ParametersPathEnterpriseScimuserid](x: Self) {
    
    inline def setParameters(value: PathEnterpriseScimuserid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonEmailsExternalId`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
