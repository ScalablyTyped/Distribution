package typings.monacoDashEditor.monacoDashEditorMod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DefaultEndOfLine extends js.Object

@JSImport("monaco-editor", "editor.DefaultEndOfLine")
@js.native
object DefaultEndOfLine extends js.Object {
  /**
    * Use carriage return and line feed (\r\n) as the end of line character.
    */
  @js.native
  sealed trait CRLF extends DefaultEndOfLine
  
  /**
    * Use line feed (\n) as the end of line character.
    */
  @js.native
  sealed trait LF extends DefaultEndOfLine
  
  /* 2 */ val CRLF: typings.monacoDashEditor.monacoDashEditorMod.editor.DefaultEndOfLine.CRLF with Double = js.native
  /* 1 */ val LF: typings.monacoDashEditor.monacoDashEditorMod.editor.DefaultEndOfLine.LF with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DefaultEndOfLine with Double] = js.native
}

