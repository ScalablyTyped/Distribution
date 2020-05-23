package typings.minappEnv.DB

import typings.minappEnv.Array
import typings.minappEnv.InternalSymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatabaseQueryCommand extends DatabaseLogicCommand {
  @JSName("operator")
  var operator_DatabaseQueryCommand: QUERY_COMMANDS_LITERAL | String
  def eq(`val`: js.Any): DatabaseLogicCommand
  def gt(`val`: js.Any): DatabaseLogicCommand
  def gte(`val`: js.Any): DatabaseLogicCommand
  def in(`val`: Array[_]): DatabaseLogicCommand
  def lt(`val`: js.Any): DatabaseLogicCommand
  def lte(`val`: js.Any): DatabaseLogicCommand
  def neq(`val`: js.Any): DatabaseLogicCommand
  def nin(`val`: Array[_]): DatabaseLogicCommand
}

object DatabaseQueryCommand {
  @scala.inline
  def apply(
    _setFieldName: String => DatabaseLogicCommand,
    and: /* repeated */ DatabaseLogicCommand | IQueryCondition => DatabaseLogicCommand,
    eq: js.Any => DatabaseLogicCommand,
    fieldName: String | InternalSymbol,
    gt: js.Any => DatabaseLogicCommand,
    gte: js.Any => DatabaseLogicCommand,
    in: Array[_] => DatabaseLogicCommand,
    lt: js.Any => DatabaseLogicCommand,
    lte: js.Any => DatabaseLogicCommand,
    neq: js.Any => DatabaseLogicCommand,
    nin: Array[_] => DatabaseLogicCommand,
    operands: Array[_],
    operator: QUERY_COMMANDS_LITERAL | String,
    or: /* repeated */ DatabaseLogicCommand | IQueryCondition => DatabaseLogicCommand
  ): DatabaseQueryCommand = {
    val __obj = js.Dynamic.literal(_setFieldName = js.Any.fromFunction1(_setFieldName), and = js.Any.fromFunction1(and), eq = js.Any.fromFunction1(eq), fieldName = fieldName.asInstanceOf[js.Any], gt = js.Any.fromFunction1(gt), gte = js.Any.fromFunction1(gte), in = js.Any.fromFunction1(in), lt = js.Any.fromFunction1(lt), lte = js.Any.fromFunction1(lte), neq = js.Any.fromFunction1(neq), nin = js.Any.fromFunction1(nin), operands = operands.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], or = js.Any.fromFunction1(or))
    __obj.asInstanceOf[DatabaseQueryCommand]
  }
}

