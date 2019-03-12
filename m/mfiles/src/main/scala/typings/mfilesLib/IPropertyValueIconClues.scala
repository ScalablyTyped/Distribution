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
    Clone: () => IPropertyValueIconClues,
    Count: scala.Double,
    Item: scala.Double => IPropertyValueIconClue
  ): IPropertyValueIconClues = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Count = Count, Item = js.Any.fromFunction1(Item))
  
    __obj.asInstanceOf[IPropertyValueIconClues]
  }
}

