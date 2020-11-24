package typings.minappEnv.DB

import typings.minappEnv.Array
import typings.minappEnv.InternalSymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatabaseLogicCommand extends js.Object {
  
  def _setFieldName(fieldName: String): DatabaseLogicCommand = js.native
  
  def and(expressions: (DatabaseLogicCommand | IQueryCondition)*): DatabaseLogicCommand = js.native
  
  var fieldName: String | InternalSymbol = js.native
  
  var operands: Array[_] = js.native
  
  var operator: LOGIC_COMMANDS_LITERAL | String = js.native
  
  def or(expressions: (DatabaseLogicCommand | IQueryCondition)*): DatabaseLogicCommand = js.native
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
  
  @scala.inline
  implicit class DatabaseLogicCommandOps[Self <: DatabaseLogicCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_setFieldName(value: String => DatabaseLogicCommand): Self = this.set("_setFieldName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAnd(value: /* repeated */ DatabaseLogicCommand | IQueryCondition => DatabaseLogicCommand): Self = this.set("and", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFieldName(value: String | InternalSymbol): Self = this.set("fieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperands(value: Array[_]): Self = this.set("operands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperator(value: LOGIC_COMMANDS_LITERAL | String): Self = this.set("operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOr(value: /* repeated */ DatabaseLogicCommand | IQueryCondition => DatabaseLogicCommand): Self = this.set("or", js.Any.fromFunction1(value))
  }
}
