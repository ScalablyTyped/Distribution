package typings.nodeDashForge.nodeDashForgeMod.pki

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "pki.encryptRsaPrivateKey")
@js.native
object encryptRsaPrivateKey extends js.Object {
  def apply(privateKey: PrivateKey, password: String): PEM = js.native
  def apply(privateKey: PrivateKey, password: String, options: EncryptionOptions): PEM = js.native
}

