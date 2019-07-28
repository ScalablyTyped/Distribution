package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISetPropertiesParamsOfMultipleObjects extends js.Object {
  val Count: Double
  def Add(Index: Double, SetPropertiesParams: ISetPropertiesParams): Unit
  def Clone(): ISetPropertiesParamsOfMultipleObjects
  def Item(Index: Double): ISetPropertiesParams
  def Remove(Index: Double): Unit
}

object ISetPropertiesParamsOfMultipleObjects {
  @scala.inline
  def apply(
    Add: (Double, ISetPropertiesParams) => Unit,
    Clone: () => ISetPropertiesParamsOfMultipleObjects,
    Count: Double,
    Item: Double => ISetPropertiesParams,
    Remove: Double => Unit
  ): ISetPropertiesParamsOfMultipleObjects = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count, Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
  
    __obj.asInstanceOf[ISetPropertiesParamsOfMultipleObjects]
  }
}

