package typings.photonui.global.photonui

import org.scalablytyped.runtime.StringDictionary
import typings.photonui.anon.X
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("photonui.Canvas")
@js.native
class Canvas ()
  extends typings.photonui.photonui.Canvas {
  /* CompleteClass */
  override var absolutePosition: X = js.native
  /* CompleteClass */
  override var canvas: HTMLElement = js.native
   // readonly
  /* CompleteClass */
  override var contextMenu: typings.photonui.photonui.PopupWindow = js.native
  /* CompleteClass */
  override var contextMenuName: String = js.native
  /* CompleteClass */
  override var height: Double = js.native
  /* CompleteClass */
  override var html: HTMLElement = js.native
  /* CompleteClass */
  override var interactiveMode: HTMLElement = js.native
   // readonly
  /* CompleteClass */
  override var layoutOptions: StringDictionary[js.Any] = js.native
  /* CompleteClass */
  override var name: String = js.native
   // readonly
  /* CompleteClass */
  override var offsetHeight: Double = js.native
  /* CompleteClass */
  override var offsetWidth: Double = js.native
   // readonly
  /* CompleteClass */
  override var parent: typings.photonui.photonui.Widget = js.native
  /* CompleteClass */
  override var parentName: String = js.native
  /* CompleteClass */
  override var tooltip: String = js.native
  /* CompleteClass */
  override var visible: Boolean = js.native
  /* CompleteClass */
  override var width: Double = js.native
  /* CompleteClass */
  override def addClass(className: String): Unit = js.native
  /* CompleteClass */
  override def destroy(): Unit = js.native
  /* CompleteClass */
  override def getContext(contextId: String): js.Any = js.native
  /* CompleteClass */
  override def hide(): Unit = js.native
  /* CompleteClass */
  override def registerCallback(id: String, wEvent: String, callback: js.Function, thisArg: js.Any): Unit = js.native
  /* CompleteClass */
  override def removeCallback(id: String): Unit = js.native
  /* CompleteClass */
  override def removeClass(className: String): Unit = js.native
  /* CompleteClass */
  override def setContext(contextId: String): Unit = js.native
  /* CompleteClass */
  override def show(): Unit = js.native
  /* CompleteClass */
  override def supportsContext(contextId: String): Boolean = js.native
  /* CompleteClass */
  override def toBlod(imageFormat: String): js.Any = js.native
   // returns Blob
  /* CompleteClass */
  override def toBlodHD(imageFormat: String): js.Any = js.native
   // returns Blob
  /* CompleteClass */
  override def toDataUrl(imageFormat: String): String = js.native
  /* CompleteClass */
  override def toDataUrlHD(imageFormat: String): String = js.native
  /* CompleteClass */
  override def transferControlToProxy(): Unit = js.native
  /* CompleteClass */
  override def unparent(): Unit = js.native
}

