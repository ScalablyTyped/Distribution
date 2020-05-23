package typings.photonui.global.photonui

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//Widgets
@JSGlobal("photonui.FileManager")
@js.native
class FileManager ()
  extends typings.photonui.photonui.FileManager {
  /* CompleteClass */
  override var acceptedExts: js.Array[String] = js.native
  /* CompleteClass */
  override var acceptedMimes: js.Array[String] = js.native
  /* CompleteClass */
  override var dropZone: HTMLElement = js.native
  /* CompleteClass */
  override var multiselect: Boolean = js.native
  /* CompleteClass */
  override def destroy(): Unit = js.native
  /* CompleteClass */
  override def open(): Unit = js.native
  /* CompleteClass */
  override def registerCallback(id: String, wEvent: String, callback: js.Function, thisArg: js.Any): Unit = js.native
  /* CompleteClass */
  override def removeCallback(id: String): Unit = js.native
}

