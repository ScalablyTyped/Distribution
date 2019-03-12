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
    fromSchema: js.Any => scala.Unit,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    excludedSubtrees: js.Array[pkijsLib.srcGeneralSubtreeMod.default] = null,
    permittedSubtrees: js.Array[pkijsLib.srcGeneralSubtreeMod.default] = null
  ): NameConstraints = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    if (excludedSubtrees != null) __obj.updateDynamic("excludedSubtrees")(excludedSubtrees)
    if (permittedSubtrees != null) __obj.updateDynamic("permittedSubtrees")(permittedSubtrees)
    __obj.asInstanceOf[NameConstraints]
  }
}

