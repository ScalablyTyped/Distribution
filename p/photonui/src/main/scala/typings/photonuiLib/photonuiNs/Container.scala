package typings
package photonuiLib.photonuiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// -----------------------------------
@JSGlobal("photonui.Container")
@js.native
class Container () extends Widget {
  var child: Widget = js.native
  var childName: java.lang.String = js.native
  var containerNode: stdLib.HTMLElement = js.native
   // readonly
  var horizontalChildExpansion: scala.Boolean = js.native
  var verticalChildExpansion: scala.Boolean = js.native
  def removeChild(widget: Widget): scala.Unit = js.native
}

