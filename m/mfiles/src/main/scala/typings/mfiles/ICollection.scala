package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICollection extends js.Object {
  val Count: Double = js.native
  val Events: IEvents = js.native
  def Clear(): Unit = js.native
  def Find(item: js.Any): Double = js.native
  def GetAt(pos: Double): js.Any = js.native
  def MoveTo(pos: Double, newPos: Double): Unit = js.native
  def NewTo(pos: Double, replace: Boolean): js.Any = js.native
  def PutTo(pos: Double, replace: Boolean, item: js.Any): Unit = js.native
  def RemoveAt(pos: Double): Unit = js.native
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
    val __obj = js.Dynamic.literal(Clear = js.Any.fromFunction0(Clear), Count = Count.asInstanceOf[js.Any], Events = Events.asInstanceOf[js.Any], Find = js.Any.fromFunction1(Find), GetAt = js.Any.fromFunction1(GetAt), MoveTo = js.Any.fromFunction2(MoveTo), NewTo = js.Any.fromFunction2(NewTo), PutTo = js.Any.fromFunction3(PutTo), RemoveAt = js.Any.fromFunction1(RemoveAt))
    __obj.asInstanceOf[ICollection]
  }
  @scala.inline
  implicit class ICollectionOps[Self <: ICollection] (val x: Self) extends AnyVal {
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
    def setClear(value: () => Unit): Self = this.set("Clear", js.Any.fromFunction0(value))
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvents(value: IEvents): Self = this.set("Events", value.asInstanceOf[js.Any])
    @scala.inline
    def setFind(value: js.Any => Double): Self = this.set("Find", js.Any.fromFunction1(value))
    @scala.inline
    def setGetAt(value: Double => js.Any): Self = this.set("GetAt", js.Any.fromFunction1(value))
    @scala.inline
    def setMoveTo(value: (Double, Double) => Unit): Self = this.set("MoveTo", js.Any.fromFunction2(value))
    @scala.inline
    def setNewTo(value: (Double, Boolean) => js.Any): Self = this.set("NewTo", js.Any.fromFunction2(value))
    @scala.inline
    def setPutTo(value: (Double, Boolean, js.Any) => Unit): Self = this.set("PutTo", js.Any.fromFunction3(value))
    @scala.inline
    def setRemoveAt(value: Double => Unit): Self = this.set("RemoveAt", js.Any.fromFunction1(value))
  }
  
}

