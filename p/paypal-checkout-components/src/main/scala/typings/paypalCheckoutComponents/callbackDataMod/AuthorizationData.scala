package typings.paypalCheckoutComponents.callbackDataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthorizationData extends StObject {
  
  var billingToken: js.UndefOr[String] = js.native
  
  var payerId: String = js.native
  
  var paymentId: js.UndefOr[String] = js.native
  
  var vault: js.UndefOr[Boolean] = js.native
}
object AuthorizationData {
  
  @scala.inline
  def apply(payerId: String): AuthorizationData = {
    val __obj = js.Dynamic.literal(payerId = payerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizationData]
  }
  
  @scala.inline
  implicit class AuthorizationDataMutableBuilder[Self <: AuthorizationData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBillingToken(value: String): Self = StObject.set(x, "billingToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingTokenUndefined: Self = StObject.set(x, "billingToken", js.undefined)
    
    @scala.inline
    def setPayerId(value: String): Self = StObject.set(x, "payerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentId(value: String): Self = StObject.set(x, "paymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentIdUndefined: Self = StObject.set(x, "paymentId", js.undefined)
    
    @scala.inline
    def setVault(value: Boolean): Self = StObject.set(x, "vault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVaultUndefined: Self = StObject.set(x, "vault", js.undefined)
  }
}
