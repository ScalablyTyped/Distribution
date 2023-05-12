package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryInvitationsourcePage extends StObject {
  
  var parameters: QueryInvitationsourcePage
  
  var responses: `200Content511`
}
object ParametersQueryInvitationsourcePage {
  
  inline def apply(parameters: QueryInvitationsourcePage, responses: `200Content511`): ParametersQueryInvitationsourcePage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryInvitationsourcePage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryInvitationsourcePage] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryInvitationsourcePage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content511`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
