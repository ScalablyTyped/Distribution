package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.EventHandlers")
@js.native
class EventHandlers ()
  extends mfilesLib.IEventHandlers {
  /* CompleteClass */
  override val Count: scala.Double = js.native
  /* CompleteClass */
  override def Add(Index: scala.Double, EventHandler: mfilesLib.IEventHandler): scala.Unit = js.native
  /* CompleteClass */
  override def Clone(): mfilesLib.IEventHandlers = js.native
  /* CompleteClass */
  override def GetIndexByGUID(EventHandlerGUID: java.lang.String): scala.Double = js.native
  /* CompleteClass */
  override def Item(Index: scala.Double): mfilesLib.IEventHandler = js.native
  /* CompleteClass */
  override def Remove(Index: scala.Double): scala.Unit = js.native
}

@JSGlobal("MFiles.EventHandlers")
@js.native
object EventHandlers
  extends org.scalablytyped.runtime.Instantiable0[mfilesLib.IEventHandlers]

