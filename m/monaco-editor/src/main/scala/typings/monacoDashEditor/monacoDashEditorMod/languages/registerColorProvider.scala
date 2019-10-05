package typings.monacoDashEditor.monacoDashEditorMod.languages

import typings.monacoDashEditor.monacoDashEditorMod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monaco-editor", "languages.registerColorProvider")
@js.native
object registerColorProvider extends js.Object {
  def apply(languageId: String, provider: DocumentColorProvider): IDisposable = js.native
}

