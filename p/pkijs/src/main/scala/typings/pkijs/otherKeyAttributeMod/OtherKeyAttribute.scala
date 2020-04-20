package typings.pkijs.otherKeyAttributeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OtherKeyAttribute extends js.Object {
  var keyAttr: js.Any
  var keyAttrId: String
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object OtherKeyAttribute {
  @scala.inline
  def apply(
    fromSchema: js.Any => Unit,
    keyAttr: js.Any,
    keyAttrId: String,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): OtherKeyAttribute = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), keyAttr = keyAttr.asInstanceOf[js.Any], keyAttrId = keyAttrId.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[OtherKeyAttribute]
  }
}

