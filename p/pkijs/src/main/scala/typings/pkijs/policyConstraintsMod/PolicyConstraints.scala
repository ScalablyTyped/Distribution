package typings.pkijs.policyConstraintsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyConstraints extends js.Object {
  var inhibitPolicyMapping: js.UndefOr[Double] = js.undefined
  var requireExplicitPolicy: js.UndefOr[Double] = js.undefined
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object PolicyConstraints {
  @scala.inline
  def apply(
    fromSchema: js.Any => Unit,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    inhibitPolicyMapping: Int | Double = null,
    requireExplicitPolicy: Int | Double = null
  ): PolicyConstraints = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    if (inhibitPolicyMapping != null) __obj.updateDynamic("inhibitPolicyMapping")(inhibitPolicyMapping.asInstanceOf[js.Any])
    if (requireExplicitPolicy != null) __obj.updateDynamic("requireExplicitPolicy")(requireExplicitPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyConstraints]
  }
}

