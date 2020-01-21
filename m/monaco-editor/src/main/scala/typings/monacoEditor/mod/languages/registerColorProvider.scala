package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monaco-editor", "languages.registerColorProvider")
@js.native
object registerColorProvider extends js.Object {
  def apply(languageId: String, provider: DocumentColorProvider): IDisposable = js.native
}

