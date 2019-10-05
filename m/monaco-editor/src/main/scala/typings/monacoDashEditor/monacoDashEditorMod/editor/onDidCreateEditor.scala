package typings.monacoDashEditor.monacoDashEditorMod.editor

import typings.monacoDashEditor.monacoDashEditorMod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monaco-editor", "editor.onDidCreateEditor")
@js.native
object onDidCreateEditor extends js.Object {
  def apply(listener: js.Function1[/* codeEditor */ ICodeEditor, Unit]): IDisposable = js.native
}

