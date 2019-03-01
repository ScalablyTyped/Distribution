package typings
package pkijsLib.srcInfoAccessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfoAccess extends js.Object {
  var accessDescriptions: js.Array[pkijsLib.srcAccessDescriptionMod.default]
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object InfoAccess {
  @scala.inline
  def apply(
    accessDescriptions: js.Array[pkijsLib.srcAccessDescriptionMod.default],
    fromSchema: js.Function1[js.Any, scala.Unit],
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any]
  ): InfoAccess = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accessDescriptions")(accessDescriptions)
    __obj.updateDynamic("fromSchema")(fromSchema)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.updateDynamic("toSchema")(toSchema)
    __obj.asInstanceOf[InfoAccess]
  }
}

