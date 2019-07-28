package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICollection extends js.Object {
  val Count: Double
  val Events: IEvents
  def Clear(): Unit
  def Find(item: js.Any): Double
  def GetAt(pos: Double): js.Any
  def MoveTo(pos: Double, newPos: Double): Unit
  def NewTo(pos: Double, replace: Boolean): js.Any
  def PutTo(pos: Double, replace: Boolean, item: js.Any): Unit
  def RemoveAt(pos: Double): Unit
}

object ICollection {
  @scala.inline
  def apply(
    Clear: () => Unit,
    Count: Double,
    Events: IEvents,
    Find: js.Any => Double,
    GetAt: Double => js.Any,
    MoveTo: (Double, Double) => Unit,
    NewTo: (Double, Boolean) => js.Any,
    PutTo: (Double, Boolean, js.Any) => Unit,
    RemoveAt: Double => Unit
  ): ICollection = {
    val __obj = js.Dynamic.literal(Clear = js.Any.fromFunction0(Clear), Count = Count, Events = Events, Find = js.Any.fromFunction1(Find), GetAt = js.Any.fromFunction1(GetAt), MoveTo = js.Any.fromFunction2(MoveTo), NewTo = js.Any.fromFunction2(NewTo), PutTo = js.Any.fromFunction3(PutTo), RemoveAt = js.Any.fromFunction1(RemoveAt))
  
    __obj.asInstanceOf[ICollection]
  }
}

