package typings
package pkijsLib.srcEncryptedDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/EncryptedData", JSImport.Default)
@js.native
class default () extends EncryptedData {
  def this(params: js.Any) = this()
  /* CompleteClass */
  override var encryptedContentInfo: pkijsLib.srcEncryptedContentInfoMod.default = js.native
  /* CompleteClass */
  override var unprotectedAttrs: js.Array[pkijsLib.srcAttributeMod.default] = js.native
  /* CompleteClass */
  override var version: scala.Double = js.native
  /**
           * Create a new CMS Encrypted Data content
           * @param {*} parameters Parameters neccessary for encryption
           */
  /* CompleteClass */
  override def decrypt(parameters: pkijsLib.Anon_Password): stdLib.PromiseLike[stdLib.ArrayBuffer] = js.native
  /**
           * Create a new CMS Encrypted Data content
           * @param {*} parameters Parameters neccessary for encryption
           * @returns {Promise}
           */
  /* CompleteClass */
  override def encrypt(parameters: pkijsLib.Anon_HmacHashAlgorithm): stdLib.PromiseLike[stdLib.ArrayBuffer] = js.native
  /* CompleteClass */
  override def fromSchema(schema: js.Any): scala.Unit = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
  /* CompleteClass */
  override def toSchema(): js.Any = js.native
}

@JSImport("pkijs/src/EncryptedData", JSImport.Default)
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

