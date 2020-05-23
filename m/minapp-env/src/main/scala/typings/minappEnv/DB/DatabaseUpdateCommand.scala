package typings.minappEnv.DB

import typings.minappEnv.Array
import typings.minappEnv.InternalSymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatabaseUpdateCommand extends js.Object {
  var fieldName: String | InternalSymbol
  var operands: Array[_]
  var operator: UPDATE_COMMANDS_LITERAL
  def _setFieldName(fieldName: String): DatabaseUpdateCommand
}

object DatabaseUpdateCommand {
  @scala.inline
  def apply(
    _setFieldName: String => DatabaseUpdateCommand,
    fieldName: String | InternalSymbol,
    operands: Array[_],
    operator: UPDATE_COMMANDS_LITERAL
  ): DatabaseUpdateCommand = {
    val __obj = js.Dynamic.literal(_setFieldName = js.Any.fromFunction1(_setFieldName), fieldName = fieldName.asInstanceOf[js.Any], operands = operands.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseUpdateCommand]
  }
}

