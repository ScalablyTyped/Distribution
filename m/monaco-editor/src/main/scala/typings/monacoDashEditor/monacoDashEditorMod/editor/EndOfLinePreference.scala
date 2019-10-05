package typings.monacoDashEditor.monacoDashEditorMod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EndOfLinePreference extends js.Object

@JSImport("monaco-editor", "editor.EndOfLinePreference")
@js.native
object EndOfLinePreference extends js.Object {
  /**
    * Use carriage return and line feed (\r\n) as the end of line character.
    */
  @js.native
  sealed trait CRLF extends EndOfLinePreference
  
  /**
    * Use line feed (\n) as the end of line character.
    */
  @js.native
  sealed trait LF extends EndOfLinePreference
  
  /**
    * Use the end of line character identified in the text buffer.
    */
  @js.native
  sealed trait TextDefined extends EndOfLinePreference
  
  /* 2 */ val CRLF: typings.monacoDashEditor.monacoDashEditorMod.editor.EndOfLinePreference.CRLF with Double = js.native
  /* 1 */ val LF: typings.monacoDashEditor.monacoDashEditorMod.editor.EndOfLinePreference.LF with Double = js.native
  /* 0 */ val TextDefined: typings.monacoDashEditor.monacoDashEditorMod.editor.EndOfLinePreference.TextDefined with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EndOfLinePreference with Double] = js.native
}

