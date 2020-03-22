package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.monacoEditor.monacoEditorStrings.peek
  - typings.monacoEditor.monacoEditorStrings.gotoAndPeek
  - typings.monacoEditor.monacoEditorStrings.goto
*/
trait GoToLocationValues extends js.Object

object GoToLocationValues {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def goto: typings.monacoEditor.monacoEditorStrings.goto = this.cast("goto")
  @scala.inline
  def gotoAndPeek: typings.monacoEditor.monacoEditorStrings.gotoAndPeek = this.cast("gotoAndPeek")
  @scala.inline
  def peek: typings.monacoEditor.monacoEditorStrings.peek = this.cast("peek")
}

