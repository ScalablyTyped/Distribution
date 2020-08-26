package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStrings extends js.Object {
  val Count: Double = js.native
  def Add(Index: Double, Item: String): Unit = js.native
  def Clone(): IStrings = js.native
  def CloneFrom(Strings: IStrings): Unit = js.native
  def Item(Index: Double): String = js.native
  def Join(Separator: String): String = js.native
  def Remove(Index: Double): Unit = js.native
}

object IStrings {
  @scala.inline
  def apply(
    Add: (Double, String) => Unit,
    Clone: () => IStrings,
    CloneFrom: IStrings => Unit,
    Count: Double,
    Item: Double => String,
    Join: String => String,
    Remove: Double => Unit
  ): IStrings = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Join = js.Any.fromFunction1(Join), Remove = js.Any.fromFunction1(Remove))
    __obj.asInstanceOf[IStrings]
  }
  @scala.inline
  implicit class IStringsOps[Self <: IStrings] (val x: Self) extends AnyVal {
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
    def setAdd(value: (Double, String) => Unit): Self = this.set("Add", js.Any.fromFunction2(value))
    @scala.inline
    def setClone(value: () => IStrings): Self = this.set("Clone", js.Any.fromFunction0(value))
    @scala.inline
    def setCloneFrom(value: IStrings => Unit): Self = this.set("CloneFrom", js.Any.fromFunction1(value))
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: Double => String): Self = this.set("Item", js.Any.fromFunction1(value))
    @scala.inline
    def setJoin(value: String => String): Self = this.set("Join", js.Any.fromFunction1(value))
    @scala.inline
    def setRemove(value: Double => Unit): Self = this.set("Remove", js.Any.fromFunction1(value))
  }
  
}

