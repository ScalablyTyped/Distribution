package typings
package pkijsLib.srcNameConstraintsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NameConstraints extends js.Object {
  var excludedSubtrees: js.UndefOr[js.Array[pkijsLib.srcGeneralSubtreeMod.default]] = js.undefined
  var permittedSubtrees: js.UndefOr[js.Array[pkijsLib.srcGeneralSubtreeMod.default]] = js.undefined
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object NameConstraints {
  @scala.inline
  def apply(
    fromSchema: js.Function1[js.Any, scala.Unit],
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any],
    excludedSubtrees: js.Array[pkijsLib.srcGeneralSubtreeMod.default] = null,
    permittedSubtrees: js.Array[pkijsLib.srcGeneralSubtreeMod.default] = null
  ): NameConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fromSchema")(fromSchema)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.updateDynamic("toSchema")(toSchema)
    if (excludedSubtrees != null) __obj.updateDynamic("excludedSubtrees")(excludedSubtrees)
    if (permittedSubtrees != null) __obj.updateDynamic("permittedSubtrees")(permittedSubtrees)
    __obj.asInstanceOf[NameConstraints]
  }
}

