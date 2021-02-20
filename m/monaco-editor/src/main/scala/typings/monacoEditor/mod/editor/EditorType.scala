package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EditorType {
  
  @JSImport("monaco-editor", "editor.EditorType")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("monaco-editor", "editor.EditorType.ICodeEditor")
  @js.native
  def ICodeEditor: String = js.native
  @scala.inline
  def ICodeEditor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ICodeEditor")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorType.IDiffEditor")
  @js.native
  def IDiffEditor: String = js.native
  @scala.inline
  def IDiffEditor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IDiffEditor")(x.asInstanceOf[js.Any])
}
