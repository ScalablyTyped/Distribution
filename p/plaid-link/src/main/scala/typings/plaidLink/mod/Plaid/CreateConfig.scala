package typings.plaidLink.mod.Plaid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateConfig extends js.Object {
  
  var clientName: String = js.native
  
  var countryCodes: js.UndefOr[js.Array[Country]] = js.native
  
  var env: Environment = js.native
  
  var isWebView: js.UndefOr[Boolean] = js.native
  
  var key: String = js.native
  
  var language: js.UndefOr[Language] = js.native
  
  var linkCustomizationName: js.UndefOr[String] = js.native
  
  var oauthNonce: js.UndefOr[String] = js.native
  
  var oauthRedirectUri: js.UndefOr[String] = js.native
  
  var oauthStateId: js.UndefOr[String] = js.native
  
  var onEvent: js.UndefOr[OnEvent] = js.native
  
  var onExit: js.UndefOr[OnExit] = js.native
  
  var onLoad: js.UndefOr[OnLoad] = js.native
  
  def onSuccess(public_token: String, metadata: OnSuccessMetaData): Unit = js.native
  @JSName("onSuccess")
  var onSuccess_Original: OnSuccess = js.native
  
  var product: js.Array[Product] = js.native
  
  var token: js.UndefOr[String] = js.native
  
  var userEmailAddress: js.UndefOr[String] = js.native
  
  var userLegalName: js.UndefOr[String] = js.native
  
  var webhook: js.UndefOr[String] = js.native
}
