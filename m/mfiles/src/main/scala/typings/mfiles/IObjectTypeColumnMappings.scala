package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObjectTypeColumnMappings extends js.Object {
  val Count: Double = js.native
  def Add(Index: Double, ObjectTypeColumnMapping: IObjectTypeColumnMapping): Unit = js.native
  def Clone(): IObjectTypeColumnMappings = js.native
  def Item(Index: Double): IObjectTypeColumnMapping = js.native
  def Remove(Index: Double): Unit = js.native
}

object IObjectTypeColumnMappings {
  @scala.inline
  def apply(
    Add: (Double, IObjectTypeColumnMapping) => Unit,
    Clone: () => IObjectTypeColumnMappings,
    Count: Double,
    Item: Double => IObjectTypeColumnMapping,
    Remove: Double => Unit
  ): IObjectTypeColumnMappings = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
    __obj.asInstanceOf[IObjectTypeColumnMappings]
  }
  @scala.inline
  implicit class IObjectTypeColumnMappingsOps[Self <: IObjectTypeColumnMappings] (val x: Self) extends AnyVal {
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
    def setAdd(value: (Double, IObjectTypeColumnMapping) => Unit): Self = this.set("Add", js.Any.fromFunction2(value))
    @scala.inline
    def setClone(value: () => IObjectTypeColumnMappings): Self = this.set("Clone", js.Any.fromFunction0(value))
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: Double => IObjectTypeColumnMapping): Self = this.set("Item", js.Any.fromFunction1(value))
    @scala.inline
    def setRemove(value: Double => Unit): Self = this.set("Remove", js.Any.fromFunction1(value))
  }
  
}

