package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monaco-editor", "languages.registerDocumentSemanticTokensProvider")
@js.native
object registerDocumentSemanticTokensProvider extends js.Object {
  def apply(languageId: String, provider: DocumentSemanticTokensProvider): IDisposable = js.native
}

