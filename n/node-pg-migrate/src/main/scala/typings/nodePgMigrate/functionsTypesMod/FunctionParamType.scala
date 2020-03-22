package typings.nodePgMigrate.functionsTypesMod

import typings.nodePgMigrate.generalTypesMod.Value
import typings.nodePgMigrate.nodePgMigrateStrings.IN
import typings.nodePgMigrate.nodePgMigrateStrings.INOUT
import typings.nodePgMigrate.nodePgMigrateStrings.OUT
import typings.nodePgMigrate.nodePgMigrateStrings.VARIADIC
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
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionParamType]
  }
}

