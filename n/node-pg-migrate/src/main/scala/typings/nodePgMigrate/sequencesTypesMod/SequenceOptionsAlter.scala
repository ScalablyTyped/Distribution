package typings.nodePgMigrate.sequencesTypesMod

import typings.nodePgMigrate.generalTypesMod.Type
import typings.nodePgMigrate.nodePgMigrateBooleans.`false`
import typings.nodePgMigrate.nodePgMigrateBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SequenceOptionsAlter extends SequenceOptions {
  var restart: js.UndefOr[Double | `true`] = js.undefined
}

object SequenceOptionsAlter {
  @scala.inline
  def apply(
    cache: js.UndefOr[Double] = js.undefined,
    cycle: js.UndefOr[Boolean] = js.undefined,
    increment: js.UndefOr[Double] = js.undefined,
    maxvalue: js.UndefOr[Null | Double | `false`] = js.undefined,
    minvalue: js.UndefOr[Null | Double | `false`] = js.undefined,
    owner: js.UndefOr[Null | String | `false`] = js.undefined,
    restart: Double | `true` = null,
    start: js.UndefOr[Double] = js.undefined,
    `type`: Type = null
  ): SequenceOptionsAlter = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cycle)) __obj.updateDynamic("cycle")(cycle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(increment)) __obj.updateDynamic("increment")(increment.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxvalue)) __obj.updateDynamic("maxvalue")(maxvalue.asInstanceOf[js.Any])
    if (!js.isUndefined(minvalue)) __obj.updateDynamic("minvalue")(minvalue.asInstanceOf[js.Any])
    if (!js.isUndefined(owner)) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (restart != null) __obj.updateDynamic("restart")(restart.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SequenceOptionsAlter]
  }
}

