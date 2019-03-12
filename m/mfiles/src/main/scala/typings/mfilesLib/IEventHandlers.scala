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
    Add: (scala.Double, IEventHandler) => scala.Unit,
    Clone: () => IEventHandlers,
    Count: scala.Double,
    GetIndexByGUID: java.lang.String => scala.Double,
    Item: scala.Double => IEventHandler,
    Remove: scala.Double => scala.Unit
  ): IEventHandlers = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count, GetIndexByGUID = js.Any.fromFunction1(GetIndexByGUID), Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
  
    __obj.asInstanceOf[IEventHandlers]
  }
}

