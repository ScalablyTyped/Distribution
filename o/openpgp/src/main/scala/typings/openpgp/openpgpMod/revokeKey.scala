package typings.openpgp.openpgpMod

import typings.openpgp.Anon_PrivateKey
import typings.openpgp.Anon_PublicKey
import typings.openpgp.openpgpMod.key.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "revokeKey")
@js.native
object revokeKey extends js.Object {
  def apply(): js.Promise[Anon_PrivateKey | Anon_PublicKey] = js.native
  def apply(key: Key): js.Promise[Anon_PrivateKey | Anon_PublicKey] = js.native
  def apply(key: Key, revocationCertificate: String): js.Promise[Anon_PrivateKey | Anon_PublicKey] = js.native
  def apply(key: Key, revocationCertificate: String, reasonForRevocation: revokeKey_reasonForRevocation): js.Promise[Anon_PrivateKey | Anon_PublicKey] = js.native
}

