package typings.openidDashClient.openidDashClientMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.httpMod.IncomingMessage
import typings.openidDashClient.Anon_Authorizationcode
import typings.openidDashClient.Anon_Codeverifier
import typings.openidDashClient.Anon_IntrospectBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openid-client", "Client")
@js.native
class Client () extends js.Object {
  def this(metadata: ClientMetadata) = this()
  val metadata: ClientMetadata = js.native
  var static: js.Any = js.native
  def authorizationUrl(): String = js.native
  def authorizationUrl(parameters: AuthorizationUrlParameters): String = js.native
  def callback(redirectUri: String, parameters: js.Object): js.Promise[TokenSet] = js.native
  def callback(redirectUri: String, parameters: js.Object, checks: Anon_Codeverifier): js.Promise[TokenSet] = js.native
  def callbackParams(input: String): js.Object = js.native
  def callbackParams(input: IncomingMessage): js.Object = js.native
  def endSessionUrl(): String = js.native
  def endSessionUrl(parameters: EndSessionUrlParameters): String = js.native
  def grant(body: Anon_Authorizationcode): js.Promise[TokenSet] = js.native
  def introspect(token: String): js.Promise[IntrospectionResponse] = js.native
  def introspect(token: String, tokenTypeHint: String): js.Promise[IntrospectionResponse] = js.native
  def introspect(token: String, tokenTypeHint: String, extras: Anon_IntrospectBody): js.Promise[IntrospectionResponse] = js.native
  /**
    * Revokes a token at the Authorization Server's `revocation_endpoint`.
    *
    * @param token Token to revoke
    * @param tokenTypeHint Hint the Authorization Server as to the token type
    * @param extras Additional revoke options
    */
  def revoke(token: String, tokenTypeHint: String): js.Promise[Unit] = js.native
  def revoke(token: String, tokenTypeHint: String, extras: RevokeRequestOptions): js.Promise[Unit] = js.native
  def userinfo(accessToken: String): js.Promise[StringDictionary[js.UndefOr[js.Object | Null]]] = js.native
  def userinfo(accessToken: TokenSet): js.Promise[StringDictionary[js.UndefOr[js.Object | Null]]] = js.native
}

