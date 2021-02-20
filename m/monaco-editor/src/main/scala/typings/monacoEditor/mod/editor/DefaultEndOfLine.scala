package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DefaultEndOfLine extends StObject
@JSImport("monaco-editor", "editor.DefaultEndOfLine")
@js.native
object DefaultEndOfLine extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DefaultEndOfLine with Double] = js.native
  
  /**
    * Use carriage return and line feed (\r\n) as the end of line character.
    */
  @js.native
  sealed trait CRLF extends DefaultEndOfLine
  /* 2 */ val CRLF: typings.monacoEditor.mod.editor.DefaultEndOfLine.CRLF with Double = js.native
  
  /**
    * Use line feed (\n) as the end of line character.
    */
  @js.native
  sealed trait LF extends DefaultEndOfLine
  /* 1 */ val LF: typings.monacoEditor.mod.editor.DefaultEndOfLine.LF with Double = js.native
}
