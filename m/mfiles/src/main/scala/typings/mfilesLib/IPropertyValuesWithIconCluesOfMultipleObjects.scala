package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPropertyValuesWithIconCluesOfMultipleObjects extends js.Object {
  val Count: scala.Double
  def Clone(): IPropertyValuesWithIconCluesOfMultipleObjects
  def Item(Index: scala.Double): IPropertyValuesWithIconClues
}

object IPropertyValuesWithIconCluesOfMultipleObjects {
  @scala.inline
  def apply(
    Clone: () => IPropertyValuesWithIconCluesOfMultipleObjects,
    Count: scala.Double,
    Item: scala.Double => IPropertyValuesWithIconClues
  ): IPropertyValuesWithIconCluesOfMultipleObjects = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Count = Count, Item = js.Any.fromFunction1(Item))
  
    __obj.asInstanceOf[IPropertyValuesWithIconCluesOfMultipleObjects]
  }
}

