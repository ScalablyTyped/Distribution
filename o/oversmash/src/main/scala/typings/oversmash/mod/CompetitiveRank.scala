package typings.oversmash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompetitiveRank extends js.Object {
  var damage: js.UndefOr[Double] = js.undefined
  var support: js.UndefOr[Double] = js.undefined
  var tank: js.UndefOr[Double] = js.undefined
}

object CompetitiveRank {
  @scala.inline
  def apply(
    damage: js.UndefOr[Double] = js.undefined,
    support: js.UndefOr[Double] = js.undefined,
    tank: js.UndefOr[Double] = js.undefined
  ): CompetitiveRank = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(damage)) __obj.updateDynamic("damage")(damage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(support)) __obj.updateDynamic("support")(support.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tank)) __obj.updateDynamic("tank")(tank.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompetitiveRank]
  }
}

