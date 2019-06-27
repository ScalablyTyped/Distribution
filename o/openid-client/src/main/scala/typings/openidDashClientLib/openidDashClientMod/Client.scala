package typings
package openidDashClientLib.openidDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openid-client", "Client")
@js.native
class Client () extends js.Object {
  def this(metadata: ClientMetadata) = this()
  val metadata: ClientMetadata = js.native
  def authorizationUrl(): java.lang.String = js.native
  def authorizationUrl(parameters: AuthorizationUrlParameters): java.lang.String = js.native
  def callback(redirectUri: java.lang.String, parameters: js.Object): js.Promise[TokenSet] = js.native
  def callback(
    redirectUri: java.lang.String,
    parameters: js.Object,
    checks: openidDashClientLib.Anon_Codeverifier
  ): js.Promise[TokenSet] = js.native
  def callbackParams(input: java.lang.String): js.Object = js.native
  def callbackParams(input: nodeLib.httpMod.IncomingMessage): js.Object = js.native
  def endSessionUrl(): java.lang.String = js.native
  def endSessionUrl(parameters: EndSessionUrlParameters): java.lang.String = js.native
  def grant(body: openidDashClientLib.Anon_Authorizationcode): js.Promise[TokenSet] = js.native
  def introspect(token: java.lang.String): js.Promise[org.scalablytyped.runtime.StringDictionary[js.UndefOr[js.Object | scala.Null]]] = js.native
  def introspect(token: java.lang.String, tokenTypeHint: java.lang.String): js.Promise[org.scalablytyped.runtime.StringDictionary[js.UndefOr[js.Object | scala.Null]]] = js.native
  def introspect(
    token: java.lang.String,
    tokenTypeHint: java.lang.String,
    extras: openidDashClientLib.Anon_IntrospectBody
  ): js.Promise[org.scalablytyped.runtime.StringDictionary[js.UndefOr[js.Object | scala.Null]]] = js.native
  def userinfo(accessToken: java.lang.String): js.Promise[org.scalablytyped.runtime.StringDictionary[js.UndefOr[js.Object | scala.Null]]] = js.native
  def userinfo(accessToken: TokenSet): js.Promise[org.scalablytyped.runtime.StringDictionary[js.UndefOr[js.Object | scala.Null]]] = js.native
}

