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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("Count")(Count)
    __obj.updateDynamic("Item")(Item)
    __obj.asInstanceOf[IPropertyValuesOfMultipleObjects]
  }
}

