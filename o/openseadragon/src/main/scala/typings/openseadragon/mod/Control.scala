package typings.openseadragon.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openseadragon", "Control")
@js.native
class Control protected () extends js.Object {
  def this(element: Element, options: TControlOptions, container: Element) = this()
  var anchor: ControlAnchor = js.native
  var autoFade: Boolean = js.native
  var container: Element = js.native
  var element: Element = js.native
  var wrapper: Element = js.native
  def destroy(): Unit = js.native
  def isVisible(): Boolean = js.native
  def setOpacity(opacity: Double): Unit = js.native
  def setVisible(visible: Boolean): Unit = js.native
}

