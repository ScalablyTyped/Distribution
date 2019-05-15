package typings
package openidDashClientLib.openidDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openid-client", "generators")
@js.native
object generatorsNs extends js.Object {
  def codeChallenge(verifier: java.lang.String): java.lang.String = js.native
  def codeVerifier(): java.lang.String = js.native
  def codeVerifier(bytes: scala.Double): java.lang.String = js.native
  def nonce(): java.lang.String = js.native
  def nonce(bytes: scala.Double): java.lang.String = js.native
  // https://github.com/panva/node-openid-client/tree/master/docs#generators
  def random(): java.lang.String = js.native
  def random(bytes: scala.Double): java.lang.String = js.native
  def state(): java.lang.String = js.native
  def state(bytes: scala.Double): java.lang.String = js.native
}

