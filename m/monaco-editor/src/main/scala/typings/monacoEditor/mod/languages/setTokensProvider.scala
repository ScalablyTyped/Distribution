package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.IDisposable
import typings.monacoEditor.mod.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("monaco-editor", "languages.setTokensProvider")
@js.native
object setTokensProvider extends js.Object {
  
  def apply(languageId: String, provider: Thenable[TokensProvider | EncodedTokensProvider]): IDisposable = js.native
  def apply(languageId: String, provider: EncodedTokensProvider): IDisposable = js.native
  def apply(languageId: String, provider: TokensProvider): IDisposable = js.native
}
