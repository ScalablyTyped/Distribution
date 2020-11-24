package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("monaco-editor", "editor.onDidCreateEditor")
@js.native
object onDidCreateEditor extends js.Object {
  
  def apply(listener: js.Function1[/* codeEditor */ ICodeEditor, Unit]): IDisposable = js.native
}
