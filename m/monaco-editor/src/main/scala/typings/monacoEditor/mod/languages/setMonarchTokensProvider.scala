package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.IDisposable
import typings.monacoEditor.mod.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("monaco-editor", "languages.setMonarchTokensProvider")
@js.native
object setMonarchTokensProvider extends js.Object {
  
  def apply(languageId: String, languageDef: Thenable[IMonarchLanguage]): IDisposable = js.native
  def apply(languageId: String, languageDef: IMonarchLanguage): IDisposable = js.native
}
