package typings
package pkijsLib.srcOtherKeyAttributeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OtherKeyAttribute extends js.Object {
  var keyAttr: js.Any
  var keyAttrId: java.lang.String
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object OtherKeyAttribute {
  @scala.inline
  def apply(
    fromSchema: js.Function1[js.Any, scala.Unit],
    keyAttr: js.Any,
    keyAttrId: java.lang.String,
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any]
  ): OtherKeyAttribute = {
    val __obj = js.Dynamic.literal(fromSchema = fromSchema, keyAttr = keyAttr, keyAttrId = keyAttrId, toJSON = toJSON, toSchema = toSchema)
  
    __obj.asInstanceOf[OtherKeyAttribute]
  }
}

