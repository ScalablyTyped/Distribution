package typings.nodePgMigrate.tablesTypesMod

import typings.nodePgMigrate.generalTypesMod.Type
import typings.nodePgMigrate.nodePgMigrateBooleans.`false`
import typings.nodePgMigrate.nodePgMigrateStrings.ALWAYS
import typings.nodePgMigrate.nodePgMigrateStrings.`BY DEFAULT`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  precedence  :'ALWAYS' | 'BY DEFAULT'} & node-pg-migrate.node-pg-migrate/dist/operations/sequencesTypes.SequenceOptions */
trait SequenceGeneratedOptions extends js.Object {
  var cache: js.UndefOr[Double] = js.undefined
  var cycle: js.UndefOr[Boolean] = js.undefined
  var increment: js.UndefOr[Double] = js.undefined
  var maxvalue: js.UndefOr[Double | Null | `false`] = js.undefined
  var minvalue: js.UndefOr[Double | Null | `false`] = js.undefined
  var owner: js.UndefOr[String | Null | `false`] = js.undefined
  var precedence: ALWAYS | (`BY DEFAULT`)
  var start: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[Type] = js.undefined
}

object SequenceGeneratedOptions {
  @scala.inline
  def apply(
    precedence: ALWAYS | (`BY DEFAULT`),
    cache: Int | Double = null,
    cycle: js.UndefOr[Boolean] = js.undefined,
    increment: Int | Double = null,
    maxvalue: Double | `false` = null,
    minvalue: Double | `false` = null,
    owner: String | `false` = null,
    start: Int | Double = null,
    `type`: Type = null
  ): SequenceGeneratedOptions = {
    val __obj = js.Dynamic.literal(precedence = precedence.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (!js.isUndefined(cycle)) __obj.updateDynamic("cycle")(cycle.asInstanceOf[js.Any])
    if (increment != null) __obj.updateDynamic("increment")(increment.asInstanceOf[js.Any])
    if (maxvalue != null) __obj.updateDynamic("maxvalue")(maxvalue.asInstanceOf[js.Any])
    if (minvalue != null) __obj.updateDynamic("minvalue")(minvalue.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SequenceGeneratedOptions]
  }
}

