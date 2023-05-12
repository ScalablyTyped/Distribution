package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.unblocked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionBlockeduser extends StObject {
  
  /** @enum {string} */
  var action: unblocked
  
  /** User */
  var blocked_user: Deleted | Null
  
  var enterprise: js.UndefOr[Htmlurl] = js.undefined
  
  var installation: js.UndefOr[NodeidString] = js.undefined
  
  var organization: Hooksurl
  
  var repository: js.UndefOr[Allowupdatebranch] = js.undefined
  
  var sender: Avatarurl
}
object ActionBlockeduser {
  
  inline def apply(organization: Hooksurl, sender: Avatarurl): ActionBlockeduser = {
    val __obj = js.Dynamic.literal(action = "unblocked", organization = organization.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], blocked_user = null)
    __obj.asInstanceOf[ActionBlockeduser]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionBlockeduser] (val x: Self) extends AnyVal {
    
    inline def setAction(value: unblocked): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setBlocked_user(value: Deleted): Self = StObject.set(x, "blocked_user", value.asInstanceOf[js.Any])
    
    inline def setBlocked_userNull: Self = StObject.set(x, "blocked_user", null)
    
    inline def setEnterprise(value: Htmlurl): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseUndefined: Self = StObject.set(x, "enterprise", js.undefined)
    
    inline def setInstallation(value: NodeidString): Self = StObject.set(x, "installation", value.asInstanceOf[js.Any])
    
    inline def setInstallationUndefined: Self = StObject.set(x, "installation", js.undefined)
    
    inline def setOrganization(value: Hooksurl): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setRepository(value: Allowupdatebranch): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
    
    inline def setSender(value: Avatarurl): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
