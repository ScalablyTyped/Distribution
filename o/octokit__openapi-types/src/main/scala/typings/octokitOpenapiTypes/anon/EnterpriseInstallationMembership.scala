package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.renamed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterpriseInstallationMembership extends StObject {
  
  /** @enum {string} */
  var action: renamed
  
  var changes: js.UndefOr[`530`] = js.undefined
  
  var enterprise: js.UndefOr[Htmlurl] = js.undefined
  
  var installation: js.UndefOr[NodeidString] = js.undefined
  
  /**
    * Membership
    * @description The membership between the user and the organization. Not present when the action is `member_invited`.
    */
  var membership: js.UndefOr[OrganizationurlRole] = js.undefined
  
  var organization: Hooksurl
  
  var repository: js.UndefOr[Allowupdatebranch] = js.undefined
  
  var sender: Avatarurl
}
object EnterpriseInstallationMembership {
  
  inline def apply(organization: Hooksurl, sender: Avatarurl): EnterpriseInstallationMembership = {
    val __obj = js.Dynamic.literal(action = "renamed", organization = organization.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterpriseInstallationMembership]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnterpriseInstallationMembership] (val x: Self) extends AnyVal {
    
    inline def setAction(value: renamed): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setChanges(value: `530`): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    inline def setChangesUndefined: Self = StObject.set(x, "changes", js.undefined)
    
    inline def setEnterprise(value: Htmlurl): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseUndefined: Self = StObject.set(x, "enterprise", js.undefined)
    
    inline def setInstallation(value: NodeidString): Self = StObject.set(x, "installation", value.asInstanceOf[js.Any])
    
    inline def setInstallationUndefined: Self = StObject.set(x, "installation", js.undefined)
    
    inline def setMembership(value: OrganizationurlRole): Self = StObject.set(x, "membership", value.asInstanceOf[js.Any])
    
    inline def setMembershipUndefined: Self = StObject.set(x, "membership", js.undefined)
    
    inline def setOrganization(value: Hooksurl): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setRepository(value: Allowupdatebranch): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
    
    inline def setSender(value: Avatarurl): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
