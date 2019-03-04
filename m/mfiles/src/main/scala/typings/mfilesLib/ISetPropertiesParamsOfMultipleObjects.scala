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
    Add: js.Function2[scala.Double, ISetPropertiesParams, scala.Unit],
    Clone: js.Function0[ISetPropertiesParamsOfMultipleObjects],
    Count: scala.Double,
    Item: js.Function1[scala.Double, ISetPropertiesParams],
    Remove: js.Function1[scala.Double, scala.Unit]
  ): ISetPropertiesParamsOfMultipleObjects = {
    val __obj = js.Dynamic.literal(Add = Add, Clone = Clone, Count = Count, Item = Item, Remove = Remove)
  
    __obj.asInstanceOf[ISetPropertiesParamsOfMultipleObjects]
  }
}

