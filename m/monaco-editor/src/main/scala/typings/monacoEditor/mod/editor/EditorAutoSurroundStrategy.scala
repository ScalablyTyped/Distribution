package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.monacoEditor.monacoEditorStrings.languageDefined
  - typings.monacoEditor.monacoEditorStrings.quotes
  - typings.monacoEditor.monacoEditorStrings.brackets
  - typings.monacoEditor.monacoEditorStrings.never
*/
trait EditorAutoSurroundStrategy extends js.Object

object EditorAutoSurroundStrategy {
  @scala.inline
  def brackets: typings.monacoEditor.monacoEditorStrings.brackets = this.cast("brackets")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def languageDefined: typings.monacoEditor.monacoEditorStrings.languageDefined = this.cast("languageDefined")
  @scala.inline
  def never: typings.monacoEditor.monacoEditorStrings.never = this.cast("never")
  @scala.inline
  def quotes: typings.monacoEditor.monacoEditorStrings.quotes = this.cast("quotes")
}

