package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISetPropertiesParamsOfMultipleObjects extends js.Object {
  val Count: scala.Double
  def Add(Index: scala.Double, SetPropertiesParams: ISetPropertiesParams): scala.Unit
  def Clone(): ISetPropertiesParamsOfMultipleObjects
  def Item(Index: scala.Double): ISetPropertiesParams
  def Remove(Index: scala.Double): scala.Unit
}

object ISetPropertiesParamsOfMultipleObjects {
  @scala.inline
  def apply(
    Add: (scala.Double, ISetPropertiesParams) => scala.Unit,
    Clone: () => ISetPropertiesParamsOfMultipleObjects,
    Count: scala.Double,
    Item: scala.Double => ISetPropertiesParams,
    Remove: scala.Double => scala.Unit
  ): ISetPropertiesParamsOfMultipleObjects = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count, Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
  
    __obj.asInstanceOf[ISetPropertiesParamsOfMultipleObjects]
  }
}

