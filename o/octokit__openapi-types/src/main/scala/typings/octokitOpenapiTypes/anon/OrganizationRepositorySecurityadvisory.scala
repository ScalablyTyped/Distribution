package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.withdrawn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizationRepositorySecurityadvisory extends StObject {
  
  /** @enum {string} */
  var action: withdrawn
  
  var enterprise: js.UndefOr[Htmlurl] = js.undefined
  
  var installation: js.UndefOr[NodeidString] = js.undefined
  
  var organization: js.UndefOr[Hooksurl] = js.undefined
  
  var repository: js.UndefOr[Allowupdatebranch] = js.undefined
  
  /** @description The details of the security advisory, including summary, description, and severity. */
  var security_advisory: Identifiers
  
  var sender: js.UndefOr[Avatarurl] = js.undefined
}
object OrganizationRepositorySecurityadvisory {
  
  inline def apply(security_advisory: Identifiers): OrganizationRepositorySecurityadvisory = {
    val __obj = js.Dynamic.literal(action = "withdrawn", security_advisory = security_advisory.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationRepositorySecurityadvisory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrganizationRepositorySecurityadvisory] (val x: Self) extends AnyVal {
    
    inline def setAction(value: withdrawn): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setEnterprise(value: Htmlurl): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseUndefined: Self = StObject.set(x, "enterprise", js.undefined)
    
    inline def setInstallation(value: NodeidString): Self = StObject.set(x, "installation", value.asInstanceOf[js.Any])
    
    inline def setInstallationUndefined: Self = StObject.set(x, "installation", js.undefined)
    
    inline def setOrganization(value: Hooksurl): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setRepository(value: Allowupdatebranch): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
    
    inline def setSecurity_advisory(value: Identifiers): Self = StObject.set(x, "security_advisory", value.asInstanceOf[js.Any])
    
    inline def setSender(value: Avatarurl): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setSenderUndefined: Self = StObject.set(x, "sender", js.undefined)
  }
}
