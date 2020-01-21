package typings.nodePgMigrate.mod

import typings.nodePgMigrate.nodePgMigrateStrings.function
import typings.nodePgMigrate.nodePgMigrateStrings.operator
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
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperatorListDefinition]
  }
}

