package typings
package pkijsLib.srcEnvelopedDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnvelopedData extends js.Object {
  var encryptedContentInfo: pkijsLib.srcEncryptedContentInfoMod.default
  var originatorInfo: js.UndefOr[pkijsLib.srcOriginatorInfoMod.default] = js.undefined
  var recipientInfos: js.Array[pkijsLib.srcRecipientInfoMod.default]
  var unprotectedAttrs: js.UndefOr[js.Array[pkijsLib.srcAttributeMod.default]] = js.undefined
  var version: scala.Double
  /**
    * Helpers function for filling "RecipientInfo" based on recipient's certificate.
    * Problem with WebCrypto is that for RSA certificates we have only one option - "key transport" and
    * for ECC certificates we also have one option - "key agreement". As soon as Google will implement
    * DH algorithm it would be possible to use "key agreement" also for RSA certificates.
    * @param {Certificate} [certificate] Recipient's certificate
    * @param {*} [parameters] Additional parameters neccessary for "fine tunning" of encryption process
    * @param {number} [variant] Variant = 1 is for "key transport", variant = 2 is for "key agreement". In fact the "variant" is unneccessary now because Google has no DH algorithm implementation. Thus key encryption scheme would be choosen by certificate type only: "key transport" for RSA and "key agreement" for ECC certificates.
    */
  def addRecipientByCertificate(
    certificate: pkijsLib.srcCertificateMod.default,
    parameters: pkijsLib.Anon_KdfAlgorithm,
    variant: scala.Double
  ): scala.Boolean
  /**
    * Add recipient based on pre-defined data like password or KEK
    * @param {ArrayBuffer} preDefinedData ArrayBuffer with pre-defined data
    * @param {*} parameters Additional parameters neccessary for "fine tunning" of encryption process
    * @param {number} variant Variant = 1 for pre-defined "key encryption key" (KEK). Variant = 2 for password-based encryption.
    */
  def addRecipientByPreDefinedData(
    preDefinedData: stdLib.ArrayBuffer,
    parameters: pkijsLib.Anon_HmacHashAlgorithm,
    variant: scala.Double
  ): scala.Boolean
  /**
    * Decrypt existing CMS Enveloped Data content
    * @param {number} recipientIndex Index of recipient
    * @param {*} parameters Additional parameters
    * @returns {Promise}
    */
  def decrypt(recipientIndex: scala.Double, parameters: pkijsLib.Anon_RecipientCertificate): js.Thenable[stdLib.ArrayBuffer]
  /**
    * Create a new CMS Enveloped Data content with encrypted data
    * @param {Algorithm} contentEncryptionAlgorithm WebCrypto algorithm. For the moment here could be only "AES-CBC" or "AES-GCM" algorithms.
    * @param {ArrayBuffer} contentToEncrypt Content to encrypt
    * @returns {Promise}
    */
  def encrypt(contentEncryptionAlgorithm: stdLib.Algorithm, contentToEncrypt: stdLib.ArrayBuffer): js.Thenable[stdLib.ArrayBuffer]
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object EnvelopedData {
  @scala.inline
  def apply(
    addRecipientByCertificate: (pkijsLib.srcCertificateMod.default, pkijsLib.Anon_KdfAlgorithm, scala.Double) => scala.Boolean,
    addRecipientByPreDefinedData: (stdLib.ArrayBuffer, pkijsLib.Anon_HmacHashAlgorithm, scala.Double) => scala.Boolean,
    decrypt: (scala.Double, pkijsLib.Anon_RecipientCertificate) => js.Thenable[stdLib.ArrayBuffer],
    encrypt: (stdLib.Algorithm, stdLib.ArrayBuffer) => js.Thenable[stdLib.ArrayBuffer],
    encryptedContentInfo: pkijsLib.srcEncryptedContentInfoMod.default,
    fromSchema: js.Any => scala.Unit,
    recipientInfos: js.Array[pkijsLib.srcRecipientInfoMod.default],
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    version: scala.Double,
    originatorInfo: pkijsLib.srcOriginatorInfoMod.default = null,
    unprotectedAttrs: js.Array[pkijsLib.srcAttributeMod.default] = null
  ): EnvelopedData = {
    val __obj = js.Dynamic.literal(addRecipientByCertificate = js.Any.fromFunction3(addRecipientByCertificate), addRecipientByPreDefinedData = js.Any.fromFunction3(addRecipientByPreDefinedData), decrypt = js.Any.fromFunction2(decrypt), encrypt = js.Any.fromFunction2(encrypt), encryptedContentInfo = encryptedContentInfo, fromSchema = js.Any.fromFunction1(fromSchema), recipientInfos = recipientInfos, toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), version = version)
    if (originatorInfo != null) __obj.updateDynamic("originatorInfo")(originatorInfo)
    if (unprotectedAttrs != null) __obj.updateDynamic("unprotectedAttrs")(unprotectedAttrs)
    __obj.asInstanceOf[EnvelopedData]
  }
}

