package typings.openseadragon.mod

import typings.openseadragon.anon.Buttons
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openseadragon", "ButtonGroup")
@js.native
class ButtonGroup protected () extends js.Object {
  def this(options: Buttons) = this()
  var buttons: js.Array[Button] = js.native
  var element: Element = js.native
  var tracker: MouseTracker = js.native
}

