package typings
package nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateViewOptions extends js.Object {
  var checkOption: js.UndefOr[
    nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.CASCADED | nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.LOCAL
  ] = js.undefined
  var columns: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var recursive: js.UndefOr[scala.Boolean] = js.undefined
  var replace: js.UndefOr[scala.Boolean] = js.undefined
  var temporary: js.UndefOr[scala.Boolean] = js.undefined
}

object CreateViewOptions {
  @scala.inline
  def apply(
    checkOption: nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.CASCADED | nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.LOCAL = null,
    columns: java.lang.String | js.Array[java.lang.String] = null,
    recursive: js.UndefOr[scala.Boolean] = js.undefined,
    replace: js.UndefOr[scala.Boolean] = js.undefined,
    temporary: js.UndefOr[scala.Boolean] = js.undefined
  ): CreateViewOptions = {
    val __obj = js.Dynamic.literal()
    if (checkOption != null) __obj.updateDynamic("checkOption")(checkOption.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive)
    if (!js.isUndefined(replace)) __obj.updateDynamic("replace")(replace)
    if (!js.isUndefined(temporary)) __obj.updateDynamic("temporary")(temporary)
    __obj.asInstanceOf[CreateViewOptions]
  }
}

