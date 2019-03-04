package typings
package pkijsLib.srcTimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Time extends js.Object {
  var `type`: scala.Double
  var value: stdLib.Date
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object Time {
  @scala.inline
  def apply(
    fromSchema: js.Function1[js.Any, scala.Unit],
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any],
    `type`: scala.Double,
    value: stdLib.Date
  ): Time = {
    val __obj = js.Dynamic.literal(fromSchema = fromSchema, toJSON = toJSON, toSchema = toSchema, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Time]
  }
}

