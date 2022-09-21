package typings.paypalCheckoutServerSdk.paymentsLibMod

import typings.paypalCheckoutServerSdk.paypalCheckoutServerSdkStrings.CONNECT
import typings.paypalCheckoutServerSdk.paypalCheckoutServerSdkStrings.DELETE
import typings.paypalCheckoutServerSdk.paypalCheckoutServerSdkStrings.GET
import typings.paypalCheckoutServerSdk.paypalCheckoutServerSdkStrings.HEAD
import typings.paypalCheckoutServerSdk.paypalCheckoutServerSdkStrings.OPTIONS
import typings.paypalCheckoutServerSdk.paypalCheckoutServerSdkStrings.PATCH
import typings.paypalCheckoutServerSdk.paypalCheckoutServerSdkStrings.POST
import typings.paypalCheckoutServerSdk.paypalCheckoutServerSdkStrings.PUT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@paypal/checkout-server-sdk/lib/payments/lib", "BasePaymentRequest")
@js.native
open class BasePaymentRequest[H /* <: BasePaymentHeaders */, D] protected () extends StObject {
  def this(authorizationId: String) = this()
  
  val body: D = js.native
  
  val headers: H = js.native
  
  val path: String = js.native
  
  val verb: CONNECT | DELETE | GET | HEAD | OPTIONS | PATCH | POST | PUT = js.native
}
