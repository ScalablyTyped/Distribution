package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EndOfLineSequence with Double] = js.native
  /* 1 */ @js.native
  object CRLF extends TopLevel[CRLF with Double]
  
  /* 0 */ @js.native
  object LF extends TopLevel[LF with Double]
  
}

