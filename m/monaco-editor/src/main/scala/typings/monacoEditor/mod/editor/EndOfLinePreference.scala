package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EndOfLinePreference extends js.Object
@JSImport("monaco-editor", "editor.EndOfLinePreference")
@js.native
object EndOfLinePreference extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EndOfLinePreference with Double] = js.native
  
  /**
    * Use carriage return and line feed (\r\n) as the end of line character.
    */
  @js.native
  sealed trait CRLF extends EndOfLinePreference
  /* 2 */ @js.native
  object CRLF extends TopLevel[CRLF with Double]
  
  /**
    * Use line feed (\n) as the end of line character.
    */
  @js.native
  sealed trait LF extends EndOfLinePreference
  /* 1 */ @js.native
  object LF extends TopLevel[LF with Double]
  
  /**
    * Use the end of line character identified in the text buffer.
    */
  @js.native
  sealed trait TextDefined extends EndOfLinePreference
  /* 0 */ @js.native
  object TextDefined extends TopLevel[TextDefined with Double]
}
