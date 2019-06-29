package typings
package offscreencanvasLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window
  extends stdLib.EventTarget
     with stdLib.WindowTimers
     with stdLib.WindowSessionStorage
     with stdLib.WindowLocalStorage
     with stdLib.WindowConsole
     with stdLib.GlobalEventHandlers
     with stdLib.IDBEnvironment
     with stdLib.WindowBase64
     with stdLib.WindowOrWorkerGlobalScope
     with stdLib.WindowEventHandlers {
  /* InferMemberOverrides */
  override val indexedDB: stdLib.IDBFactory = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: stdLib.EventListenerOrEventListenerObject): scala.Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    listener: stdLib.EventListenerOrEventListenerObject,
    options: scala.Boolean
  ): scala.Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    listener: stdLib.EventListenerOrEventListenerObject,
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  /* InferMemberOverrides */
  override def atob(data: java.lang.String): java.lang.String = js.native
  /* InferMemberOverrides */
  override def btoa(data: java.lang.String): java.lang.String = js.native
  def postMessage(message: js.Any, targetOrigin: java.lang.String): scala.Unit = js.native
  def postMessage(
    message: js.Any,
    targetOrigin: java.lang.String,
    transfer: js.Array[stdLib.Transferable | OffscreenCanvas]
  ): scala.Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: stdLib.EventListenerOrEventListenerObject): scala.Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    listener: stdLib.EventListenerOrEventListenerObject,
    options: scala.Boolean
  ): scala.Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    listener: stdLib.EventListenerOrEventListenerObject,
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
}

