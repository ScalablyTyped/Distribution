package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("monaco-editor", "editor.createModel")
@js.native
object createModel extends js.Object {
  
  def apply(value: String): ITextModel = js.native
  def apply(value: String, language: js.UndefOr[scala.Nothing], uri: Uri): ITextModel = js.native
  def apply(value: String, language: String): ITextModel = js.native
  def apply(value: String, language: String, uri: Uri): ITextModel = js.native
}
