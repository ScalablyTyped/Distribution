package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPropertyValueIconClues extends js.Object {
  val Count: Double
  def Clone(): IPropertyValueIconClues
  def Item(Index: Double): IPropertyValueIconClue
}

object IPropertyValueIconClues {
  @scala.inline
  def apply(Clone: () => IPropertyValueIconClues, Count: Double, Item: Double => IPropertyValueIconClue): IPropertyValueIconClues = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[IPropertyValueIconClues]
  }
}

