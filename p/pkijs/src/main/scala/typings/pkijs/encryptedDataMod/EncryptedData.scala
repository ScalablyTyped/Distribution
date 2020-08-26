package typings.pkijs.encryptedDataMod

import typings.pkijs.anon.ContentEncryptionAlgorithm
import typings.pkijs.anon.Password
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncryptedData extends js.Object {
  var encryptedContentInfo: typings.pkijs.encryptedContentInfoMod.default = js.native
  var unprotectedAttrs: js.Array[typings.pkijs.attributeMod.default] = js.native
  var version: Double = js.native
  /**
    * Create a new CMS Encrypted Data content
    * @param {*} parameters Parameters neccessary for encryption
    */
  def decrypt(parameters: Password): js.Thenable[ArrayBuffer] = js.native
  /**
    * Create a new CMS Encrypted Data content
    * @param {*} parameters Parameters neccessary for encryption
    * @returns {Promise}
    */
  def encrypt(parameters: ContentEncryptionAlgorithm): js.Thenable[ArrayBuffer] = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

object EncryptedData {
  @scala.inline
  def apply(
    decrypt: Password => js.Thenable[ArrayBuffer],
    encrypt: ContentEncryptionAlgorithm => js.Thenable[ArrayBuffer],
    encryptedContentInfo: typings.pkijs.encryptedContentInfoMod.default,
    fromSchema: js.Any => Unit,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    unprotectedAttrs: js.Array[typings.pkijs.attributeMod.default],
    version: Double
  ): EncryptedData = {
    val __obj = js.Dynamic.literal(decrypt = js.Any.fromFunction1(decrypt), encrypt = js.Any.fromFunction1(encrypt), encryptedContentInfo = encryptedContentInfo.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), unprotectedAttrs = unprotectedAttrs.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptedData]
  }
  @scala.inline
  implicit class EncryptedDataOps[Self <: EncryptedData] (val x: Self) extends AnyVal {
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
    def setDecrypt(value: Password => js.Thenable[ArrayBuffer]): Self = this.set("decrypt", js.Any.fromFunction1(value))
    @scala.inline
    def setEncrypt(value: ContentEncryptionAlgorithm => js.Thenable[ArrayBuffer]): Self = this.set("encrypt", js.Any.fromFunction1(value))
    @scala.inline
    def setEncryptedContentInfo(value: typings.pkijs.encryptedContentInfoMod.default): Self = this.set("encryptedContentInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setFromSchema(value: js.Any => Unit): Self = this.set("fromSchema", js.Any.fromFunction1(value))
    @scala.inline
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
    @scala.inline
    def setToSchema(value: () => js.Any): Self = this.set("toSchema", js.Any.fromFunction0(value))
    @scala.inline
    def setUnprotectedAttrsVarargs(value: typings.pkijs.attributeMod.default*): Self = this.set("unprotectedAttrs", js.Array(value :_*))
    @scala.inline
    def setUnprotectedAttrs(value: js.Array[typings.pkijs.attributeMod.default]): Self = this.set("unprotectedAttrs", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

