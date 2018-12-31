package typings
package nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TriggerOptionsEn extends js.Object {
  var condition: js.UndefOr[java.lang.String] = js.undefined
  var constraint: js.UndefOr[scala.Boolean] = js.undefined
  var deferrable: js.UndefOr[scala.Boolean] = js.undefined
  var deferred: js.UndefOr[scala.Boolean] = js.undefined
  var function: js.UndefOr[Name] = js.undefined
  var functionParams: js.UndefOr[js.Array[Value]] = js.undefined
  var level: js.UndefOr[
    nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.STATEMENT | nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.ROW
  ] = js.undefined
  var operation: java.lang.String | js.Array[java.lang.String]
  var when: js.UndefOr[
    nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.BEFORE | nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.AFTER | (nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.`INSTEAD OF`)
  ] = js.undefined
}

