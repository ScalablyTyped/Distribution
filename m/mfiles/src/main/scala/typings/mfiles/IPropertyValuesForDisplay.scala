package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPropertyValuesForDisplay extends js.Object {
  val Count: Double
  def Item(Index: Double): IPropertyValueForDisplay
}

object IPropertyValuesForDisplay {
  @scala.inline
  def apply(Count: Double, Item: Double => IPropertyValueForDisplay): IPropertyValuesForDisplay = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[IPropertyValuesForDisplay]
  }
}

