package typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod

import typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateStrings.function
import typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateStrings.operator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperatorListDefinition extends js.Object {
  var name: Name
  var number: Double
  var params: js.UndefOr[js.Array[FunctionParam]] = js.undefined
  var `type`: function | operator
}

object OperatorListDefinition {
  @scala.inline
  def apply(name: Name, number: Double, `type`: function | operator, params: js.Array[FunctionParam] = null): OperatorListDefinition = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], number = number)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[OperatorListDefinition]
  }
}

