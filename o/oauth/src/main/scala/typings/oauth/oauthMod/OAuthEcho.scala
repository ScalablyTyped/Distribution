package typings.oauth.oauthMod

import typings.node.httpMod.OutgoingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("oauth", "OAuthEcho")
@js.native
class OAuthEcho protected () extends OAuth {
  def this(
    realm: String,
    verify_credentials: String,
    consumerKey: String,
    consumerSecret: String,
    version: String,
    signatureMethod: String
  ) = this()
  def this(
    realm: String,
    verify_credentials: String,
    consumerKey: String,
    consumerSecret: String,
    version: String,
    signatureMethod: String,
    nonceSize: Double
  ) = this()
  def this(
    realm: String,
    verify_credentials: String,
    consumerKey: String,
    consumerSecret: String,
    version: String,
    signatureMethod: String,
    nonceSize: Double,
    customHeaders: OutgoingHttpHeaders
  ) = this()
}

