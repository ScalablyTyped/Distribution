package typings.offscreencanvas

import typings.std.AddEventListenerOptions
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.EventTarget
import typings.std.GlobalEventHandlers
import typings.std.IDBEnvironment
import typings.std.IDBFactory
import typings.std.Transferable
import typings.std.WindowBase64
import typings.std.WindowConsole
import typings.std.WindowEventHandlers
import typings.std.WindowLocalStorage
import typings.std.WindowOrWorkerGlobalScope
import typings.std.WindowSessionStorage
import typings.std.WindowTimers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window
  extends EventTarget
     with WindowTimers
     with WindowSessionStorage
     with WindowLocalStorage
     with WindowConsole
     with GlobalEventHandlers
     with IDBEnvironment
     with WindowBase64
     with WindowOrWorkerGlobalScope
     with WindowEventHandlers {
  /* InferMemberOverrides */
  override val indexedDB: IDBFactory = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
  /* InferMemberOverrides */
  override def atob(data: String): String = js.native
  /* InferMemberOverrides */
  override def btoa(data: String): String = js.native
  def postMessage(message: js.Any, targetOrigin: String): Unit = js.native
  def postMessage(message: js.Any, targetOrigin: String, transfer: js.Array[Transferable | OffscreenCanvas]): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
}

