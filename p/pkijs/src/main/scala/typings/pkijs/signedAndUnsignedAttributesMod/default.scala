package typings.pkijs.signedAndUnsignedAttributesMod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/SignedAndUnsignedAttributes", JSImport.Default)
@js.native
class default () extends SignedAndUnsignedAttributes {
  def this(params: js.Any) = this()
  /* CompleteClass */
  override var attributes: js.Array[typings.pkijs.attributeMod.default] = js.native
  /* CompleteClass */
  override var encodedValue: ArrayBuffer = js.native
  /* CompleteClass */
  override var `type`: String = js.native
  /* CompleteClass */
  override def fromSchema(schema: js.Any): Unit = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
  /* CompleteClass */
  override def toSchema(): js.Any = js.native
}

/* static members */
@JSImport("pkijs/src/SignedAndUnsignedAttributes", JSImport.Default)
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

