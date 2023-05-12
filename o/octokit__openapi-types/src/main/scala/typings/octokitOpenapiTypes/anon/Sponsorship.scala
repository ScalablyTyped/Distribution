package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.cancelled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sponsorship extends StObject {
  
  /** @enum {string} */
  var action: cancelled
  
  var enterprise: js.UndefOr[Htmlurl] = js.undefined
  
  var installation: js.UndefOr[NodeidString] = js.undefined
  
  var organization: js.UndefOr[Hooksurl] = js.undefined
  
  var repository: js.UndefOr[Allowupdatebranch] = js.undefined
  
  var sender: Avatarurl
  
  var sponsorship: Maintainer
}
object Sponsorship {
  
  inline def apply(sender: Avatarurl, sponsorship: Maintainer): Sponsorship = {
    val __obj = js.Dynamic.literal(action = "cancelled", sender = sender.asInstanceOf[js.Any], sponsorship = sponsorship.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sponsorship]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Sponsorship] (val x: Self) extends AnyVal {
    
    inline def setAction(value: cancelled): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setEnterprise(value: Htmlurl): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseUndefined: Self = StObject.set(x, "enterprise", js.undefined)
    
    inline def setInstallation(value: NodeidString): Self = StObject.set(x, "installation", value.asInstanceOf[js.Any])
    
    inline def setInstallationUndefined: Self = StObject.set(x, "installation", js.undefined)
    
    inline def setOrganization(value: Hooksurl): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setRepository(value: Allowupdatebranch): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
    
    inline def setSender(value: Avatarurl): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setSponsorship(value: Maintainer): Self = StObject.set(x, "sponsorship", value.asInstanceOf[js.Any])
  }
}
