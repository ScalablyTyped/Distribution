package typings
package nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SequenceOptions extends js.Object {
  var cache: js.UndefOr[scala.Double] = js.undefined
  var cycle: js.UndefOr[scala.Boolean] = js.undefined
  var increment: js.UndefOr[scala.Double] = js.undefined
  var maxvalue: js.UndefOr[
    scala.Double | scala.Null | nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibNumbers.`false`
  ] = js.undefined
  var minvalue: js.UndefOr[
    scala.Double | scala.Null | nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibNumbers.`false`
  ] = js.undefined
  var owner: js.UndefOr[
    java.lang.String | scala.Null | nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibNumbers.`false`
  ] = js.undefined
  var start: js.UndefOr[scala.Double] = js.undefined
  var `type`: js.UndefOr[Type] = js.undefined
}

object SequenceOptions {
  @scala.inline
  def apply(
    cache: scala.Int | scala.Double = null,
    cycle: js.UndefOr[scala.Boolean] = js.undefined,
    increment: scala.Int | scala.Double = null,
    maxvalue: scala.Double | nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibNumbers.`false` = null,
    minvalue: scala.Double | nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibNumbers.`false` = null,
    owner: java.lang.String | nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibNumbers.`false` = null,
    start: scala.Int | scala.Double = null,
    `type`: Type = null
  ): SequenceOptions = {
    val __obj = js.Dynamic.literal()
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (!js.isUndefined(cycle)) __obj.updateDynamic("cycle")(cycle)
    if (increment != null) __obj.updateDynamic("increment")(increment.asInstanceOf[js.Any])
    if (maxvalue != null) __obj.updateDynamic("maxvalue")(maxvalue.asInstanceOf[js.Any])
    if (minvalue != null) __obj.updateDynamic("minvalue")(minvalue.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SequenceOptions]
  }
}

