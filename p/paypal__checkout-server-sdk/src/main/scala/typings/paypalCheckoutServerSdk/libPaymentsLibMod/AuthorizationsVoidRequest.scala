package typings.paypalCheckoutServerSdk.libPaymentsLibMod

import typings.paypalCheckoutServerSdk.libPaymentsLibMod.AuthorizationsVoid.RequestHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@paypal/checkout-server-sdk/lib/payments/lib", "AuthorizationsVoidRequest")
@js.native
open class AuthorizationsVoidRequest protected () extends BasePaymentRequest[RequestHeaders, Null] {
  def this(authorizationId: String) = this()
}
