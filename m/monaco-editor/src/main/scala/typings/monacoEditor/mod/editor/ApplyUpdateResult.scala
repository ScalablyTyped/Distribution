package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("monaco-editor", "editor.ApplyUpdateResult")
@js.native
open class ApplyUpdateResult[T] protected () extends StObject {
  def this(newValue: T, didChange: Boolean) = this()
  
  val didChange: Boolean = js.native
  
  val newValue: T = js.native
}
