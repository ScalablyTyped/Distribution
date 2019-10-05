package typings.openpgp.openpgpMod.key

import typings.openpgp.openpgpMod.packet.PublicKey
import typings.openpgp.openpgpMod.packet.PublicSubkey
import typings.openpgp.openpgpMod.packet.SecretKey
import typings.openpgp.openpgpMod.packet.SecretSubkey
import typings.openpgp.openpgpMod.packet.Signature
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "key.isDataRevoked")
@js.native
object isDataRevoked extends js.Object {
  def apply(
    primaryKey: PublicKey,
    dataToVerify: js.Object,
    revocations: js.Array[_],
    signature: Signature,
    key: PublicKey,
    date: Date
  ): js.Promise[Boolean] = js.native
  def apply(
    primaryKey: PublicKey,
    dataToVerify: js.Object,
    revocations: js.Array[_],
    signature: Signature,
    key: PublicSubkey,
    date: Date
  ): js.Promise[Boolean] = js.native
  def apply(
    primaryKey: PublicKey,
    dataToVerify: js.Object,
    revocations: js.Array[_],
    signature: Signature,
    key: SecretKey,
    date: Date
  ): js.Promise[Boolean] = js.native
  def apply(
    primaryKey: PublicKey,
    dataToVerify: js.Object,
    revocations: js.Array[_],
    signature: Signature,
    key: SecretSubkey,
    date: Date
  ): js.Promise[Boolean] = js.native
  def apply(
    primaryKey: SecretKey,
    dataToVerify: js.Object,
    revocations: js.Array[_],
    signature: Signature,
    key: PublicKey,
    date: Date
  ): js.Promise[Boolean] = js.native
  /**
    * Checks if a given certificate or binding signature is revoked
    * @param primaryKey The primary key packet
    * @param dataToVerify The data to check
    * @param revocations The revocation signatures to check
    * @param signature The certificate or signature to check
    * @param key, optional The key packet to check the signature
    * @param date Use the given date instead of the current time
    * @returns True if the signature revokes the data
    */
  def apply(
    primaryKey: SecretKey,
    dataToVerify: js.Object,
    revocations: js.Array[_],
    signature: Signature,
    key: PublicSubkey,
    date: Date
  ): js.Promise[Boolean] = js.native
  def apply(
    primaryKey: SecretKey,
    dataToVerify: js.Object,
    revocations: js.Array[_],
    signature: Signature,
    key: SecretKey,
    date: Date
  ): js.Promise[Boolean] = js.native
  def apply(
    primaryKey: SecretKey,
    dataToVerify: js.Object,
    revocations: js.Array[_],
    signature: Signature,
    key: SecretSubkey,
    date: Date
  ): js.Promise[Boolean] = js.native
}

