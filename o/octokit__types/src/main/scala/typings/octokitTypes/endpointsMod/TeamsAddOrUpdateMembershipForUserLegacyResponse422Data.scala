package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Field
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamsAddOrUpdateMembershipForUserLegacyResponse422Data extends StObject {
  
  var errors: js.Array[Field]
  
  var message: String
}
object TeamsAddOrUpdateMembershipForUserLegacyResponse422Data {
  
  @scala.inline
  def apply(errors: js.Array[Field], message: String): TeamsAddOrUpdateMembershipForUserLegacyResponse422Data = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsAddOrUpdateMembershipForUserLegacyResponse422Data]
  }
  
  @scala.inline
  implicit class TeamsAddOrUpdateMembershipForUserLegacyResponse422DataMutableBuilder[Self <: TeamsAddOrUpdateMembershipForUserLegacyResponse422Data] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrors(value: js.Array[Field]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsVarargs(value: Field*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
