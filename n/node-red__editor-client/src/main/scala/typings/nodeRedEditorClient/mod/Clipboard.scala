package typings.nodeRedEditorClient.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Clipboard extends StObject {
  
  def copyText(value: Any, element: HTMLElement, msg: String): Boolean = js.native
  
  def `export`(): Unit = js.native
  def `export`(mode: String): Unit = js.native
  
  def `import`(): Unit = js.native
  def `import`(mode: String): Unit = js.native
  
  def init(): Unit = js.native
}
