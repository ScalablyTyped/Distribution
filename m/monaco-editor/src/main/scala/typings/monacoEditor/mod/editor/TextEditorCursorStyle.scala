package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextEditorCursorStyle extends js.Object
@JSImport("monaco-editor", "editor.TextEditorCursorStyle")
@js.native
object TextEditorCursorStyle extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextEditorCursorStyle with Double] = js.native
  
  /**
    * As a block (sitting on top of a character).
    */
  @js.native
  sealed trait Block extends TextEditorCursorStyle
  /* 2 */ @js.native
  object Block extends TopLevel[Block with Double]
  
  /**
    * As an outlined block (sitting on top of a character).
    */
  @js.native
  sealed trait BlockOutline extends TextEditorCursorStyle
  /* 5 */ @js.native
  object BlockOutline extends TopLevel[BlockOutline with Double]
  
  /**
    * As a vertical line (sitting between two characters).
    */
  @js.native
  sealed trait Line extends TextEditorCursorStyle
  /* 1 */ @js.native
  object Line extends TopLevel[Line with Double]
  
  /**
    * As a thin vertical line (sitting between two characters).
    */
  @js.native
  sealed trait LineThin extends TextEditorCursorStyle
  /* 4 */ @js.native
  object LineThin extends TopLevel[LineThin with Double]
  
  /**
    * As a horizontal line (sitting under a character).
    */
  @js.native
  sealed trait Underline extends TextEditorCursorStyle
  /* 3 */ @js.native
  object Underline extends TopLevel[Underline with Double]
  
  /**
    * As a thin horizontal line (sitting under a character).
    */
  @js.native
  sealed trait UnderlineThin extends TextEditorCursorStyle
  /* 6 */ @js.native
  object UnderlineThin extends TopLevel[UnderlineThin with Double]
}
