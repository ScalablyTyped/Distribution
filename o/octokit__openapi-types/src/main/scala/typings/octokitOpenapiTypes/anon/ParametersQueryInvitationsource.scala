package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryInvitationsource extends StObject {
  
  var parameters: QueryInvitationsource
  
  var responses: `200Content79`
}
object ParametersQueryInvitationsource {
  
  inline def apply(parameters: QueryInvitationsource, responses: `200Content79`): ParametersQueryInvitationsource = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryInvitationsource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryInvitationsource] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryInvitationsource): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content79`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
