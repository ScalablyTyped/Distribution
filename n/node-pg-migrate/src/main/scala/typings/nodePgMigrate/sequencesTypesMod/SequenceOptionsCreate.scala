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
    cache: Int | Double = null,
    cycle: js.UndefOr[Boolean] = js.undefined,
    ifNotExists: js.UndefOr[Boolean] = js.undefined,
    increment: Int | Double = null,
    maxvalue: Double | `false` = null,
    minvalue: Double | `false` = null,
    owner: String | `false` = null,
    start: Int | Double = null,
    temporary: js.UndefOr[Boolean] = js.undefined,
    `type`: Type = null
  ): SequenceOptionsCreate = {
    val __obj = js.Dynamic.literal()
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (!js.isUndefined(cycle)) __obj.updateDynamic("cycle")(cycle.asInstanceOf[js.Any])
    if (!js.isUndefined(ifNotExists)) __obj.updateDynamic("ifNotExists")(ifNotExists.asInstanceOf[js.Any])
    if (increment != null) __obj.updateDynamic("increment")(increment.asInstanceOf[js.Any])
    if (maxvalue != null) __obj.updateDynamic("maxvalue")(maxvalue.asInstanceOf[js.Any])
    if (minvalue != null) __obj.updateDynamic("minvalue")(minvalue.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (!js.isUndefined(temporary)) __obj.updateDynamic("temporary")(temporary.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SequenceOptionsCreate]
  }
}

