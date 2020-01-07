package typings.offscreencanvas

import typings.std.AddEventListenerOptions
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.EventTarget
import typings.std.GlobalEventHandlers
import typings.std.Transferable
import typings.std.WindowConsole
import typings.std.WindowEventHandlers
import typings.std.WindowLocalStorage
import typings.std.WindowOrWorkerGlobalScope
import typings.std.WindowSessionStorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window
  extends EventTarget
     with WindowSessionStorage
     with WindowLocalStorage
     with WindowConsole
     with GlobalEventHandlers
     with WindowOrWorkerGlobalScope
     with WindowEventHandlers {
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
  def postMessage(message: js.Any, targetOrigin: String): Unit = js.native
  def postMessage(message: js.Any, targetOrigin: String, transfer: js.Array[Transferable | OffscreenCanvas]): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
}

