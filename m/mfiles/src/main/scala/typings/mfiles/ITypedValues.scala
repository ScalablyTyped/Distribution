package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITypedValues extends js.Object {
  val Count: Double
  def Add(Index: Double, TypedValue: ITypedValue): Unit
  def Item(Index: Double): ITypedValue
  def Remove(Index: Double): Unit
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
}

