package typings.pkijs.envelopedDataMod

import typings.pkijs.anon.HmacHashAlgorithm
import typings.pkijs.anon.KdfAlgorithm
import typings.pkijs.anon.RecipientCertificate
import typings.std.Algorithm
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnvelopedData extends js.Object {
  var encryptedContentInfo: typings.pkijs.encryptedContentInfoMod.default = js.native
  var originatorInfo: js.UndefOr[typings.pkijs.originatorInfoMod.default] = js.native
  var recipientInfos: js.Array[typings.pkijs.recipientInfoMod.default] = js.native
  var unprotectedAttrs: js.UndefOr[js.Array[typings.pkijs.attributeMod.default]] = js.native
  var version: Double = js.native
  /**
    * Helpers function for filling "RecipientInfo" based on recipient's certificate.
    * Problem with WebCrypto is that for RSA certificates we have only one option - "key transport" and
    * for ECC certificates we also have one option - "key agreement". As soon as Google will implement
    * DH algorithm it would be possible to use "key agreement" also for RSA certificates.
    * @param {Certificate} [certificate] Recipient's certificate
    * @param {*} [parameters] Additional parameters neccessary for "fine tunning" of encryption process
    * @param {number} [variant] Variant = 1 is for "key transport", variant = 2 is for "key agreement". In fact the "variant" is unneccessary now because Google has no DH algorithm implementation. Thus key encryption scheme would be choosen by certificate type only: "key transport" for RSA and "key agreement" for ECC certificates.
    */
  def addRecipientByCertificate(certificate: typings.pkijs.certificateMod.default, parameters: KdfAlgorithm, variant: Double): Boolean = js.native
  /**
    * Add recipient based on pre-defined data like password or KEK
    * @param {ArrayBuffer} preDefinedData ArrayBuffer with pre-defined data
    * @param {*} parameters Additional parameters neccessary for "fine tunning" of encryption process
    * @param {number} variant Variant = 1 for pre-defined "key encryption key" (KEK). Variant = 2 for password-based encryption.
    */
  def addRecipientByPreDefinedData(preDefinedData: ArrayBuffer, parameters: HmacHashAlgorithm, variant: Double): Boolean = js.native
  /**
    * Decrypt existing CMS Enveloped Data content
    * @param {number} recipientIndex Index of recipient
    * @param {*} parameters Additional parameters
    * @returns {Promise}
    */
  def decrypt(recipientIndex: Double, parameters: RecipientCertificate): js.Thenable[ArrayBuffer] = js.native
  /**
    * Create a new CMS Enveloped Data content with encrypted data
    * @param {Algorithm} contentEncryptionAlgorithm WebCrypto algorithm. For the moment here could be only "AES-CBC" or "AES-GCM" algorithms.
    * @param {ArrayBuffer} contentToEncrypt Content to encrypt
    * @returns {Promise}
    */
  def encrypt(contentEncryptionAlgorithm: Algorithm, contentToEncrypt: ArrayBuffer): js.Thenable[ArrayBuffer] = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

object EnvelopedData {
  @scala.inline
  def apply(
    addRecipientByCertificate: (typings.pkijs.certificateMod.default, KdfAlgorithm, Double) => Boolean,
    addRecipientByPreDefinedData: (ArrayBuffer, HmacHashAlgorithm, Double) => Boolean,
    decrypt: (Double, RecipientCertificate) => js.Thenable[ArrayBuffer],
    encrypt: (Algorithm, ArrayBuffer) => js.Thenable[ArrayBuffer],
    encryptedContentInfo: typings.pkijs.encryptedContentInfoMod.default,
    fromSchema: js.Any => Unit,
    recipientInfos: js.Array[typings.pkijs.recipientInfoMod.default],
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    version: Double
  ): EnvelopedData = {
    val __obj = js.Dynamic.literal(addRecipientByCertificate = js.Any.fromFunction3(addRecipientByCertificate), addRecipientByPreDefinedData = js.Any.fromFunction3(addRecipientByPreDefinedData), decrypt = js.Any.fromFunction2(decrypt), encrypt = js.Any.fromFunction2(encrypt), encryptedContentInfo = encryptedContentInfo.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), recipientInfos = recipientInfos.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvelopedData]
  }
  @scala.inline
  implicit class EnvelopedDataOps[Self <: EnvelopedData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddRecipientByCertificate(value: (typings.pkijs.certificateMod.default, KdfAlgorithm, Double) => Boolean): Self = this.set("addRecipientByCertificate", js.Any.fromFunction3(value))
    @scala.inline
    def setAddRecipientByPreDefinedData(value: (ArrayBuffer, HmacHashAlgorithm, Double) => Boolean): Self = this.set("addRecipientByPreDefinedData", js.Any.fromFunction3(value))
    @scala.inline
    def setDecrypt(value: (Double, RecipientCertificate) => js.Thenable[ArrayBuffer]): Self = this.set("decrypt", js.Any.fromFunction2(value))
    @scala.inline
    def setEncrypt(value: (Algorithm, ArrayBuffer) => js.Thenable[ArrayBuffer]): Self = this.set("encrypt", js.Any.fromFunction2(value))
    @scala.inline
    def setEncryptedContentInfo(value: typings.pkijs.encryptedContentInfoMod.default): Self = this.set("encryptedContentInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setFromSchema(value: js.Any => Unit): Self = this.set("fromSchema", js.Any.fromFunction1(value))
    @scala.inline
    def setRecipientInfosVarargs(value: typings.pkijs.recipientInfoMod.default*): Self = this.set("recipientInfos", js.Array(value :_*))
    @scala.inline
    def setRecipientInfos(value: js.Array[typings.pkijs.recipientInfoMod.default]): Self = this.set("recipientInfos", value.asInstanceOf[js.Any])
    @scala.inline
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
    @scala.inline
    def setToSchema(value: () => js.Any): Self = this.set("toSchema", js.Any.fromFunction0(value))
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginatorInfo(value: typings.pkijs.originatorInfoMod.default): Self = this.set("originatorInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginatorInfo: Self = this.set("originatorInfo", js.undefined)
    @scala.inline
    def setUnprotectedAttrsVarargs(value: typings.pkijs.attributeMod.default*): Self = this.set("unprotectedAttrs", js.Array(value :_*))
    @scala.inline
    def setUnprotectedAttrs(value: js.Array[typings.pkijs.attributeMod.default]): Self = this.set("unprotectedAttrs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnprotectedAttrs: Self = this.set("unprotectedAttrs", js.undefined)
  }
  
}

