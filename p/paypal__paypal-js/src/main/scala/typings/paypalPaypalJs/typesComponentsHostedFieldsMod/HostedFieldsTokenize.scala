package typings.paypalPaypalJs.typesComponentsHostedFieldsMod

import typings.paypalPaypalJs.anon.Company
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostedFieldsTokenize extends StObject {
  
  var authenticationInsight: js.UndefOr[Any] = js.undefined
  
  var billingAddress: js.UndefOr[Company] = js.undefined
  
  var cardholderName: js.UndefOr[String] = js.undefined
  
  var fieldsToTokenize: js.UndefOr[js.Array[String]] = js.undefined
  
  var vault: js.UndefOr[Boolean] = js.undefined
}
object HostedFieldsTokenize {
  
  inline def apply(): HostedFieldsTokenize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostedFieldsTokenize]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HostedFieldsTokenize] (val x: Self) extends AnyVal {
    
    inline def setAuthenticationInsight(value: Any): Self = StObject.set(x, "authenticationInsight", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationInsightUndefined: Self = StObject.set(x, "authenticationInsight", js.undefined)
    
    inline def setBillingAddress(value: Company): Self = StObject.set(x, "billingAddress", value.asInstanceOf[js.Any])
    
    inline def setBillingAddressUndefined: Self = StObject.set(x, "billingAddress", js.undefined)
    
    inline def setCardholderName(value: String): Self = StObject.set(x, "cardholderName", value.asInstanceOf[js.Any])
    
    inline def setCardholderNameUndefined: Self = StObject.set(x, "cardholderName", js.undefined)
    
    inline def setFieldsToTokenize(value: js.Array[String]): Self = StObject.set(x, "fieldsToTokenize", value.asInstanceOf[js.Any])
    
    inline def setFieldsToTokenizeUndefined: Self = StObject.set(x, "fieldsToTokenize", js.undefined)
    
    inline def setFieldsToTokenizeVarargs(value: String*): Self = StObject.set(x, "fieldsToTokenize", js.Array(value*))
    
    inline def setVault(value: Boolean): Self = StObject.set(x, "vault", value.asInstanceOf[js.Any])
    
    inline def setVaultUndefined: Self = StObject.set(x, "vault", js.undefined)
  }
}
