package typings
package pkijsLib.srcSignatureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/Signature", JSImport.Default)
@js.native
class default () extends Signature {
  def this(params: js.Any) = this()
  /* CompleteClass */
  override var signature: asn1jsLib.asn1jsMod.BitString = js.native
  /* CompleteClass */
  override var signatureAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default = js.native
  /* CompleteClass */
  override def fromSchema(schema: js.Any): scala.Unit = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
  /* CompleteClass */
  override def toSchema(): js.Any = js.native
}

/* static members */
@JSImport("pkijs/src/Signature", JSImport.Default)
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

