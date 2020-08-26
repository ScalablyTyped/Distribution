package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStateTransitions extends js.Object {
  val Count: Double = js.native
  def Add(Index: Double, StateTransition: IStateTransition): Unit = js.native
  def Item(Index: Double): IStateTransition = js.native
  def Remove(Index: Double): Unit = js.native
}

object IStateTransitions {
  @scala.inline
  def apply(
    Add: (Double, IStateTransition) => Unit,
    Count: Double,
    Item: Double => IStateTransition,
    Remove: Double => Unit
  ): IStateTransitions = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
    __obj.asInstanceOf[IStateTransitions]
  }
  @scala.inline
  implicit class IStateTransitionsOps[Self <: IStateTransitions] (val x: Self) extends AnyVal {
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
    def setAdd(value: (Double, IStateTransition) => Unit): Self = this.set("Add", js.Any.fromFunction2(value))
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: Double => IStateTransition): Self = this.set("Item", js.Any.fromFunction1(value))
    @scala.inline
    def setRemove(value: Double => Unit): Self = this.set("Remove", js.Any.fromFunction1(value))
  }
  
}

