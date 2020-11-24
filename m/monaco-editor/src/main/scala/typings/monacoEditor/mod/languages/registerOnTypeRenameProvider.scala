package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("monaco-editor", "languages.registerOnTypeRenameProvider")
@js.native
object registerOnTypeRenameProvider extends js.Object {
  
  def apply(languageId: String, provider: OnTypeRenameProvider): IDisposable = js.native
}
