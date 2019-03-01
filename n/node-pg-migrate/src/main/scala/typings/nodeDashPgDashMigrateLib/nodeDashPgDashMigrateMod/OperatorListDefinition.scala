package typings
package nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperatorListDefinition extends js.Object {
  var name: Name
  var number: scala.Double
  var params: js.UndefOr[js.Array[FunctionParam]] = js.undefined
  var `type`: nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.function | nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.operator
}

object OperatorListDefinition {
  @scala.inline
  def apply(
    name: Name,
    number: scala.Double,
    `type`: nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.function | nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.operator,
    params: js.Array[FunctionParam] = null
  ): OperatorListDefinition = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.updateDynamic("number")(number)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[OperatorListDefinition]
  }
}

