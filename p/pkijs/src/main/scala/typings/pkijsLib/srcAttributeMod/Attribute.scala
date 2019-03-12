package typings
package pkijsLib.srcAttributeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attribute extends js.Object {
  var `type`: java.lang.String
  var value: js.Array[_]
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object Attribute {
  @scala.inline
  def apply(
    fromSchema: js.Any => scala.Unit,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    `type`: java.lang.String,
    value: js.Array[_]
  ): Attribute = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Attribute]
  }
}

