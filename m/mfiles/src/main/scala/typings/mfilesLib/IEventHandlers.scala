package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEventHandlers extends js.Object {
  val Count: scala.Double
  def Add(Index: scala.Double, EventHandler: IEventHandler): scala.Unit
  def Clone(): IEventHandlers
  def GetIndexByGUID(EventHandlerGUID: java.lang.String): scala.Double
  def Item(Index: scala.Double): IEventHandler
  def Remove(Index: scala.Double): scala.Unit
}

object IEventHandlers {
  @scala.inline
  def apply(
    Add: js.Function2[scala.Double, IEventHandler, scala.Unit],
    Clone: js.Function0[IEventHandlers],
    Count: scala.Double,
    GetIndexByGUID: js.Function1[java.lang.String, scala.Double],
    Item: js.Function1[scala.Double, IEventHandler],
    Remove: js.Function1[scala.Double, scala.Unit]
  ): IEventHandlers = {
    val __obj = js.Dynamic.literal(Add = Add, Clone = Clone, Count = Count, GetIndexByGUID = GetIndexByGUID, Item = Item, Remove = Remove)
  
    __obj.asInstanceOf[IEventHandlers]
  }
}

