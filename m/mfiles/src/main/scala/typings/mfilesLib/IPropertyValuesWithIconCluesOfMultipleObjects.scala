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
    Clone: js.Function0[IPropertyValuesWithIconCluesOfMultipleObjects],
    Count: scala.Double,
    Item: js.Function1[scala.Double, IPropertyValuesWithIconClues]
  ): IPropertyValuesWithIconCluesOfMultipleObjects = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("Count")(Count)
    __obj.updateDynamic("Item")(Item)
    __obj.asInstanceOf[IPropertyValuesWithIconCluesOfMultipleObjects]
  }
}

