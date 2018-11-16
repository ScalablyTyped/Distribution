package typings
package oauthLib.oauthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("oauth", "OAuthEcho")
@js.native
class OAuthEcho protected () extends OAuth {
  def this(realm: java.lang.String, verify_credentials: java.lang.String, consumerKey: java.lang.String, consumerSecret: java.lang.String, version: java.lang.String, signatureMethod: java.lang.String) = this()
  def this(realm: java.lang.String, verify_credentials: java.lang.String, consumerKey: java.lang.String, consumerSecret: java.lang.String, version: java.lang.String, signatureMethod: java.lang.String, nonceSize: scala.Double) = this()
  def this(realm: java.lang.String, verify_credentials: java.lang.String, consumerKey: java.lang.String, consumerSecret: java.lang.String, version: java.lang.String, signatureMethod: java.lang.String, nonceSize: scala.Double, customHeaders: nodeLib.httpMod.OutgoingHttpHeaders) = this()
}

