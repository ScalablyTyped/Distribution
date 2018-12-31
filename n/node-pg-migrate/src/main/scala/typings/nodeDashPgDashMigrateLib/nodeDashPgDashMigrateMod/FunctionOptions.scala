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

