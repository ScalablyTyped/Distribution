package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IIDs extends js.Object {
  val Count: Double = js.native
  def Add(Index: Double, ID: Double): Unit = js.native
  def Clone(): IIDs = js.native
  def IndexOf(ID: Double): Double = js.native
  def Item(Index: Double): Double = js.native
  def Remove(Index: Double): Unit = js.native
  def RemoveAll(ID: Double): Double = js.native
}

object IIDs {
  @scala.inline
  def apply(
    Add: (Double, Double) => Unit,
    Clone: () => IIDs,
    Count: Double,
    IndexOf: Double => Double,
    Item: Double => Double,
    Remove: Double => Unit,
    RemoveAll: Double => Double
  ): IIDs = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], IndexOf = js.Any.fromFunction1(IndexOf), Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove), RemoveAll = js.Any.fromFunction1(RemoveAll))
    __obj.asInstanceOf[IIDs]
  }
  @scala.inline
  implicit class IIDsOps[Self <: IIDs] (val x: Self) extends AnyVal {
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
    def setAdd(value: (Double, Double) => Unit): Self = this.set("Add", js.Any.fromFunction2(value))
    @scala.inline
    def setClone(value: () => IIDs): Self = this.set("Clone", js.Any.fromFunction0(value))
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndexOf(value: Double => Double): Self = this.set("IndexOf", js.Any.fromFunction1(value))
    @scala.inline
    def setItem(value: Double => Double): Self = this.set("Item", js.Any.fromFunction1(value))
    @scala.inline
    def setRemove(value: Double => Unit): Self = this.set("Remove", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveAll(value: Double => Double): Self = this.set("RemoveAll", js.Any.fromFunction1(value))
  }
  
}

