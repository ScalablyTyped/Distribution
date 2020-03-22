package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monaco-editor", "languages.registerDocumentRangeSemanticTokensProvider")
@js.native
object registerDocumentRangeSemanticTokensProvider extends js.Object {
  def apply(languageId: String, provider: DocumentRangeSemanticTokensProvider): IDisposable = js.native
}

