package typings.paypalCheckoutServerSdk.paymentsLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TaxIdType extends StObject
@JSImport("@paypal/checkout-server-sdk/lib/payments/lib", "TaxIdType")
@js.native
object TaxIdType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TaxIdType & String] = js.native
  
  @js.native
  sealed trait BR_CNPJ
    extends StObject
       with TaxIdType
  /* "BR_CNPJ" */ val BR_CNPJ: typings.paypalCheckoutServerSdk.paymentsLibMod.TaxIdType.BR_CNPJ & String = js.native
  
  @js.native
  sealed trait BR_CPF
    extends StObject
       with TaxIdType
  /* "BR_CPF" */ val BR_CPF: typings.paypalCheckoutServerSdk.paymentsLibMod.TaxIdType.BR_CPF & String = js.native
}
