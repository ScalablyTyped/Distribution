package typings.monacoDashEditor.monacoDashEditorMod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.monacoDashEditor.monacoDashEditorStrings.languageDefined
  - typings.monacoDashEditor.monacoDashEditorStrings.quotes
  - typings.monacoDashEditor.monacoDashEditorStrings.brackets
  - typings.monacoDashEditor.monacoDashEditorStrings.never
*/
trait EditorAutoSurroundStrategy extends js.Object

object EditorAutoSurroundStrategy {
  @scala.inline
  def brackets: typings.monacoDashEditor.monacoDashEditorStrings.brackets = this.cast("brackets")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def languageDefined: typings.monacoDashEditor.monacoDashEditorStrings.languageDefined = this.cast("languageDefined")
  @scala.inline
  def never: typings.monacoDashEditor.monacoDashEditorStrings.never = this.cast("never")
  @scala.inline
  def quotes: typings.monacoDashEditor.monacoDashEditorStrings.quotes = this.cast("quotes")
}

