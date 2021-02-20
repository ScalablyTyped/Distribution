package typings.paypalRestSdk.mod

import typings.node.httpMod.RequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object refund {
  
  @JSImport("paypal-rest-sdk", "refund.get")
  @js.native
  def get(id: String, config: RequestOptions): Unit = js.native
  @JSImport("paypal-rest-sdk", "refund.get")
  @js.native
  def get(id: String, config: RequestOptions, cb: CallbackFunction[RefundResource]): Unit = js.native
  @JSImport("paypal-rest-sdk", "refund.get")
  @js.native
  def get(id: String, config: CallbackFunction[RefundResource]): Unit = js.native
  @JSImport("paypal-rest-sdk", "refund.get")
  @js.native
  def get(id: String, config: CallbackFunction[RefundResource], cb: CallbackFunction[RefundResource]): Unit = js.native
}
