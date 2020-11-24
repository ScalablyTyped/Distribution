package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITypedValues extends js.Object {
  
  def Add(Index: Double, TypedValue: ITypedValue): Unit = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Double): ITypedValue = js.native
  
  def Remove(Index: Double): Unit = js.native
}
object ITypedValues {
  
  @scala.inline
  def apply(
    Add: (Double, ITypedValue) => Unit,
    Count: Double,
    Item: Double => ITypedValue,
    Remove: Double => Unit
  ): ITypedValues = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
    __obj.asInstanceOf[ITypedValues]
  }
  
  @scala.inline
  implicit class ITypedValuesOps[Self <: ITypedValues] (val x: Self) extends AnyVal {
    
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
    def setAdd(value: (Double, ITypedValue) => Unit): Self = this.set("Add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => ITypedValue): Self = this.set("Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: Double => Unit): Self = this.set("Remove", js.Any.fromFunction1(value))
  }
}
