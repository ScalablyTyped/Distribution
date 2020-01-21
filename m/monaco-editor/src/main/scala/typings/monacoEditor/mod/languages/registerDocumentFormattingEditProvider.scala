package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monaco-editor", "languages.registerDocumentFormattingEditProvider")
@js.native
object registerDocumentFormattingEditProvider extends js.Object {
  def apply(languageId: String, provider: DocumentFormattingEditProvider): IDisposable = js.native
}

