package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.monacoEditor.monacoEditorStrings.always
  - typings.monacoEditor.monacoEditorStrings.languageDefined
  - typings.monacoEditor.monacoEditorStrings.beforeWhitespace
  - typings.monacoEditor.monacoEditorStrings.never
*/
trait EditorAutoClosingStrategy extends js.Object

object EditorAutoClosingStrategy {
  @scala.inline
  def always: typings.monacoEditor.monacoEditorStrings.always = this.cast("always")
  @scala.inline
  def beforeWhitespace: typings.monacoEditor.monacoEditorStrings.beforeWhitespace = this.cast("beforeWhitespace")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def languageDefined: typings.monacoEditor.monacoEditorStrings.languageDefined = this.cast("languageDefined")
  @scala.inline
  def never: typings.monacoEditor.monacoEditorStrings.never = this.cast("never")
}

