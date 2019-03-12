package typings
package pkijsLib.srcEncryptedDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptedData extends js.Object {
  var encryptedContentInfo: pkijsLib.srcEncryptedContentInfoMod.default
  var unprotectedAttrs: js.Array[pkijsLib.srcAttributeMod.default]
  var version: scala.Double
  /**
    * Create a new CMS Encrypted Data content
    * @param {*} parameters Parameters neccessary for encryption
    */
  def decrypt(parameters: pkijsLib.Anon_Password): js.Thenable[stdLib.ArrayBuffer]
  /**
    * Create a new CMS Encrypted Data content
    * @param {*} parameters Parameters neccessary for encryption
    * @returns {Promise}
    */
  def encrypt(parameters: pkijsLib.Anon_ContentEncryptionAlgorithm): js.Thenable[stdLib.ArrayBuffer]
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object EncryptedData {
  @scala.inline
  def apply(
    decrypt: pkijsLib.Anon_Password => js.Thenable[stdLib.ArrayBuffer],
    encrypt: pkijsLib.Anon_ContentEncryptionAlgorithm => js.Thenable[stdLib.ArrayBuffer],
    encryptedContentInfo: pkijsLib.srcEncryptedContentInfoMod.default,
    fromSchema: js.Any => scala.Unit,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    unprotectedAttrs: js.Array[pkijsLib.srcAttributeMod.default],
    version: scala.Double
  ): EncryptedData = {
    val __obj = js.Dynamic.literal(decrypt = js.Any.fromFunction1(decrypt), encrypt = js.Any.fromFunction1(encrypt), encryptedContentInfo = encryptedContentInfo, fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), unprotectedAttrs = unprotectedAttrs, version = version)
  
    __obj.asInstanceOf[EncryptedData]
  }
}

