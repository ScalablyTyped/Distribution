package typings.minappEnv.DB

import typings.minappEnv.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatabaseCommand extends js.Object {
  def and(expressions: (DatabaseLogicCommand | IQueryCondition)*): DatabaseLogicCommand
  def eq(`val`: js.Any): DatabaseQueryCommand
  def gt(`val`: js.Any): DatabaseQueryCommand
  def gte(`val`: js.Any): DatabaseQueryCommand
  def in(`val`: Array[_]): DatabaseQueryCommand
  def inc(`val`: Double): DatabaseUpdateCommand
  def lt(`val`: js.Any): DatabaseQueryCommand
  def lte(`val`: js.Any): DatabaseQueryCommand
  def mul(`val`: Double): DatabaseUpdateCommand
  def neq(`val`: js.Any): DatabaseQueryCommand
  def nin(`val`: Array[_]): DatabaseQueryCommand
  def or(expressions: (DatabaseLogicCommand | IQueryCondition)*): DatabaseLogicCommand
  def pop(): DatabaseUpdateCommand
  def push(values: js.Any*): DatabaseUpdateCommand
  def remove(): DatabaseUpdateCommand
  def set(`val`: js.Any): DatabaseUpdateCommand
  def shift(): DatabaseUpdateCommand
  def unshift(values: js.Any*): DatabaseUpdateCommand
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
}

