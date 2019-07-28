package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPropertyValuesOfMultipleObjects extends js.Object {
  val Count: Double
  def Clone(): IPropertyValuesOfMultipleObjects
  def Item(Index: Double): IPropertyValues
}

object IPropertyValuesOfMultipleObjects {
  @scala.inline
  def apply(Clone: () => IPropertyValuesOfMultipleObjects, Count: Double, Item: Double => IPropertyValues): IPropertyValuesOfMultipleObjects = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Count = Count, Item = js.Any.fromFunction1(Item))
  
    __obj.asInstanceOf[IPropertyValuesOfMultipleObjects]
  }
}

