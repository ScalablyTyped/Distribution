package typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod

import typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateStrings.IN
import typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateStrings.INOUT
import typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateStrings.OUT
import typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateStrings.VARIADIC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionParamType extends js.Object {
  var default: js.UndefOr[Value] = js.undefined
  var mode: js.UndefOr[IN | OUT | INOUT | VARIADIC] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var `type`: String
}

object FunctionParamType {
  @scala.inline
  def apply(
    `type`: String,
    default: Value = null,
    mode: IN | OUT | INOUT | VARIADIC = null,
    name: String = null
  ): FunctionParamType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[FunctionParamType]
  }
}

