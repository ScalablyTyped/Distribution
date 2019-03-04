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

object TriggerOptionsEn {
  @scala.inline
  def apply(
    operation: java.lang.String | js.Array[java.lang.String],
    condition: java.lang.String = null,
    constraint: js.UndefOr[scala.Boolean] = js.undefined,
    deferrable: js.UndefOr[scala.Boolean] = js.undefined,
    deferred: js.UndefOr[scala.Boolean] = js.undefined,
    function: Name = null,
    functionParams: js.Array[Value] = null,
    level: nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.STATEMENT | nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.ROW = null,
    when: nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.BEFORE | nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.AFTER | (nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.`INSTEAD OF`) = null
  ): TriggerOptionsEn = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(condition)
    if (!js.isUndefined(constraint)) __obj.updateDynamic("constraint")(constraint)
    if (!js.isUndefined(deferrable)) __obj.updateDynamic("deferrable")(deferrable)
    if (!js.isUndefined(deferred)) __obj.updateDynamic("deferred")(deferred)
    if (function != null) __obj.updateDynamic("function")(function.asInstanceOf[js.Any])
    if (functionParams != null) __obj.updateDynamic("functionParams")(functionParams)
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (when != null) __obj.updateDynamic("when")(when.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerOptionsEn]
  }
}

