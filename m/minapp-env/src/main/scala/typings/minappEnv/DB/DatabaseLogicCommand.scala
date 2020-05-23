package typings.minappEnv.DB

import typings.minappEnv.Array
import typings.minappEnv.InternalSymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatabaseLogicCommand extends js.Object {
  var fieldName: String | InternalSymbol
  var operands: Array[_]
  var operator: LOGIC_COMMANDS_LITERAL | String
  def _setFieldName(fieldName: String): DatabaseLogicCommand
  def and(expressions: (DatabaseLogicCommand | IQueryCondition)*): DatabaseLogicCommand
  def or(expressions: (DatabaseLogicCommand | IQueryCondition)*): DatabaseLogicCommand
}

object DatabaseLogicCommand {
  @scala.inline
  def apply(
    _setFieldName: String => DatabaseLogicCommand,
    and: /* repeated */ DatabaseLogicCommand | IQueryCondition => DatabaseLogicCommand,
    fieldName: String | InternalSymbol,
    operands: Array[_],
    operator: LOGIC_COMMANDS_LITERAL | String,
    or: /* repeated */ DatabaseLogicCommand | IQueryCondition => DatabaseLogicCommand
  ): DatabaseLogicCommand = {
    val __obj = js.Dynamic.literal(_setFieldName = js.Any.fromFunction1(_setFieldName), and = js.Any.fromFunction1(and), fieldName = fieldName.asInstanceOf[js.Any], operands = operands.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], or = js.Any.fromFunction1(or))
    __obj.asInstanceOf[DatabaseLogicCommand]
  }
}

