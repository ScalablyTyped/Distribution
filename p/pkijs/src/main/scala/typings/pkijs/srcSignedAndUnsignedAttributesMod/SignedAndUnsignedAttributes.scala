package typings.pkijs.srcSignedAndUnsignedAttributesMod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignedAndUnsignedAttributes extends js.Object {
  var attributes: js.Array[typings.pkijs.srcAttributeMod.default]
  var encodedValue: ArrayBuffer
  var `type`: String
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object SignedAndUnsignedAttributes {
  @scala.inline
  def apply(
    attributes: js.Array[typings.pkijs.srcAttributeMod.default],
    encodedValue: ArrayBuffer,
    fromSchema: js.Any => Unit,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    `type`: String
  ): SignedAndUnsignedAttributes = {
    val __obj = js.Dynamic.literal(attributes = attributes, encodedValue = encodedValue, fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SignedAndUnsignedAttributes]
  }
}

