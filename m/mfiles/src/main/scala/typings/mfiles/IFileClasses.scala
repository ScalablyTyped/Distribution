package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFileClasses extends js.Object {
  val Count: Double = js.native
  def Add(Index: Double, FileClass: IFileClass): Unit = js.native
  def Clone(): IFileClasses = js.native
  def Item(Index: Double): IFileClass = js.native
  def Remove(Index: Double): Unit = js.native
}

object IFileClasses {
  @scala.inline
  def apply(
    Add: (Double, IFileClass) => Unit,
    Clone: () => IFileClasses,
    Count: Double,
    Item: Double => IFileClass,
    Remove: Double => Unit
  ): IFileClasses = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
    __obj.asInstanceOf[IFileClasses]
  }
  @scala.inline
  implicit class IFileClassesOps[Self <: IFileClasses] (val x: Self) extends AnyVal {
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
    def setAdd(value: (Double, IFileClass) => Unit): Self = this.set("Add", js.Any.fromFunction2(value))
    @scala.inline
    def setClone(value: () => IFileClasses): Self = this.set("Clone", js.Any.fromFunction0(value))
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: Double => IFileClass): Self = this.set("Item", js.Any.fromFunction1(value))
    @scala.inline
    def setRemove(value: Double => Unit): Self = this.set("Remove", js.Any.fromFunction1(value))
  }
  
}

