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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Add")(Add)
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("Count")(Count)
    __obj.updateDynamic("GetIndexByGUID")(GetIndexByGUID)
    __obj.updateDynamic("Item")(Item)
    __obj.updateDynamic("Remove")(Remove)
    __obj.asInstanceOf[IEventHandlers]
  }
}

