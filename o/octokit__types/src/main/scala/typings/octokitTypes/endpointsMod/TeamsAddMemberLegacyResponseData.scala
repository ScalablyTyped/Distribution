package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Field
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamsAddMemberLegacyResponseData extends StObject {
  
  var errors: js.Array[Field]
  
  var message: String
}
object TeamsAddMemberLegacyResponseData {
  
  inline def apply(errors: js.Array[Field], message: String): TeamsAddMemberLegacyResponseData = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsAddMemberLegacyResponseData]
  }
  
  extension [Self <: TeamsAddMemberLegacyResponseData](x: Self) {
    
    inline def setErrors(value: js.Array[Field]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: Field*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
