package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TermsOfUseContainer
  extends StObject
     with Entity {
  
  // Represents the current status of a user's response to a company's customizable terms of use agreement.
  var agreementAcceptances: js.UndefOr[NullableOption[js.Array[AgreementAcceptance]]] = js.undefined
  
  /**
    * Represents a tenant's customizable terms of use agreement that's created and managed with Azure Active Directory (Azure
    * AD).
    */
  var agreements: js.UndefOr[NullableOption[js.Array[Agreement]]] = js.undefined
}
object TermsOfUseContainer {
  
  inline def apply(): TermsOfUseContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TermsOfUseContainer]
  }
  
  extension [Self <: TermsOfUseContainer](x: Self) {
    
    inline def setAgreementAcceptances(value: NullableOption[js.Array[AgreementAcceptance]]): Self = StObject.set(x, "agreementAcceptances", value.asInstanceOf[js.Any])
    
    inline def setAgreementAcceptancesNull: Self = StObject.set(x, "agreementAcceptances", null)
    
    inline def setAgreementAcceptancesUndefined: Self = StObject.set(x, "agreementAcceptances", js.undefined)
    
    inline def setAgreementAcceptancesVarargs(value: AgreementAcceptance*): Self = StObject.set(x, "agreementAcceptances", js.Array(value*))
    
    inline def setAgreements(value: NullableOption[js.Array[Agreement]]): Self = StObject.set(x, "agreements", value.asInstanceOf[js.Any])
    
    inline def setAgreementsNull: Self = StObject.set(x, "agreements", null)
    
    inline def setAgreementsUndefined: Self = StObject.set(x, "agreements", js.undefined)
    
    inline def setAgreementsVarargs(value: Agreement*): Self = StObject.set(x, "agreements", js.Array(value*))
  }
}
