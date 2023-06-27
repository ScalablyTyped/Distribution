package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathInvitationidNumber extends StObject {
  
  var parameters: PathInvitationidNumber
  
  var responses: `304403Content41404Content41`
}
object ParametersPathInvitationidNumber {
  
  inline def apply(parameters: PathInvitationidNumber, responses: `304403Content41404Content41`): ParametersPathInvitationidNumber = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathInvitationidNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathInvitationidNumber] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathInvitationidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304403Content41404Content41`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
