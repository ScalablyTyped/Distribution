package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPropertyValuesWithIconCluesOfMultipleObjects extends js.Object {
  val Count: Double
  def Clone(): IPropertyValuesWithIconCluesOfMultipleObjects
  def Item(Index: Double): IPropertyValuesWithIconClues
}

object IPropertyValuesWithIconCluesOfMultipleObjects {
  @scala.inline
  def apply(
    Clone: () => IPropertyValuesWithIconCluesOfMultipleObjects,
    Count: Double,
    Item: Double => IPropertyValuesWithIconClues
  ): IPropertyValuesWithIconCluesOfMultipleObjects = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
  
    __obj.asInstanceOf[IPropertyValuesWithIconCluesOfMultipleObjects]
  }
}

