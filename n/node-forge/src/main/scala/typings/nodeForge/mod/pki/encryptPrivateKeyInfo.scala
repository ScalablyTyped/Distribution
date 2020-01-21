package typings.nodeForge.mod.pki

import typings.nodeForge.mod.asn1.Asn1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "pki.encryptPrivateKeyInfo")
@js.native
object encryptPrivateKeyInfo extends js.Object {
  def apply(obj: Asn1, password: String): Asn1 = js.native
  def apply(obj: Asn1, password: String, options: EncryptionOptions): Asn1 = js.native
}

