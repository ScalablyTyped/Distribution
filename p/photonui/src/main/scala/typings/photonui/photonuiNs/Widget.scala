package typings.photonui.photonuiNs

import org.scalablytyped.runtime.StringDictionary
import typings.photonui.Anon_X
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("photonui.Widget")
@js.native
class Widget () extends Base {
  var absolutePosition: Anon_X = js.native
   // readonly
  var contextMenu: PopupWindow = js.native
  var contextMenuName: String = js.native
  var html: HTMLElement = js.native
   // readonly
  var layoutOptions: StringDictionary[js.Any] = js.native
  var name: String = js.native
   // readonly
  var offsetHeight: Double = js.native
  var offsetWidth: Double = js.native
   // readonly
  var parent: Widget = js.native
  var parentName: String = js.native
  var tooltip: String = js.native
  var visible: Boolean = js.native
  def addClass(className: String): Unit = js.native
  def hide(): Unit = js.native
  def removeClass(className: String): Unit = js.native
  def show(): Unit = js.native
  def unparent(): Unit = js.native
}

/* static members */
@JSGlobal("photonui.Widget")
@js.native
object Widget extends js.Object {
  def domInsert(widget: Widget): Unit = js.native
  def domInsert(widget: Widget, element: String): Unit = js.native
  def domInsert(widget: Widget, element: HTMLElement): Unit = js.native
  def getWidget(name: String): Widget = js.native
}

