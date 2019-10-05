package typings.photonui.photonui

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// -----------------------------------
@JSGlobal("photonui.Container")
@js.native
class Container () extends Widget {
  var child: Widget = js.native
  var childName: String = js.native
  var containerNode: HTMLElement = js.native
   // readonly
  var horizontalChildExpansion: Boolean = js.native
  var verticalChildExpansion: Boolean = js.native
  def removeChild(widget: Widget): Unit = js.native
}

