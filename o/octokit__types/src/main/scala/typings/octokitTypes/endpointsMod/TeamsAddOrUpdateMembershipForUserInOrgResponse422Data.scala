package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Field
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamsAddOrUpdateMembershipForUserInOrgResponse422Data extends StObject {
  
  var errors: js.Array[Field]
  
  var message: String
}
object TeamsAddOrUpdateMembershipForUserInOrgResponse422Data {
  
  @scala.inline
  def apply(errors: js.Array[Field], message: String): TeamsAddOrUpdateMembershipForUserInOrgResponse422Data = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsAddOrUpdateMembershipForUserInOrgResponse422Data]
  }
  
  @scala.inline
  implicit class TeamsAddOrUpdateMembershipForUserInOrgResponse422DataMutableBuilder[Self <: TeamsAddOrUpdateMembershipForUserInOrgResponse422Data] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrors(value: js.Array[Field]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsVarargs(value: Field*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
