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
    decrypt: js.Function1[pkijsLib.Anon_Password, js.Thenable[stdLib.ArrayBuffer]],
    encrypt: js.Function1[pkijsLib.Anon_ContentEncryptionAlgorithm, js.Thenable[stdLib.ArrayBuffer]],
    encryptedContentInfo: pkijsLib.srcEncryptedContentInfoMod.default,
    fromSchema: js.Function1[js.Any, scala.Unit],
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any],
    unprotectedAttrs: js.Array[pkijsLib.srcAttributeMod.default],
    version: scala.Double
  ): EncryptedData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("decrypt")(decrypt)
    __obj.updateDynamic("encrypt")(encrypt)
    __obj.updateDynamic("encryptedContentInfo")(encryptedContentInfo)
    __obj.updateDynamic("fromSchema")(fromSchema)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.updateDynamic("toSchema")(toSchema)
    __obj.updateDynamic("unprotectedAttrs")(unprotectedAttrs)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[EncryptedData]
  }
}

