package typings.photonui.global.photonui

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("photonui.MouseManager")
@js.native
class MouseManager ()
  extends typings.photonui.photonui.MouseManager {
  def this(element: typings.photonui.photonui.Widget) = this()
  def this(element: HTMLElement) = this()
  def this(params: StringDictionary[js.Any]) = this()
  def this(element: typings.photonui.photonui.Widget, params: StringDictionary[js.Any]) = this()
  def this(element: HTMLElement, params: StringDictionary[js.Any]) = this()
  /* CompleteClass */
  override var action: String = js.native
   // readonly
  /* CompleteClass */
  override var btnLeft: Boolean = js.native
   // readonly
  /* CompleteClass */
  override var btnMiddle: Boolean = js.native
   // readonly
  /* CompleteClass */
  override var btnRight: Boolean = js.native
   // readonly
  /* CompleteClass */
  override var button: String = js.native
   // readonly
  /* CompleteClass */
  override var deltaX: Double = js.native
   // readonly
  /* CompleteClass */
  override var deltaY: Double = js.native
  /* CompleteClass */
  override var element: HTMLElement = js.native
   // readonly
  /* CompleteClass */
  override var pageX: Double = js.native
   // readonly
  /* CompleteClass */
  override var pageY: Double = js.native
  /* CompleteClass */
  override var threshold: Double = js.native
   // readonly
  /* CompleteClass */
  override var x: Double = js.native
   // readonly
  /* CompleteClass */
  override var y: Double = js.native
  /* CompleteClass */
  override def destroy(): Unit = js.native
  /* CompleteClass */
  override def registerCallback(id: String, wEvent: String, callback: js.Function, thisArg: js.Any): Unit = js.native
  /* CompleteClass */
  override def removeCallback(id: String): Unit = js.native
}

