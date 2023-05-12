package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.cancelled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Marketplacepurchase extends StObject {
  
  /** @enum {string} */
  var action: cancelled
  
  var effective_date: String
  
  var enterprise: js.UndefOr[Htmlurl] = js.undefined
  
  var installation: js.UndefOr[NodeidString] = js.undefined
  
  var marketplace_purchase: Nextbillingdate
  
  var organization: js.UndefOr[Hooksurl] = js.undefined
  
  /** Marketplace Purchase */
  var previous_marketplace_purchase: js.UndefOr[Onfreetrial] = js.undefined
  
  var repository: js.UndefOr[Allowupdatebranch] = js.undefined
  
  var sender: Avatarurl
}
object Marketplacepurchase {
  
  inline def apply(effective_date: String, marketplace_purchase: Nextbillingdate, sender: Avatarurl): Marketplacepurchase = {
    val __obj = js.Dynamic.literal(action = "cancelled", effective_date = effective_date.asInstanceOf[js.Any], marketplace_purchase = marketplace_purchase.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[Marketplacepurchase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Marketplacepurchase] (val x: Self) extends AnyVal {
    
    inline def setAction(value: cancelled): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setEffective_date(value: String): Self = StObject.set(x, "effective_date", value.asInstanceOf[js.Any])
    
    inline def setEnterprise(value: Htmlurl): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseUndefined: Self = StObject.set(x, "enterprise", js.undefined)
    
    inline def setInstallation(value: NodeidString): Self = StObject.set(x, "installation", value.asInstanceOf[js.Any])
    
    inline def setInstallationUndefined: Self = StObject.set(x, "installation", js.undefined)
    
    inline def setMarketplace_purchase(value: Nextbillingdate): Self = StObject.set(x, "marketplace_purchase", value.asInstanceOf[js.Any])
    
    inline def setOrganization(value: Hooksurl): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setPrevious_marketplace_purchase(value: Onfreetrial): Self = StObject.set(x, "previous_marketplace_purchase", value.asInstanceOf[js.Any])
    
    inline def setPrevious_marketplace_purchaseUndefined: Self = StObject.set(x, "previous_marketplace_purchase", js.undefined)
    
    inline def setRepository(value: Allowupdatebranch): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
    
    inline def setSender(value: Avatarurl): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
