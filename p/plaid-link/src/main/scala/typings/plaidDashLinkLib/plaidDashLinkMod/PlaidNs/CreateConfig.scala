package typings
package plaidDashLinkLib.plaidDashLinkMod.PlaidNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateConfig extends js.Object {
  var clientName: java.lang.String = js.native
  var env: Environment = js.native
  var isWebView: js.UndefOr[scala.Boolean] = js.native
  var key: java.lang.String = js.native
  var language: js.UndefOr[Language] = js.native
  var onEvent: js.UndefOr[OnEvent] = js.native
  var onExit: js.UndefOr[OnExit] = js.native
  var onLoad: js.UndefOr[OnLoad] = js.native
  @JSName("onSuccess")
  var onSuccess_Original: OnSuccess = js.native
  var product: js.Array[Product] = js.native
  var token: js.UndefOr[java.lang.String] = js.native
  var user: js.UndefOr[User] = js.native
  def onSuccess(public_token: java.lang.String, metadata: OnSuccessMetaData): scala.Unit = js.native
}

