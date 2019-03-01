package typings
package pkijsLib.srcPolicyConstraintsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyConstraints extends js.Object {
  var inhibitPolicyMapping: js.UndefOr[scala.Double] = js.undefined
  var requireExplicitPolicy: js.UndefOr[scala.Double] = js.undefined
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object PolicyConstraints {
  @scala.inline
  def apply(
    fromSchema: js.Function1[js.Any, scala.Unit],
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any],
    inhibitPolicyMapping: scala.Int | scala.Double = null,
    requireExplicitPolicy: scala.Int | scala.Double = null
  ): PolicyConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fromSchema")(fromSchema)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.updateDynamic("toSchema")(toSchema)
    if (inhibitPolicyMapping != null) __obj.updateDynamic("inhibitPolicyMapping")(inhibitPolicyMapping.asInstanceOf[js.Any])
    if (requireExplicitPolicy != null) __obj.updateDynamic("requireExplicitPolicy")(requireExplicitPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyConstraints]
  }
}

