package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPropertyValueIconClues extends js.Object {
  val Count: scala.Double
  def Clone(): IPropertyValueIconClues
  def Item(Index: scala.Double): IPropertyValueIconClue
}

object IPropertyValueIconClues {
  @scala.inline
  def apply(
    Clone: js.Function0[IPropertyValueIconClues],
    Count: scala.Double,
    Item: js.Function1[scala.Double, IPropertyValueIconClue]
  ): IPropertyValueIconClues = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("Count")(Count)
    __obj.updateDynamic("Item")(Item)
    __obj.asInstanceOf[IPropertyValueIconClues]
  }
}

