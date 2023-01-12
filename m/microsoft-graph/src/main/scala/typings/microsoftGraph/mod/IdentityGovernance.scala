package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityGovernance extends StObject {
  
  var accessReviews: js.UndefOr[NullableOption[AccessReviewSet]] = js.undefined
  
  var appConsent: js.UndefOr[NullableOption[AppConsentApprovalRoute]] = js.undefined
  
  var entitlementManagement: js.UndefOr[NullableOption[EntitlementManagement]] = js.undefined
  
  var termsOfUse: js.UndefOr[NullableOption[TermsOfUseContainer]] = js.undefined
}
object IdentityGovernance {
  
  inline def apply(): IdentityGovernance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityGovernance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdentityGovernance] (val x: Self) extends AnyVal {
    
    inline def setAccessReviews(value: NullableOption[AccessReviewSet]): Self = StObject.set(x, "accessReviews", value.asInstanceOf[js.Any])
    
    inline def setAccessReviewsNull: Self = StObject.set(x, "accessReviews", null)
    
    inline def setAccessReviewsUndefined: Self = StObject.set(x, "accessReviews", js.undefined)
    
    inline def setAppConsent(value: NullableOption[AppConsentApprovalRoute]): Self = StObject.set(x, "appConsent", value.asInstanceOf[js.Any])
    
    inline def setAppConsentNull: Self = StObject.set(x, "appConsent", null)
    
    inline def setAppConsentUndefined: Self = StObject.set(x, "appConsent", js.undefined)
    
    inline def setEntitlementManagement(value: NullableOption[EntitlementManagement]): Self = StObject.set(x, "entitlementManagement", value.asInstanceOf[js.Any])
    
    inline def setEntitlementManagementNull: Self = StObject.set(x, "entitlementManagement", null)
    
    inline def setEntitlementManagementUndefined: Self = StObject.set(x, "entitlementManagement", js.undefined)
    
    inline def setTermsOfUse(value: NullableOption[TermsOfUseContainer]): Self = StObject.set(x, "termsOfUse", value.asInstanceOf[js.Any])
    
    inline def setTermsOfUseNull: Self = StObject.set(x, "termsOfUse", null)
    
    inline def setTermsOfUseUndefined: Self = StObject.set(x, "termsOfUse", js.undefined)
  }
}
