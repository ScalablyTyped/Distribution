package typings.mercadopagoSdkJs.bricks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrickInitialization extends StObject {
  
  var amount: js.UndefOr[Double] = js.undefined
  
  var externalReference: js.UndefOr[String] = js.undefined
  
  var payer: js.UndefOr[Payer] = js.undefined
  
  var paymentId: js.UndefOr[Double] = js.undefined
  
  var preferenceId: js.UndefOr[String] = js.undefined
  
  var redirectMode: js.UndefOr[WalletButtonRedirectMode] = js.undefined
}
object BrickInitialization {
  
  inline def apply(): BrickInitialization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrickInitialization]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BrickInitialization] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setExternalReference(value: String): Self = StObject.set(x, "externalReference", value.asInstanceOf[js.Any])
    
    inline def setExternalReferenceUndefined: Self = StObject.set(x, "externalReference", js.undefined)
    
    inline def setPayer(value: Payer): Self = StObject.set(x, "payer", value.asInstanceOf[js.Any])
    
    inline def setPayerUndefined: Self = StObject.set(x, "payer", js.undefined)
    
    inline def setPaymentId(value: Double): Self = StObject.set(x, "paymentId", value.asInstanceOf[js.Any])
    
    inline def setPaymentIdUndefined: Self = StObject.set(x, "paymentId", js.undefined)
    
    inline def setPreferenceId(value: String): Self = StObject.set(x, "preferenceId", value.asInstanceOf[js.Any])
    
    inline def setPreferenceIdUndefined: Self = StObject.set(x, "preferenceId", js.undefined)
    
    inline def setRedirectMode(value: WalletButtonRedirectMode): Self = StObject.set(x, "redirectMode", value.asInstanceOf[js.Any])
    
    inline def setRedirectModeUndefined: Self = StObject.set(x, "redirectMode", js.undefined)
  }
}
