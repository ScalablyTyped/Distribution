package typings.monacoDashEditor.monacoDashEditorMod.languages

import typings.monacoDashEditor.monacoDashEditorMod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monaco-editor", "languages.registerCodeActionProvider")
@js.native
object registerCodeActionProvider extends js.Object {
  def apply(languageId: String, provider: CodeActionProvider): IDisposable = js.native
}

