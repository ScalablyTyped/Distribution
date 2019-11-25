package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEventHandlers extends js.Object {
  val Count: Double
  def Add(Index: Double, EventHandler: IEventHandler): Unit
  def Clone(): IEventHandlers
  def GetIndexByGUID(EventHandlerGUID: String): Double
  def Item(Index: Double): IEventHandler
  def Remove(Index: Double): Unit
}

object IEventHandlers {
  @scala.inline
  def apply(
    Add: (Double, IEventHandler) => Unit,
    Clone: () => IEventHandlers,
    Count: Double,
    GetIndexByGUID: String => Double,
    Item: Double => IEventHandler,
    Remove: Double => Unit
  ): IEventHandlers = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], GetIndexByGUID = js.Any.fromFunction1(GetIndexByGUID), Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
  
    __obj.asInstanceOf[IEventHandlers]
  }
}

