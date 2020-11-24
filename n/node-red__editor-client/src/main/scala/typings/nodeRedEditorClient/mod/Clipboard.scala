package typings.nodeRedEditorClient.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Clipboard extends js.Object {
  
  def copyText(value: js.Any, element: HTMLElement, msg: String): Boolean = js.native
  
  def export(): Unit = js.native
  def export(mode: String): Unit = js.native
  
  def `import`(): Unit = js.native
  def `import`(mode: String): Unit = js.native
  
  def init(): Unit = js.native
}
