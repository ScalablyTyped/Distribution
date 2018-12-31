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

