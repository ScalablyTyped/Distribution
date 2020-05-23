package typings.nodePgMigrate.sequencesTypesMod

import typings.nodePgMigrate.generalTypesMod.IfNotExistsOption
import typings.nodePgMigrate.generalTypesMod.Type
import typings.nodePgMigrate.nodePgMigrateBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SequenceOptionsCreate
  extends SequenceOptions
     with IfNotExistsOption {
  var temporary: js.UndefOr[Boolean] = js.undefined
}

object SequenceOptionsCreate {
  @scala.inline
  def apply(
    cache: js.UndefOr[Double] = js.undefined,
    cycle: js.UndefOr[Boolean] = js.undefined,
    ifNotExists: js.UndefOr[Boolean] = js.undefined,
    increment: js.UndefOr[Double] = js.undefined,
    maxvalue: js.UndefOr[Null | Double | `false`] = js.undefined,
    minvalue: js.UndefOr[Null | Double | `false`] = js.undefined,
    owner: js.UndefOr[Null | String | `false`] = js.undefined,
    start: js.UndefOr[Double] = js.undefined,
    temporary: js.UndefOr[Boolean] = js.undefined,
    `type`: Type = null
  ): SequenceOptionsCreate = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cycle)) __obj.updateDynamic("cycle")(cycle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ifNotExists)) __obj.updateDynamic("ifNotExists")(ifNotExists.get.asInstanceOf[js.Any])
    if (!js.isUndefined(increment)) __obj.updateDynamic("increment")(increment.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxvalue)) __obj.updateDynamic("maxvalue")(maxvalue.asInstanceOf[js.Any])
    if (!js.isUndefined(minvalue)) __obj.updateDynamic("minvalue")(minvalue.asInstanceOf[js.Any])
    if (!js.isUndefined(owner)) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    if (!js.isUndefined(temporary)) __obj.updateDynamic("temporary")(temporary.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SequenceOptionsCreate]
  }
}

