package typings.monacoDashEditor.monacoDashEditorMod.languages

import typings.monacoDashEditor.monacoDashEditorMod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monaco-editor", "languages.registerLinkProvider")
@js.native
object registerLinkProvider extends js.Object {
  def apply(languageId: String, provider: LinkProvider): IDisposable = js.native
}

