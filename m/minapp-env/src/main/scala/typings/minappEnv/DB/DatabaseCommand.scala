package typings.minappEnv.DB

import typings.minappEnv.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatabaseCommand extends js.Object {
  
  def and(expressions: (DatabaseLogicCommand | IQueryCondition)*): DatabaseLogicCommand = js.native
  
  def eq(`val`: js.Any): DatabaseQueryCommand = js.native
  
  def gt(`val`: js.Any): DatabaseQueryCommand = js.native
  
  def gte(`val`: js.Any): DatabaseQueryCommand = js.native
  
  def in(`val`: Array[_]): DatabaseQueryCommand = js.native
  
  def inc(`val`: Double): DatabaseUpdateCommand = js.native
  
  def lt(`val`: js.Any): DatabaseQueryCommand = js.native
  
  def lte(`val`: js.Any): DatabaseQueryCommand = js.native
  
  def mul(`val`: Double): DatabaseUpdateCommand = js.native
  
  def neq(`val`: js.Any): DatabaseQueryCommand = js.native
  
  def nin(`val`: Array[_]): DatabaseQueryCommand = js.native
  
  def or(expressions: (DatabaseLogicCommand | IQueryCondition)*): DatabaseLogicCommand = js.native
  
  def pop(): DatabaseUpdateCommand = js.native
  
  def push(values: js.Any*): DatabaseUpdateCommand = js.native
  
  def remove(): DatabaseUpdateCommand = js.native
  
  def set(`val`: js.Any): DatabaseUpdateCommand = js.native
  
  def shift(): DatabaseUpdateCommand = js.native
  
  def unshift(values: js.Any*): DatabaseUpdateCommand = js.native
}
object DatabaseCommand {
  
  @scala.inline
  def apply(
    and: /* repeated */ DatabaseLogicCommand | IQueryCondition => DatabaseLogicCommand,
    eq: js.Any => DatabaseQueryCommand,
    gt: js.Any => DatabaseQueryCommand,
    gte: js.Any => DatabaseQueryCommand,
    in: Array[_] => DatabaseQueryCommand,
    inc: Double => DatabaseUpdateCommand,
    lt: js.Any => DatabaseQueryCommand,
    lte: js.Any => DatabaseQueryCommand,
    mul: Double => DatabaseUpdateCommand,
    neq: js.Any => DatabaseQueryCommand,
    nin: Array[_] => DatabaseQueryCommand,
    or: /* repeated */ DatabaseLogicCommand | IQueryCondition => DatabaseLogicCommand,
    pop: () => DatabaseUpdateCommand,
    push: /* repeated */ js.Any => DatabaseUpdateCommand,
    remove: () => DatabaseUpdateCommand,
    set: js.Any => DatabaseUpdateCommand,
    shift: () => DatabaseUpdateCommand,
    unshift: /* repeated */ js.Any => DatabaseUpdateCommand
  ): DatabaseCommand = {
    val __obj = js.Dynamic.literal(and = js.Any.fromFunction1(and), eq = js.Any.fromFunction1(eq), gt = js.Any.fromFunction1(gt), gte = js.Any.fromFunction1(gte), in = js.Any.fromFunction1(in), inc = js.Any.fromFunction1(inc), lt = js.Any.fromFunction1(lt), lte = js.Any.fromFunction1(lte), mul = js.Any.fromFunction1(mul), neq = js.Any.fromFunction1(neq), nin = js.Any.fromFunction1(nin), or = js.Any.fromFunction1(or), pop = js.Any.fromFunction0(pop), push = js.Any.fromFunction1(push), remove = js.Any.fromFunction0(remove), set = js.Any.fromFunction1(set), shift = js.Any.fromFunction0(shift), unshift = js.Any.fromFunction1(unshift))
    __obj.asInstanceOf[DatabaseCommand]
  }
  
  @scala.inline
  implicit class DatabaseCommandOps[Self <: DatabaseCommand] (val x: Self) extends AnyVal {
    
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
    def setAnd(value: /* repeated */ DatabaseLogicCommand | IQueryCondition => DatabaseLogicCommand): Self = this.set("and", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEq(value: js.Any => DatabaseQueryCommand): Self = this.set("eq", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGt(value: js.Any => DatabaseQueryCommand): Self = this.set("gt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGte(value: js.Any => DatabaseQueryCommand): Self = this.set("gte", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIn(value: Array[_] => DatabaseQueryCommand): Self = this.set("in", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInc(value: Double => DatabaseUpdateCommand): Self = this.set("inc", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLt(value: js.Any => DatabaseQueryCommand): Self = this.set("lt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLte(value: js.Any => DatabaseQueryCommand): Self = this.set("lte", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMul(value: Double => DatabaseUpdateCommand): Self = this.set("mul", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNeq(value: js.Any => DatabaseQueryCommand): Self = this.set("neq", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNin(value: Array[_] => DatabaseQueryCommand): Self = this.set("nin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOr(value: /* repeated */ DatabaseLogicCommand | IQueryCondition => DatabaseLogicCommand): Self = this.set("or", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPop(value: () => DatabaseUpdateCommand): Self = this.set("pop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPush(value: /* repeated */ js.Any => DatabaseUpdateCommand): Self = this.set("push", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: () => DatabaseUpdateCommand): Self = this.set("remove", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet(value: js.Any => DatabaseUpdateCommand): Self = this.set("set", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShift(value: () => DatabaseUpdateCommand): Self = this.set("shift", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUnshift(value: /* repeated */ js.Any => DatabaseUpdateCommand): Self = this.set("unshift", js.Any.fromFunction1(value))
  }
}
