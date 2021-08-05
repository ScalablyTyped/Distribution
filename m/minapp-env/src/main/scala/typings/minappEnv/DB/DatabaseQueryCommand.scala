package typings.minappEnv.DB

import typings.minappEnv.Array
import typings.minappEnv.InternalSymbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatabaseQueryCommand
  extends StObject
     with DatabaseLogicCommand {
  
  def eq(`val`: js.Any): DatabaseLogicCommand
  
  def gt(`val`: js.Any): DatabaseLogicCommand
  
  def gte(`val`: js.Any): DatabaseLogicCommand
  
  def in(`val`: Array[js.Any]): DatabaseLogicCommand
  
  def lt(`val`: js.Any): DatabaseLogicCommand
  
  def lte(`val`: js.Any): DatabaseLogicCommand
  
  def neq(`val`: js.Any): DatabaseLogicCommand
  
  def nin(`val`: Array[js.Any]): DatabaseLogicCommand
  
  @JSName("operator")
  var operator_DatabaseQueryCommand: QUERY_COMMANDS_LITERAL | String
}
object DatabaseQueryCommand {
  
  inline def apply(
    _setFieldName: String => DatabaseLogicCommand,
    and: /* repeated */ DatabaseLogicCommand | IQueryCondition => DatabaseLogicCommand,
    eq_ : js.Any => DatabaseLogicCommand,
    fieldName: String | InternalSymbol,
    gt: js.Any => DatabaseLogicCommand,
    gte: js.Any => DatabaseLogicCommand,
    in: Array[js.Any] => DatabaseLogicCommand,
    lt: js.Any => DatabaseLogicCommand,
    lte: js.Any => DatabaseLogicCommand,
    neq: js.Any => DatabaseLogicCommand,
    nin: Array[js.Any] => DatabaseLogicCommand,
    operands: Array[js.Any],
    operator: QUERY_COMMANDS_LITERAL | String,
    or: /* repeated */ DatabaseLogicCommand | IQueryCondition => DatabaseLogicCommand
  ): DatabaseQueryCommand = {
    val __obj = js.Dynamic.literal(_setFieldName = js.Any.fromFunction1(_setFieldName), and = js.Any.fromFunction1(and), fieldName = fieldName.asInstanceOf[js.Any], gt = js.Any.fromFunction1(gt), gte = js.Any.fromFunction1(gte), in = js.Any.fromFunction1(in), lt = js.Any.fromFunction1(lt), lte = js.Any.fromFunction1(lte), neq = js.Any.fromFunction1(neq), nin = js.Any.fromFunction1(nin), operands = operands.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], or = js.Any.fromFunction1(or))
    __obj.updateDynamic("eq")(js.Any.fromFunction1(eq_))
    __obj.asInstanceOf[DatabaseQueryCommand]
  }
  
  extension [Self <: DatabaseQueryCommand](x: Self) {
    
    inline def setEq_(value: js.Any => DatabaseLogicCommand): Self = StObject.set(x, "eq", js.Any.fromFunction1(value))
    
    inline def setGt(value: js.Any => DatabaseLogicCommand): Self = StObject.set(x, "gt", js.Any.fromFunction1(value))
    
    inline def setGte(value: js.Any => DatabaseLogicCommand): Self = StObject.set(x, "gte", js.Any.fromFunction1(value))
    
    inline def setIn(value: Array[js.Any] => DatabaseLogicCommand): Self = StObject.set(x, "in", js.Any.fromFunction1(value))
    
    inline def setLt(value: js.Any => DatabaseLogicCommand): Self = StObject.set(x, "lt", js.Any.fromFunction1(value))
    
    inline def setLte(value: js.Any => DatabaseLogicCommand): Self = StObject.set(x, "lte", js.Any.fromFunction1(value))
    
    inline def setNeq(value: js.Any => DatabaseLogicCommand): Self = StObject.set(x, "neq", js.Any.fromFunction1(value))
    
    inline def setNin(value: Array[js.Any] => DatabaseLogicCommand): Self = StObject.set(x, "nin", js.Any.fromFunction1(value))
    
    inline def setOperator(value: QUERY_COMMANDS_LITERAL | String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
  }
}
