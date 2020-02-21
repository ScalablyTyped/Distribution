package typings.nodeForge.mod.pki

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "pki.publicKeyToRSAPublicKeyPem")
@js.native
object publicKeyToRSAPublicKeyPem extends js.Object {
  def apply(key: PublicKey): PEM = js.native
  def apply(key: PublicKey, maxline: Double): PEM = js.native
}

