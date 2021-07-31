package typings.monacoEditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("monaco-editor", "CancellationTokenSource")
@js.native
class CancellationTokenSource () extends StObject {
  def this(parent: CancellationToken) = this()
  
  def cancel(): Unit = js.native
  
  def dispose(): Unit = js.native
  def dispose(cancel: Boolean): Unit = js.native
  
  def token: CancellationToken = js.native
}
