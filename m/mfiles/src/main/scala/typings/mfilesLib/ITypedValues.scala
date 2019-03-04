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
    Add: js.Function2[scala.Double, ITypedValue, scala.Unit],
    Count: scala.Double,
    Item: js.Function1[scala.Double, ITypedValue],
    Remove: js.Function1[scala.Double, scala.Unit]
  ): ITypedValues = {
    val __obj = js.Dynamic.literal(Add = Add, Count = Count, Item = Item, Remove = Remove)
  
    __obj.asInstanceOf[ITypedValues]
  }
}

