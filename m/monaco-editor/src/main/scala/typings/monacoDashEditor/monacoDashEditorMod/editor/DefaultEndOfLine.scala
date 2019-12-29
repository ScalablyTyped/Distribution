package typings.monacoDashEditor.monacoDashEditorMod.editor

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DefaultEndOfLine with Double] = js.native
  /* 2 */ @js.native
  object CRLF extends TopLevel[CRLF with Double]
  
  /* 1 */ @js.native
  object LF extends TopLevel[LF with Double]
  
}

