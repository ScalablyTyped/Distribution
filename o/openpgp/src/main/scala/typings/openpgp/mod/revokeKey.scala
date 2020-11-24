package typings.openpgp.mod

import typings.openpgp.anon.PrivateKey
import typings.openpgp.anon.PublicKey
import typings.openpgp.mod.key.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openpgp", "revokeKey")
@js.native
object revokeKey extends js.Object {
  
  def apply(): js.Promise[PrivateKey | PublicKey] = js.native
  def apply(
    key: js.UndefOr[scala.Nothing],
    revocationCertificate: js.UndefOr[scala.Nothing],
    reasonForRevocation: revokeKeyReasonForRevocation
  ): js.Promise[PrivateKey | PublicKey] = js.native
  def apply(key: js.UndefOr[scala.Nothing], revocationCertificate: String): js.Promise[PrivateKey | PublicKey] = js.native
  def apply(
    key: js.UndefOr[scala.Nothing],
    revocationCertificate: String,
    reasonForRevocation: revokeKeyReasonForRevocation
  ): js.Promise[PrivateKey | PublicKey] = js.native
  def apply(key: Key): js.Promise[PrivateKey | PublicKey] = js.native
  def apply(
    key: Key,
    revocationCertificate: js.UndefOr[scala.Nothing],
    reasonForRevocation: revokeKeyReasonForRevocation
  ): js.Promise[PrivateKey | PublicKey] = js.native
  def apply(key: Key, revocationCertificate: String): js.Promise[PrivateKey | PublicKey] = js.native
  def apply(key: Key, revocationCertificate: String, reasonForRevocation: revokeKeyReasonForRevocation): js.Promise[PrivateKey | PublicKey] = js.native
}
