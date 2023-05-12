package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.pending_cancellation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionEffectivedateEnterprise extends StObject {
  
  /** @enum {string} */
  var action: pending_cancellation
  
  /** @description The `pending_cancellation` and `pending_tier_change` event types will include the date the cancellation or tier change will take effect. */
  var effective_date: js.UndefOr[String] = js.undefined
  
  var enterprise: js.UndefOr[Htmlurl] = js.undefined
  
  var installation: js.UndefOr[NodeidString] = js.undefined
  
  var organization: js.UndefOr[Hooksurl] = js.undefined
  
  var repository: js.UndefOr[Allowupdatebranch] = js.undefined
  
  var sender: Avatarurl
  
  var sponsorship: Maintainer
}
object ActionEffectivedateEnterprise {
  
  inline def apply(sender: Avatarurl, sponsorship: Maintainer): ActionEffectivedateEnterprise = {
    val __obj = js.Dynamic.literal(action = "pending_cancellation", sender = sender.asInstanceOf[js.Any], sponsorship = sponsorship.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionEffectivedateEnterprise]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionEffectivedateEnterprise] (val x: Self) extends AnyVal {
    
    inline def setAction(value: pending_cancellation): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setEffective_date(value: String): Self = StObject.set(x, "effective_date", value.asInstanceOf[js.Any])
    
    inline def setEffective_dateUndefined: Self = StObject.set(x, "effective_date", js.undefined)
    
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
