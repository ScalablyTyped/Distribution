package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monaco-editor", "editor.colorizeModelLine")
@js.native
object colorizeModelLine extends js.Object {
  def apply(model: ITextModel, lineNumber: Double): String = js.native
  def apply(model: ITextModel, lineNumber: Double, tabSize: Double): String = js.native
}

