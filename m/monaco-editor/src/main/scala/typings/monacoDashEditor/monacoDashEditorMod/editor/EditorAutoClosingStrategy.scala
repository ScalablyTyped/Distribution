package typings.monacoDashEditor.monacoDashEditorMod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.monacoDashEditor.monacoDashEditorStrings.always
  - typings.monacoDashEditor.monacoDashEditorStrings.languageDefined
  - typings.monacoDashEditor.monacoDashEditorStrings.beforeWhitespace
  - typings.monacoDashEditor.monacoDashEditorStrings.never
*/
trait EditorAutoClosingStrategy extends js.Object

object EditorAutoClosingStrategy {
  @scala.inline
  def always: typings.monacoDashEditor.monacoDashEditorStrings.always = this.cast("always")
  @scala.inline
  def beforeWhitespace: typings.monacoDashEditor.monacoDashEditorStrings.beforeWhitespace = this.cast("beforeWhitespace")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def languageDefined: typings.monacoDashEditor.monacoDashEditorStrings.languageDefined = this.cast("languageDefined")
  @scala.inline
  def never: typings.monacoDashEditor.monacoDashEditorStrings.never = this.cast("never")
}

