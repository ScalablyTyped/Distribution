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
    Clone: () => IPropertyValuesOfMultipleObjects,
    Count: scala.Double,
    Item: scala.Double => IPropertyValues
  ): IPropertyValuesOfMultipleObjects = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Count = Count, Item = js.Any.fromFunction1(Item))
  
    __obj.asInstanceOf[IPropertyValuesOfMultipleObjects]
  }
}

