package typings.monacoEditor.mod.editor

import typings.monacoEditor.anon.Model
import typings.monacoEditor.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("monaco-editor", "editor.onDidChangeModelLanguage")
@js.native
object onDidChangeModelLanguage extends js.Object {
  
  def apply(listener: js.Function1[/* e */ Model, Unit]): IDisposable = js.native
}
