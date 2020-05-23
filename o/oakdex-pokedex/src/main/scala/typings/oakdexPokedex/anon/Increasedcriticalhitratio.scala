package typings.oakdexPokedex.anon

import typings.oakdexPokedex.mod.MoveStatusCondition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Increasedcriticalhitratio extends js.Object {
  var increased_critical_hit_ratio: js.UndefOr[Boolean] = js.undefined
  var status_conditions: js.UndefOr[js.Array[MoveStatusCondition]] = js.undefined
}

object Increasedcriticalhitratio {
  @scala.inline
  def apply(
    increased_critical_hit_ratio: js.UndefOr[Boolean] = js.undefined,
    status_conditions: js.Array[MoveStatusCondition] = null
  ): Increasedcriticalhitratio = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(increased_critical_hit_ratio)) __obj.updateDynamic("increased_critical_hit_ratio")(increased_critical_hit_ratio.get.asInstanceOf[js.Any])
    if (status_conditions != null) __obj.updateDynamic("status_conditions")(status_conditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Increasedcriticalhitratio]
  }
}

