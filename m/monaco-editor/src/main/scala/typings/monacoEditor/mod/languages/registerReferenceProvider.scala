package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monaco-editor", "languages.registerReferenceProvider")
@js.native
object registerReferenceProvider extends js.Object {
  def apply(languageId: String, provider: ReferenceProvider): IDisposable = js.native
}

