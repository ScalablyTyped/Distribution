package typings.minappEnv.DB

import typings.minappEnv.Array
import typings.minappEnv.InternalSymbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatabaseQueryCommand
  extends StObject
     with DatabaseLogicCommand {
  
  def gt(`val`: Any): DatabaseLogicCommand
  
  def gte(`val`: Any): DatabaseLogicCommand
  
  def in(`val`: Array[Any]): DatabaseLogicCommand
  
  def lt(`val`: Any): DatabaseLogicCommand
  
  def lte(`val`: Any): DatabaseLogicCommand
  
  def neq(`val`: Any): DatabaseLogicCommand
  
  def nin(`val`: Array[Any]): DatabaseLogicCommand
  
  @JSName("operator")
  var operator_DatabaseQueryCommand: QUERY_COMMANDS_LITERAL | String
}
object DatabaseQueryCommand {
  
  inline def apply(
    _setFieldName: String => DatabaseLogicCommand,
    and: /* repeated */ DatabaseLogicCommand | IQueryCondition => DatabaseLogicCommand,
    fieldName: String | InternalSymbol,
    gt: Any => DatabaseLogicCommand,
    gte: Any => DatabaseLogicCommand,
    in: Array[Any] => DatabaseLogicCommand,
    lt: Any => DatabaseLogicCommand,
    lte: Any => DatabaseLogicCommand,
    neq: Any => DatabaseLogicCommand,
    nin: Array[Any] => DatabaseLogicCommand,
    operands: Array[Any],
    operator: QUERY_COMMANDS_LITERAL | String,
    or: /* repeated */ DatabaseLogicCommand | IQueryCondition => DatabaseLogicCommand
  ): DatabaseQueryCommand = {
    val __obj = js.Dynamic.literal(_setFieldName = js.Any.fromFunction1(_setFieldName), and = js.Any.fromFunction1(and), fieldName = fieldName.asInstanceOf[js.Any], gt = js.Any.fromFunction1(gt), gte = js.Any.fromFunction1(gte), in = js.Any.fromFunction1(in), lt = js.Any.fromFunction1(lt), lte = js.Any.fromFunction1(lte), neq = js.Any.fromFunction1(neq), nin = js.Any.fromFunction1(nin), operands = operands.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], or = js.Any.fromFunction1(or))
    __obj.asInstanceOf[DatabaseQueryCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatabaseQueryCommand] (val x: Self) extends AnyVal {
    
    inline def setGt(value: Any => DatabaseLogicCommand): Self = StObject.set(x, "gt", js.Any.fromFunction1(value))
    
    inline def setGte(value: Any => DatabaseLogicCommand): Self = StObject.set(x, "gte", js.Any.fromFunction1(value))
    
    inline def setIn(value: Array[Any] => DatabaseLogicCommand): Self = StObject.set(x, "in", js.Any.fromFunction1(value))
    
    inline def setLt(value: Any => DatabaseLogicCommand): Self = StObject.set(x, "lt", js.Any.fromFunction1(value))
    
    inline def setLte(value: Any => DatabaseLogicCommand): Self = StObject.set(x, "lte", js.Any.fromFunction1(value))
    
    inline def setNeq(value: Any => DatabaseLogicCommand): Self = StObject.set(x, "neq", js.Any.fromFunction1(value))
    
    inline def setNin(value: Array[Any] => DatabaseLogicCommand): Self = StObject.set(x, "nin", js.Any.fromFunction1(value))
    
    inline def setOperator(value: QUERY_COMMANDS_LITERAL | String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
  }
}
