package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObjectClassesAdmin extends js.Object {
  val Count: Double = js.native
  def Add(Index: Double, ObjectClassAdmin: IObjectClassAdmin): Unit = js.native
  def Item(Index: Double): IObjectClassAdmin = js.native
  def Remove(Index: Double): Unit = js.native
}

object IObjectClassesAdmin {
  @scala.inline
  def apply(
    Add: (Double, IObjectClassAdmin) => Unit,
    Count: Double,
    Item: Double => IObjectClassAdmin,
    Remove: Double => Unit
  ): IObjectClassesAdmin = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
    __obj.asInstanceOf[IObjectClassesAdmin]
  }
  @scala.inline
  implicit class IObjectClassesAdminOps[Self <: IObjectClassesAdmin] (val x: Self) extends AnyVal {
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
    def setAdd(value: (Double, IObjectClassAdmin) => Unit): Self = this.set("Add", js.Any.fromFunction2(value))
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: Double => IObjectClassAdmin): Self = this.set("Item", js.Any.fromFunction1(value))
    @scala.inline
    def setRemove(value: Double => Unit): Self = this.set("Remove", js.Any.fromFunction1(value))
  }
  
}

