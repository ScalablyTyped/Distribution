package typings.minappEnv.DB

import typings.minappEnv.Array
import typings.minappEnv.InternalSymbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatabaseLogicCommand extends StObject {
  
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
  implicit class DatabaseLogicCommandMutableBuilder[Self <: DatabaseLogicCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnd(value: /* repeated */ DatabaseLogicCommand | IQueryCondition => DatabaseLogicCommand): Self = StObject.set(x, "and", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFieldName(value: String | InternalSymbol): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperands(value: Array[_]): Self = StObject.set(x, "operands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperator(value: LOGIC_COMMANDS_LITERAL | String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOr(value: /* repeated */ DatabaseLogicCommand | IQueryCondition => DatabaseLogicCommand): Self = StObject.set(x, "or", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_setFieldName(value: String => DatabaseLogicCommand): Self = StObject.set(x, "_setFieldName", js.Any.fromFunction1(value))
  }
}
