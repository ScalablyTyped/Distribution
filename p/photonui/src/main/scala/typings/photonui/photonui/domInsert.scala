package typings.photonui.photonui

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("photonui.domInsert")
@js.native
object domInsert extends js.Object {
  // Methods
  def apply(widget: Widget): Unit = js.native
  def apply(widget: Widget, element: String): Unit = js.native
  def apply(widget: Widget, element: HTMLElement): Unit = js.native
}

