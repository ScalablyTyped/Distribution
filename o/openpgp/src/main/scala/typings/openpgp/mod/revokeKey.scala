package typings.openpgp.mod

import typings.openpgp.anon.PrivateKey
import typings.openpgp.anon.PublicKey
import typings.openpgp.mod.key.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "revokeKey")
@js.native
object revokeKey extends js.Object {
  def apply(): js.Promise[PrivateKey | PublicKey] = js.native
  def apply(key: Key): js.Promise[PrivateKey | PublicKey] = js.native
  def apply(key: Key, revocationCertificate: String): js.Promise[PrivateKey | PublicKey] = js.native
  def apply(key: Key, revocationCertificate: String, reasonForRevocation: revokeKeyReasonForRevocation): js.Promise[PrivateKey | PublicKey] = js.native
}

