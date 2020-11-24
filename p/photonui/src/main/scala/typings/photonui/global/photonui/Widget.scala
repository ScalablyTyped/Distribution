package typings.photonui.global.photonui

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("photonui.Widget")
@js.native
class Widget ()
  extends typings.photonui.photonui.Widget
/* static members */
@JSGlobal("photonui.Widget")
@js.native
object Widget extends js.Object {
  
  def domInsert(widget: typings.photonui.photonui.Widget): Unit = js.native
  def domInsert(widget: typings.photonui.photonui.Widget, element: String): Unit = js.native
  def domInsert(widget: typings.photonui.photonui.Widget, element: HTMLElement): Unit = js.native
  
  def getWidget(name: String): typings.photonui.photonui.Widget = js.native
}
