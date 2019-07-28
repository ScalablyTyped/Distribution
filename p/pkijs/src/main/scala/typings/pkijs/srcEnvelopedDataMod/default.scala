package typings.pkijs.srcEnvelopedDataMod

import typings.pkijs.Anon_HmacHashAlgorithm
import typings.pkijs.Anon_KdfAlgorithm
import typings.pkijs.Anon_RecipientCertificate
import typings.std.Algorithm
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/EnvelopedData", JSImport.Default)
@js.native
class default () extends EnvelopedData {
  def this(params: js.Any) = this()
  /* CompleteClass */
  override var encryptedContentInfo: typings.pkijs.srcEncryptedContentInfoMod.default = js.native
  /* CompleteClass */
  override var recipientInfos: js.Array[typings.pkijs.srcRecipientInfoMod.default] = js.native
  /* CompleteClass */
  override var version: Double = js.native
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
    certificate: typings.pkijs.srcCertificateMod.default,
    parameters: Anon_KdfAlgorithm,
    variant: Double
  ): Boolean = js.native
  /**
    * Add recipient based on pre-defined data like password or KEK
    * @param {ArrayBuffer} preDefinedData ArrayBuffer with pre-defined data
    * @param {*} parameters Additional parameters neccessary for "fine tunning" of encryption process
    * @param {number} variant Variant = 1 for pre-defined "key encryption key" (KEK). Variant = 2 for password-based encryption.
    */
  /* CompleteClass */
  override def addRecipientByPreDefinedData(preDefinedData: ArrayBuffer, parameters: Anon_HmacHashAlgorithm, variant: Double): Boolean = js.native
  /**
    * Decrypt existing CMS Enveloped Data content
    * @param {number} recipientIndex Index of recipient
    * @param {*} parameters Additional parameters
    * @returns {Promise}
    */
  /* CompleteClass */
  override def decrypt(recipientIndex: Double, parameters: Anon_RecipientCertificate): js.Thenable[ArrayBuffer] = js.native
  /**
    * Create a new CMS Enveloped Data content with encrypted data
    * @param {Algorithm} contentEncryptionAlgorithm WebCrypto algorithm. For the moment here could be only "AES-CBC" or "AES-GCM" algorithms.
    * @param {ArrayBuffer} contentToEncrypt Content to encrypt
    * @returns {Promise}
    */
  /* CompleteClass */
  override def encrypt(contentEncryptionAlgorithm: Algorithm, contentToEncrypt: ArrayBuffer): js.Thenable[ArrayBuffer] = js.native
  /* CompleteClass */
  override def fromSchema(schema: js.Any): Unit = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
  /* CompleteClass */
  override def toSchema(): js.Any = js.native
}

/* static members */
@JSImport("pkijs/src/EnvelopedData", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * Compare values with default values for all class members
    * @param {string} memberName String name for a class member
    * @param {*} memberValue Value to compare with default value
    */
  def compareWithDefault(memberName: String, memberValue: js.Any): Boolean = js.native
  def defaultValues(memberName: String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}

