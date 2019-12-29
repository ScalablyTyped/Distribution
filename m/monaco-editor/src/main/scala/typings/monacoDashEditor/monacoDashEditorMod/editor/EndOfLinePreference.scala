package typings.monacoDashEditor.monacoDashEditorMod.editor

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EndOfLinePreference with Double] = js.native
  /* 2 */ @js.native
  object CRLF extends TopLevel[CRLF with Double]
  
  /* 1 */ @js.native
  object LF extends TopLevel[LF with Double]
  
  /* 0 */ @js.native
  object TextDefined extends TopLevel[TextDefined with Double]
  
}

