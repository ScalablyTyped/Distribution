package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.monacoEditor.monacoEditorStrings.always
  - typings.monacoEditor.monacoEditorStrings.auto
  - typings.monacoEditor.monacoEditorStrings.never
*/
trait EditorAutoClosingOvertypeStrategy extends js.Object

object EditorAutoClosingOvertypeStrategy {
  @scala.inline
  def always: typings.monacoEditor.monacoEditorStrings.always = this.cast("always")
  @scala.inline
  def auto: typings.monacoEditor.monacoEditorStrings.auto = this.cast("auto")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def never: typings.monacoEditor.monacoEditorStrings.never = this.cast("never")
}

