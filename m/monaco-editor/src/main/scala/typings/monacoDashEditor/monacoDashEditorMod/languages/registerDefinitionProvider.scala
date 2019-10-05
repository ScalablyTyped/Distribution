package typings.monacoDashEditor.monacoDashEditorMod.languages

import typings.monacoDashEditor.monacoDashEditorMod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monaco-editor", "languages.registerDefinitionProvider")
@js.native
object registerDefinitionProvider extends js.Object {
  def apply(languageId: String, provider: DefinitionProvider): IDisposable = js.native
}

