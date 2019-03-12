package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITypedValues extends js.Object {
  val Count: scala.Double
  def Add(Index: scala.Double, TypedValue: ITypedValue): scala.Unit
  def Item(Index: scala.Double): ITypedValue
  def Remove(Index: scala.Double): scala.Unit
}

object ITypedValues {
  @scala.inline
  def apply(
    Add: (scala.Double, ITypedValue) => scala.Unit,
    Count: scala.Double,
    Item: scala.Double => ITypedValue,
    Remove: scala.Double => scala.Unit
  ): ITypedValues = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Count = Count, Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
  
    __obj.asInstanceOf[ITypedValues]
  }
}

