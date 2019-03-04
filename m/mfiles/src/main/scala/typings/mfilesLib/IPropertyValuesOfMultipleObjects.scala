package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPropertyValuesOfMultipleObjects extends js.Object {
  val Count: scala.Double
  def Clone(): IPropertyValuesOfMultipleObjects
  def Item(Index: scala.Double): IPropertyValues
}

object IPropertyValuesOfMultipleObjects {
  @scala.inline
  def apply(
    Clone: js.Function0[IPropertyValuesOfMultipleObjects],
    Count: scala.Double,
    Item: js.Function1[scala.Double, IPropertyValues]
  ): IPropertyValuesOfMultipleObjects = {
    val __obj = js.Dynamic.literal(Clone = Clone, Count = Count, Item = Item)
  
    __obj.asInstanceOf[IPropertyValuesOfMultipleObjects]
  }
}

