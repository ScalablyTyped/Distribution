package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monaco-editor", "languages.registerHoverProvider")
@js.native
object registerHoverProvider extends js.Object {
  def apply(languageId: String, provider: HoverProvider): IDisposable = js.native
}

