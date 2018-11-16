package typings
package photonuiLib.photonuiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("photonui.Widget")
@js.native
class Widget () extends Base {
  var absolutePosition: photonuiLib.Anon_Y = js.native
   // readonly
  var contextMenu: PopupWindow = js.native
  var contextMenuName: java.lang.String = js.native
  var html: stdLib.HTMLElement = js.native
   // readonly
  var layoutOptions: ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  var name: java.lang.String = js.native
   // readonly
  var offsetHeight: scala.Double = js.native
  var offsetWidth: scala.Double = js.native
   // readonly
  var parent: Widget = js.native
  var parentName: java.lang.String = js.native
  var tooltip: java.lang.String = js.native
  var visible: scala.Boolean = js.native
  def addClass(className: java.lang.String): scala.Unit = js.native
  def hide(): scala.Unit = js.native
  def removeClass(className: java.lang.String): scala.Unit = js.native
  def show(): scala.Unit = js.native
  def unparent(): scala.Unit = js.native
}

@JSGlobal("photonui.Widget")
@js.native
object Widget extends js.Object {
  def domInsert(widget: photonuiLib.photonuiNs.Widget): scala.Unit = js.native
  def domInsert(widget: photonuiLib.photonuiNs.Widget, element: java.lang.String): scala.Unit = js.native
  def domInsert(widget: photonuiLib.photonuiNs.Widget, element: stdLib.HTMLElement): scala.Unit = js.native
  def getWidget(name: java.lang.String): photonuiLib.photonuiNs.Widget = js.native
}

