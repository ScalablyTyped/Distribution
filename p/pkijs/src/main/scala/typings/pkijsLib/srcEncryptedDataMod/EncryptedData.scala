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
  def encrypt(parameters: pkijsLib.Anon_HmacHashAlgorithm): js.Thenable[stdLib.ArrayBuffer]
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

