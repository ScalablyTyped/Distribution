package typings.photonui.photonui

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("photonui.Layout")
@js.native
class Layout () extends Container {
  var children: js.Array[Widget] = js.native
  var childrenNames: js.Array[String] = js.native
  def addChild(widget: Widget): Unit = js.native
  def addChild(widget: Widget, layoutOptions: StringDictionary[js.Any]): Unit = js.native
  def empty(): Unit = js.native
}

