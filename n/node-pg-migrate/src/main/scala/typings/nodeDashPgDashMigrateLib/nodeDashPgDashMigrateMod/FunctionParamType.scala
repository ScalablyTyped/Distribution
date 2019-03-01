package typings
package nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionParamType extends js.Object {
  var default: js.UndefOr[Value] = js.undefined
  var mode: js.UndefOr[
    nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.IN | nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.OUT | nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.INOUT | nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.VARIADIC
  ] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var `type`: java.lang.String
}

object FunctionParamType {
  @scala.inline
  def apply(
    `type`: java.lang.String,
    default: Value = null,
    mode: nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.IN | nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.OUT | nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.INOUT | nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.VARIADIC = null,
    name: java.lang.String = null
  ): FunctionParamType = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[FunctionParamType]
  }
}

