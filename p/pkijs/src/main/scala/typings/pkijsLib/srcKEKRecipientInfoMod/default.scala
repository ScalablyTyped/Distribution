package typings
package pkijsLib.srcKEKRecipientInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/KEKRecipientInfo", JSImport.Default)
@js.native
class default () extends KEKRecipientInfo {
  def this(params: js.Any) = this()
  /* CompleteClass */
  override var encryptedKey: asn1jsLib.asn1jsMod.OctetString = js.native
  /* CompleteClass */
  override var kekid: pkijsLib.srcKEKIdentifierMod.default = js.native
  /* CompleteClass */
  override var keyEncryptionAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default = js.native
  /* CompleteClass */
  override var preDefinedKEK: stdLib.ArrayBuffer = js.native
  /* CompleteClass */
  override var version: scala.Double = js.native
  /* CompleteClass */
  override def fromSchema(schema: js.Any): scala.Unit = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
  /* CompleteClass */
  override def toSchema(): js.Any = js.native
}

/* static members */
@JSImport("pkijs/src/KEKRecipientInfo", JSImport.Default)
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

