package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("monaco-editor", "editor.tokenize")
@js.native
object tokenize extends js.Object {
  
  def apply(text: String, languageId: String): js.Array[js.Array[Token]] = js.native
}
