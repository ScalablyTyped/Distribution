package typings.openpgp.mod

import typings.openpgp.AnonPrivateKey
import typings.openpgp.AnonPublicKey
import typings.openpgp.mod.key.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "revokeKey")
@js.native
object revokeKey extends js.Object {
  def apply(): js.Promise[AnonPrivateKey | AnonPublicKey] = js.native
  def apply(key: Key): js.Promise[AnonPrivateKey | AnonPublicKey] = js.native
  def apply(key: Key, revocationCertificate: String): js.Promise[AnonPrivateKey | AnonPublicKey] = js.native
  def apply(key: Key, revocationCertificate: String, reasonForRevocation: revokeKeyReasonForRevocation): js.Promise[AnonPrivateKey | AnonPublicKey] = js.native
}

