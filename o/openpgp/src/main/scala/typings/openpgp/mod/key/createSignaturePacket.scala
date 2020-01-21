package typings.openpgp.mod.key

import typings.openpgp.mod.packet.SecretKey
import typings.openpgp.mod.packet.SecretSubkey
import typings.openpgp.mod.packet.Signature
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "key.createSignaturePacket")
@js.native
object createSignaturePacket extends js.Object {
  /**
    * Create signature packet
    * @param dataToSign Contains packets to be signed
    * @param signingKeyPacket secret key packet for signing
    * @param signatureProperties (optional) properties to write on the signature packet before signing
    * @param date (optional) override the creationtime of the signature
    * @param userId (optional) user ID
    * @returns signature packet
    */
  def apply(
    dataToSign: js.Object,
    signingKeyPacket: SecretKey,
    signatureProperties: js.Object,
    date: Date,
    userId: js.Object
  ): Signature = js.native
  def apply(
    dataToSign: js.Object,
    signingKeyPacket: SecretSubkey,
    signatureProperties: js.Object,
    date: Date,
    userId: js.Object
  ): Signature = js.native
}

