package typings.monacoDashEditor.monacoDashEditorMod.languages

import typings.monacoDashEditor.monacoDashEditorMod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monaco-editor", "languages.registerOnTypeFormattingEditProvider")
@js.native
object registerOnTypeFormattingEditProvider extends js.Object {
  def apply(languageId: String, provider: OnTypeFormattingEditProvider): IDisposable = js.native
}

