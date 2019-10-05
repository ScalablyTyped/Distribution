package typings.monacoDashEditor.monacoDashEditorMod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EndOfLineSequence extends js.Object

@JSImport("monaco-editor", "editor.EndOfLineSequence")
@js.native
object EndOfLineSequence extends js.Object {
  /**
    * Use carriage return and line feed (\r\n) as the end of line character.
    */
  @js.native
  sealed trait CRLF extends EndOfLineSequence
  
  /**
    * Use line feed (\n) as the end of line character.
    */
  @js.native
  sealed trait LF extends EndOfLineSequence
  
  /* 1 */ val CRLF: typings.monacoDashEditor.monacoDashEditorMod.editor.EndOfLineSequence.CRLF with Double = js.native
  /* 0 */ val LF: typings.monacoDashEditor.monacoDashEditorMod.editor.EndOfLineSequence.LF with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EndOfLineSequence with Double] = js.native
}

