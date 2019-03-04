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
    fromSchema: js.Function1[js.Any, scala.Unit],
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any],
    `type`: java.lang.String,
    value: js.Array[_]
  ): Attribute = {
    val __obj = js.Dynamic.literal(fromSchema = fromSchema, toJSON = toJSON, toSchema = toSchema, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Attribute]
  }
}

