package typings.monacoDashEditor.monacoDashEditorMod.languages

import typings.monacoDashEditor.monacoDashEditorMod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monaco-editor", "languages.registerTypeDefinitionProvider")
@js.native
object registerTypeDefinitionProvider extends js.Object {
  def apply(languageId: String, provider: TypeDefinitionProvider): IDisposable = js.native
}

