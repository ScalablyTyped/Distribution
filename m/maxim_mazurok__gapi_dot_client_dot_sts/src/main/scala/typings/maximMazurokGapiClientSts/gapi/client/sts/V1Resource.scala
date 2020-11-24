package typings.maximMazurokGapiClientSts.gapi.client.sts

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientSts.anon.Accesstoken
import typings.maximMazurokGapiClientSts.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait V1Resource extends js.Object {
  
  /** Exchanges a credential for a Google OAuth 2.0 access token. */
  def token(request: Accesstoken): Request[GoogleIdentityStsV1ExchangeTokenResponse] = js.native
  def token(request: Alt, body: GoogleIdentityStsV1ExchangeTokenRequest): Request[GoogleIdentityStsV1ExchangeTokenResponse] = js.native
}
