package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.member_invited
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Invitation extends StObject {
  
  /** @enum {string} */
  var action: member_invited
  
  var enterprise: js.UndefOr[Htmlurl] = js.undefined
  
  var installation: js.UndefOr[NodeidString] = js.undefined
  
  /** @description The invitation for the user or email if the action is `member_invited`. */
  var invitation: Failedreason
  
  var organization: Hooksurl
  
  var repository: js.UndefOr[Allowupdatebranch] = js.undefined
  
  var sender: Avatarurl
  
  /** User */
  var user: js.UndefOr[Deleted | Null] = js.undefined
}
object Invitation {
  
  inline def apply(invitation: Failedreason, organization: Hooksurl, sender: Avatarurl): Invitation = {
    val __obj = js.Dynamic.literal(action = "member_invited", invitation = invitation.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[Invitation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Invitation] (val x: Self) extends AnyVal {
    
    inline def setAction(value: member_invited): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setEnterprise(value: Htmlurl): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseUndefined: Self = StObject.set(x, "enterprise", js.undefined)
    
    inline def setInstallation(value: NodeidString): Self = StObject.set(x, "installation", value.asInstanceOf[js.Any])
    
    inline def setInstallationUndefined: Self = StObject.set(x, "installation", js.undefined)
    
    inline def setInvitation(value: Failedreason): Self = StObject.set(x, "invitation", value.asInstanceOf[js.Any])
    
    inline def setOrganization(value: Hooksurl): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setRepository(value: Allowupdatebranch): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
    
    inline def setSender(value: Avatarurl): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setUser(value: Deleted): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserNull: Self = StObject.set(x, "user", null)
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
