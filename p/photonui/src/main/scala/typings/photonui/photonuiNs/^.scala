package typings.photonui.photonuiNs

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("photonui")
@js.native
object ^ extends js.Object {
  // Methods
  def domInsert(widget: Widget): Unit = js.native
  def domInsert(widget: Widget, element: String): Unit = js.native
  def domInsert(widget: Widget, element: HTMLElement): Unit = js.native
  def getWidget(name: String): Widget = js.native
}

