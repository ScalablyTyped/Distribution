package typings
package pkijsLib.srcSignedAndUnsignedAttributesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignedAndUnsignedAttributes extends js.Object {
  var attributes: js.Array[pkijsLib.srcAttributeMod.default]
  var encodedValue: stdLib.ArrayBuffer
  var `type`: java.lang.String
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object SignedAndUnsignedAttributes {
  @scala.inline
  def apply(
    attributes: js.Array[pkijsLib.srcAttributeMod.default],
    encodedValue: stdLib.ArrayBuffer,
    fromSchema: js.Function1[js.Any, scala.Unit],
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any],
    `type`: java.lang.String
  ): SignedAndUnsignedAttributes = {
    val __obj = js.Dynamic.literal(attributes = attributes, encodedValue = encodedValue, fromSchema = fromSchema, toJSON = toJSON, toSchema = toSchema)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SignedAndUnsignedAttributes]
  }
}

