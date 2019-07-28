package typings.openidDashClient.openidDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openid-client", "generators")
@js.native
object generatorsNs extends js.Object {
  def codeChallenge(verifier: String): String = js.native
  def codeVerifier(): String = js.native
  def codeVerifier(bytes: Double): String = js.native
  def nonce(): String = js.native
  def nonce(bytes: Double): String = js.native
  // https://github.com/panva/node-openid-client/tree/master/docs#generators
  def random(): String = js.native
  def random(bytes: Double): String = js.native
  def state(): String = js.native
  def state(bytes: Double): String = js.native
}

