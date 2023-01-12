package typings.minappEnv.DB

import typings.minappEnv.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatabaseCommand extends StObject {
  
  def and(expressions: (DatabaseLogicCommand | IQueryCondition)*): DatabaseLogicCommand
  
  def gt(`val`: Any): DatabaseQueryCommand
  
  def gte(`val`: Any): DatabaseQueryCommand
  
  def in(`val`: Array[Any]): DatabaseQueryCommand
  
  def inc(`val`: Double): DatabaseUpdateCommand
  
  def lt(`val`: Any): DatabaseQueryCommand
  
  def lte(`val`: Any): DatabaseQueryCommand
  
  def mul(`val`: Double): DatabaseUpdateCommand
  
  def neq(`val`: Any): DatabaseQueryCommand
  
  def nin(`val`: Array[Any]): DatabaseQueryCommand
  
  def or(expressions: (DatabaseLogicCommand | IQueryCondition)*): DatabaseLogicCommand
  
  def pop(): DatabaseUpdateCommand
  
  def push(values: Any*): DatabaseUpdateCommand
  
  def remove(): DatabaseUpdateCommand
  
  def set(`val`: Any): DatabaseUpdateCommand
  
  def shift(): DatabaseUpdateCommand
  
  def unshift(values: Any*): DatabaseUpdateCommand
}
object DatabaseCommand {
  
  inline def apply(
    and: /* repeated */ DatabaseLogicCommand | IQueryCondition => DatabaseLogicCommand,
    gt: Any => DatabaseQueryCommand,
    gte: Any => DatabaseQueryCommand,
    in: Array[Any] => DatabaseQueryCommand,
    inc: Double => DatabaseUpdateCommand,
    lt: Any => DatabaseQueryCommand,
    lte: Any => DatabaseQueryCommand,
    mul: Double => DatabaseUpdateCommand,
    neq: Any => DatabaseQueryCommand,
    nin: Array[Any] => DatabaseQueryCommand,
    or: /* repeated */ DatabaseLogicCommand | IQueryCondition => DatabaseLogicCommand,
    pop: () => DatabaseUpdateCommand,
    push: /* repeated */ Any => DatabaseUpdateCommand,
    remove: () => DatabaseUpdateCommand,
    set: Any => DatabaseUpdateCommand,
    shift: () => DatabaseUpdateCommand,
    unshift: /* repeated */ Any => DatabaseUpdateCommand
  ): DatabaseCommand = {
    val __obj = js.Dynamic.literal(and = js.Any.fromFunction1(and), gt = js.Any.fromFunction1(gt), gte = js.Any.fromFunction1(gte), in = js.Any.fromFunction1(in), inc = js.Any.fromFunction1(inc), lt = js.Any.fromFunction1(lt), lte = js.Any.fromFunction1(lte), mul = js.Any.fromFunction1(mul), neq = js.Any.fromFunction1(neq), nin = js.Any.fromFunction1(nin), or = js.Any.fromFunction1(or), pop = js.Any.fromFunction0(pop), push = js.Any.fromFunction1(push), remove = js.Any.fromFunction0(remove), set = js.Any.fromFunction1(set), shift = js.Any.fromFunction0(shift), unshift = js.Any.fromFunction1(unshift))
    __obj.asInstanceOf[DatabaseCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatabaseCommand] (val x: Self) extends AnyVal {
    
    inline def setAnd(value: /* repeated */ DatabaseLogicCommand | IQueryCondition => DatabaseLogicCommand): Self = StObject.set(x, "and", js.Any.fromFunction1(value))
    
    inline def setGt(value: Any => DatabaseQueryCommand): Self = StObject.set(x, "gt", js.Any.fromFunction1(value))
    
    inline def setGte(value: Any => DatabaseQueryCommand): Self = StObject.set(x, "gte", js.Any.fromFunction1(value))
    
    inline def setIn(value: Array[Any] => DatabaseQueryCommand): Self = StObject.set(x, "in", js.Any.fromFunction1(value))
    
    inline def setInc(value: Double => DatabaseUpdateCommand): Self = StObject.set(x, "inc", js.Any.fromFunction1(value))
    
    inline def setLt(value: Any => DatabaseQueryCommand): Self = StObject.set(x, "lt", js.Any.fromFunction1(value))
    
    inline def setLte(value: Any => DatabaseQueryCommand): Self = StObject.set(x, "lte", js.Any.fromFunction1(value))
    
    inline def setMul(value: Double => DatabaseUpdateCommand): Self = StObject.set(x, "mul", js.Any.fromFunction1(value))
    
    inline def setNeq(value: Any => DatabaseQueryCommand): Self = StObject.set(x, "neq", js.Any.fromFunction1(value))
    
    inline def setNin(value: Array[Any] => DatabaseQueryCommand): Self = StObject.set(x, "nin", js.Any.fromFunction1(value))
    
    inline def setOr(value: /* repeated */ DatabaseLogicCommand | IQueryCondition => DatabaseLogicCommand): Self = StObject.set(x, "or", js.Any.fromFunction1(value))
    
    inline def setPop(value: () => DatabaseUpdateCommand): Self = StObject.set(x, "pop", js.Any.fromFunction0(value))
    
    inline def setPush(value: /* repeated */ Any => DatabaseUpdateCommand): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
    
    inline def setRemove(value: () => DatabaseUpdateCommand): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    
    inline def setSet(value: Any => DatabaseUpdateCommand): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    
    inline def setShift(value: () => DatabaseUpdateCommand): Self = StObject.set(x, "shift", js.Any.fromFunction0(value))
    
    inline def setUnshift(value: /* repeated */ Any => DatabaseUpdateCommand): Self = StObject.set(x, "unshift", js.Any.fromFunction1(value))
  }
}
