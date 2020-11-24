package typings.nodeRedEditorClient.anon

import typings.nodeRedEditorClient.mod.global.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerHide extends js.Object {
  
  var container: JQuery[HTMLElement] = js.native
  
  def hide(): Unit = js.native
  def hide(dispose: Boolean): Unit = js.native
  
  def show(options: Offset): Unit = js.native
}
