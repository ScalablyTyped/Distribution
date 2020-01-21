package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.monacoEditor.monacoEditorStrings.vs
  - typings.monacoEditor.monacoEditorStrings.`vs-dark`
  - typings.monacoEditor.monacoEditorStrings.`hc-black`
*/
trait BuiltinTheme extends js.Object

object BuiltinTheme {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `hc-black`: typings.monacoEditor.monacoEditorStrings.`hc-black` = this.cast("hc-black")
  @scala.inline
  def vs: typings.monacoEditor.monacoEditorStrings.vs = this.cast("vs")
  @scala.inline
  def `vs-dark`: typings.monacoEditor.monacoEditorStrings.`vs-dark` = this.cast("vs-dark")
}

