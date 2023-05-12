package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionBranch extends StObject {
  
  var action: String
  
  var branch: String
  
  var client_payload: StringDictionary[Any] | Null
  
  var enterprise: js.UndefOr[Htmlurl] = js.undefined
  
  var installation: NodeidString
  
  var organization: js.UndefOr[Hooksurl] = js.undefined
  
  var repository: Allowupdatebranch
  
  var sender: Avatarurl
}
object ActionBranch {
  
  inline def apply(
    action: String,
    branch: String,
    installation: NodeidString,
    repository: Allowupdatebranch,
    sender: Avatarurl
  ): ActionBranch = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], branch = branch.asInstanceOf[js.Any], installation = installation.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], client_payload = null)
    __obj.asInstanceOf[ActionBranch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionBranch] (val x: Self) extends AnyVal {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    inline def setClient_payload(value: StringDictionary[Any]): Self = StObject.set(x, "client_payload", value.asInstanceOf[js.Any])
    
    inline def setClient_payloadNull: Self = StObject.set(x, "client_payload", null)
    
    inline def setEnterprise(value: Htmlurl): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseUndefined: Self = StObject.set(x, "enterprise", js.undefined)
    
    inline def setInstallation(value: NodeidString): Self = StObject.set(x, "installation", value.asInstanceOf[js.Any])
    
    inline def setOrganization(value: Hooksurl): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setRepository(value: Allowupdatebranch): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setSender(value: Avatarurl): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
