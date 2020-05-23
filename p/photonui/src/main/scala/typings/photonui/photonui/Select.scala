package typings.photonui.photonui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// -----------------------------------
@js.native
trait Select extends Widget {
  var children: js.Array[Widget] = js.native
  var childrenNames: js.Array[String] = js.native
  var iconVisible: Boolean = js.native
  var placeholder: String = js.native
  var popupHeight: Double = js.native
  var popupMaxHeight: Double = js.native
  var popupMaxWidth: Double = js.native
  var popupMinHeight: Double = js.native
  var popupMinWidth: Double = js.native
   // readonly
  var popupOffsetHeight: Double = js.native
  var popupOffsetWidth: Double = js.native
   // readonly
  var popupPadding: Double = js.native
  var popupWidth: Double = js.native
  var value: js.Any = js.native
   // string (maybe)
  def addChild(widget: Widget): Unit = js.native
  def addChild(widget: Widget, layoutOptions: js.Any): Unit = js.native
}

