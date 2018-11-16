package typings
package photonuiLib.photonuiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("photonui.Layout")
@js.native
class Layout () extends Container {
  var children: js.Array[Widget] = js.native
  var childrenNames: js.Array[java.lang.String] = js.native
  def addChild(widget: Widget): scala.Unit = js.native
  def addChild(widget: Widget, layoutOptions: ScalablyTyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
  def empty(): scala.Unit = js.native
}

