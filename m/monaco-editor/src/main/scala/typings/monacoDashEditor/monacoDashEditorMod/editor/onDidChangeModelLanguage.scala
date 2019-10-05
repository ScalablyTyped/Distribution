package typings.monacoDashEditor.monacoDashEditorMod.editor

import typings.monacoDashEditor.Anon_Model
import typings.monacoDashEditor.monacoDashEditorMod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monaco-editor", "editor.onDidChangeModelLanguage")
@js.native
object onDidChangeModelLanguage extends js.Object {
  def apply(listener: js.Function1[/* e */ Anon_Model, Unit]): IDisposable = js.native
}

