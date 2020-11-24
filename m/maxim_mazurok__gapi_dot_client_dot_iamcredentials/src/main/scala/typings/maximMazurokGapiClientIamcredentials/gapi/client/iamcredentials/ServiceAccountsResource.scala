package typings.maximMazurokGapiClientIamcredentials.gapi.client.iamcredentials

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientIamcredentials.anon.Accesstoken
import typings.maximMazurokGapiClientIamcredentials.anon.Alt
import typings.maximMazurokGapiClientIamcredentials.anon.Callback
import typings.maximMazurokGapiClientIamcredentials.anon.Fields
import typings.maximMazurokGapiClientIamcredentials.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceAccountsResource extends js.Object {
  
  /** Generates an OAuth 2.0 access token for a service account. */
  def generateAccessToken(request: Accesstoken): Request[GenerateAccessTokenResponse] = js.native
  def generateAccessToken(request: Alt, body: GenerateAccessTokenRequest): Request[GenerateAccessTokenResponse] = js.native
  
  def generateIdToken(request: Alt, body: GenerateIdTokenRequest): Request[GenerateIdTokenResponse] = js.native
  /** Generates an OpenID Connect ID token for a service account. */
  def generateIdToken(request: Callback): Request[GenerateIdTokenResponse] = js.native
  
  def signBlob(request: Alt, body: SignBlobRequest): Request[SignBlobResponse] = js.native
  /** Signs a blob using a service account's system-managed private key. */
  def signBlob(request: Fields): Request[SignBlobResponse] = js.native
  
  def signJwt(request: Alt, body: SignJwtRequest): Request[SignJwtResponse] = js.native
  /** Signs a JWT using a service account's system-managed private key. */
  def signJwt(request: Key): Request[SignJwtResponse] = js.native
}
