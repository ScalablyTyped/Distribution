package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPropertyValuesForDisplay extends js.Object {
  val Count: scala.Double
  def Item(Index: scala.Double): IPropertyValueForDisplay
}

object IPropertyValuesForDisplay {
  @scala.inline
  def apply(Count: scala.Double, Item: js.Function1[scala.Double, IPropertyValueForDisplay]): IPropertyValuesForDisplay = {
    val __obj = js.Dynamic.literal(Count = Count, Item = Item)
  
    __obj.asInstanceOf[IPropertyValuesForDisplay]
  }
}

