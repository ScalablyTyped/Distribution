package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EndOfLinePreference extends StObject
@JSImport("monaco-editor", "editor.EndOfLinePreference")
@js.native
object EndOfLinePreference extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EndOfLinePreference & Double] = js.native
  
  /**
    * Use carriage return and line feed (\r\n) as the end of line character.
    */
  @js.native
  sealed trait CRLF
    extends StObject
       with EndOfLinePreference
  /* 2 */ val CRLF: typings.monacoEditor.mod.editor.EndOfLinePreference.CRLF & Double = js.native
  
  /**
    * Use line feed (\n) as the end of line character.
    */
  @js.native
  sealed trait LF
    extends StObject
       with EndOfLinePreference
  /* 1 */ val LF: typings.monacoEditor.mod.editor.EndOfLinePreference.LF & Double = js.native
  
  /**
    * Use the end of line character identified in the text buffer.
    */
  @js.native
  sealed trait TextDefined
    extends StObject
       with EndOfLinePreference
  /* 0 */ val TextDefined: typings.monacoEditor.mod.editor.EndOfLinePreference.TextDefined & Double = js.native
}
