package typings.pkijs.encryptedDataMod

import typings.pkijs.anon.ContentEncryptionAlgorithm
import typings.pkijs.anon.Password
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptedData extends js.Object {
  var encryptedContentInfo: typings.pkijs.encryptedContentInfoMod.default
  var unprotectedAttrs: js.Array[typings.pkijs.attributeMod.default]
  var version: Double
  /**
    * Create a new CMS Encrypted Data content
    * @param {*} parameters Parameters neccessary for encryption
    */
  def decrypt(parameters: Password): js.Thenable[ArrayBuffer]
  /**
    * Create a new CMS Encrypted Data content
    * @param {*} parameters Parameters neccessary for encryption
    * @returns {Promise}
    */
  def encrypt(parameters: ContentEncryptionAlgorithm): js.Thenable[ArrayBuffer]
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
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
}

