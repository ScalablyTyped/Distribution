package typings
package pkijsLib.srcEnvelopedDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/EnvelopedData", JSImport.Default)
@js.native
class default () extends EnvelopedData {
  def this(params: js.Any) = this()
  /* CompleteClass */
  override var encryptedContentInfo: pkijsLib.srcEncryptedContentInfoMod.default = js.native
  /* CompleteClass */
  override var recipientInfos: js.Array[pkijsLib.srcRecipientInfoMod.default] = js.native
  /* CompleteClass */
  override var version: scala.Double = js.native
  /**
           * Helpers function for filling "RecipientInfo" based on recipient's certificate.
           * Problem with WebCrypto is that for RSA certificates we have only one option - "key transport" and
           * for ECC certificates we also have one option - "key agreement". As soon as Google will implement
           * DH algorithm it would be possible to use "key agreement" also for RSA certificates.
           * @param {Certificate} [certificate] Recipient's certificate
           * @param {*} [parameters] Additional parameters neccessary for "fine tunning" of encryption process
           * @param {number} [variant] Variant = 1 is for "key transport", variant = 2 is for "key agreement". In fact the "variant" is unneccessary now because Google has no DH algorithm implementation. Thus key encryption scheme would be choosen by certificate type only: "key transport" for RSA and "key agreement" for ECC certificates.
           */
  /* CompleteClass */
  override def addRecipientByCertificate(
    certificate: pkijsLib.srcCertificateMod.default,
    parameters: pkijsLib.Anon_KekEncryptionLength,
    variant: scala.Double
  ): scala.Boolean = js.native
  /**
           * Add recipient based on pre-defined data like password or KEK
           * @param {ArrayBuffer} preDefinedData ArrayBuffer with pre-defined data
           * @param {*} parameters Additional parameters neccessary for "fine tunning" of encryption process
           * @param {number} variant Variant = 1 for pre-defined "key encryption key" (KEK). Variant = 2 for password-based encryption.
           */
  /* CompleteClass */
  override def addRecipientByPreDefinedData(
    preDefinedData: stdLib.ArrayBuffer,
    parameters: pkijsLib.Anon_KeyEncryptionAlgorithmParams,
    variant: scala.Double
  ): scala.Boolean = js.native
  /**
           * Decrypt existing CMS Enveloped Data content
           * @param {number} recipientIndex Index of recipient
           * @param {*} parameters Additional parameters
           * @returns {Promise}
           */
  /* CompleteClass */
  override def decrypt(recipientIndex: scala.Double, parameters: pkijsLib.Anon_RecipientPrivateKey): stdLib.PromiseLike[stdLib.ArrayBuffer] = js.native
  /**
           * Create a new CMS Enveloped Data content with encrypted data
           * @param {Algorithm} contentEncryptionAlgorithm WebCrypto algorithm. For the moment here could be only "AES-CBC" or "AES-GCM" algorithms.
           * @param {ArrayBuffer} contentToEncrypt Content to encrypt
           * @returns {Promise}
           */
  /* CompleteClass */
  override def encrypt(contentEncryptionAlgorithm: stdLib.Algorithm, contentToEncrypt: stdLib.ArrayBuffer): stdLib.PromiseLike[stdLib.ArrayBuffer] = js.native
  /* CompleteClass */
  override def fromSchema(schema: js.Any): scala.Unit = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
  /* CompleteClass */
  override def toSchema(): js.Any = js.native
}

@JSImport("pkijs/src/EnvelopedData", JSImport.Default)
@js.native
object default extends js.Object {
  /**
           * Compare values with default values for all class members
           * @param {string} memberName String name for a class member
           * @param {*} memberValue Value to compare with default value
           */
  def compareWithDefault(memberName: java.lang.String, memberValue: js.Any): scala.Boolean = js.native
  def defaultValues(memberName: java.lang.String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}

