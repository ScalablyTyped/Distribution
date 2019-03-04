package typings
package nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionOptions extends js.Object {
  var behavior: js.UndefOr[
    nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.IMMUTABLE | nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.STABLE | nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.VOLATILE
  ] = js.undefined
  var language: java.lang.String
  var onNull: js.UndefOr[scala.Boolean] = js.undefined
  var parallel: js.UndefOr[
    nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.UNSAFE | nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.RESTRICTED | nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.SAFE
  ] = js.undefined
  var replace: js.UndefOr[scala.Boolean] = js.undefined
  var returns: js.UndefOr[java.lang.String] = js.undefined
  var window: js.UndefOr[scala.Boolean] = js.undefined
}

object FunctionOptions {
  @scala.inline
  def apply(
    language: java.lang.String,
    behavior: nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.IMMUTABLE | nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.STABLE | nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.VOLATILE = null,
    onNull: js.UndefOr[scala.Boolean] = js.undefined,
    parallel: nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.UNSAFE | nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.RESTRICTED | nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.SAFE = null,
    replace: js.UndefOr[scala.Boolean] = js.undefined,
    returns: java.lang.String = null,
    window: js.UndefOr[scala.Boolean] = js.undefined
  ): FunctionOptions = {
    val __obj = js.Dynamic.literal(language = language)
    if (behavior != null) __obj.updateDynamic("behavior")(behavior.asInstanceOf[js.Any])
    if (!js.isUndefined(onNull)) __obj.updateDynamic("onNull")(onNull)
    if (parallel != null) __obj.updateDynamic("parallel")(parallel.asInstanceOf[js.Any])
    if (!js.isUndefined(replace)) __obj.updateDynamic("replace")(replace)
    if (returns != null) __obj.updateDynamic("returns")(returns)
    if (!js.isUndefined(window)) __obj.updateDynamic("window")(window)
    __obj.asInstanceOf[FunctionOptions]
  }
}

