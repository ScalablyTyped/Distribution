package typings.mfiles.global.MFiles

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.IEventHandler
import typings.mfiles.IEventHandlers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.EventHandlers")
@js.native
class EventHandlers () extends IEventHandlers {
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  override def Add(Index: Double, EventHandler: IEventHandler): Unit = js.native
  /* CompleteClass */
  override def Clone(): IEventHandlers = js.native
  /* CompleteClass */
  override def GetIndexByGUID(EventHandlerGUID: String): Double = js.native
  /* CompleteClass */
  override def Item(Index: Double): IEventHandler = js.native
  /* CompleteClass */
  override def Remove(Index: Double): Unit = js.native
}

@JSGlobal("MFiles.EventHandlers")
@js.native
object EventHandlers extends Instantiable0[IEventHandlers]

