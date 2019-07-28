package typings.pkijs.srcNameConstraintsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NameConstraints extends js.Object {
  var excludedSubtrees: js.UndefOr[js.Array[typings.pkijs.srcGeneralSubtreeMod.default]] = js.undefined
  var permittedSubtrees: js.UndefOr[js.Array[typings.pkijs.srcGeneralSubtreeMod.default]] = js.undefined
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object NameConstraints {
  @scala.inline
  def apply(
    fromSchema: js.Any => Unit,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    excludedSubtrees: js.Array[typings.pkijs.srcGeneralSubtreeMod.default] = null,
    permittedSubtrees: js.Array[typings.pkijs.srcGeneralSubtreeMod.default] = null
  ): NameConstraints = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    if (excludedSubtrees != null) __obj.updateDynamic("excludedSubtrees")(excludedSubtrees)
    if (permittedSubtrees != null) __obj.updateDynamic("permittedSubtrees")(permittedSubtrees)
    __obj.asInstanceOf[NameConstraints]
  }
}

