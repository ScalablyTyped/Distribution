package typings.pemDashJwk.pemDashJwkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pem-jwk", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def jwk2pem(rsa_jwk: RSA_JWK): String = js.native
  def pem2jwk(rsa_pem: String): RSA_JWK = js.native
}

