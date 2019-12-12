package typings.monacoDashEditor.monacoDashEditorMod.editor

import org.scalablytyped.runtime.TopLevel
import typings.monacoDashEditor.monacoDashEditorMod.editor.TextEditorCursorStyle.Block
import typings.monacoDashEditor.monacoDashEditorMod.editor.TextEditorCursorStyle.BlockOutline
import typings.monacoDashEditor.monacoDashEditorMod.editor.TextEditorCursorStyle.Line
import typings.monacoDashEditor.monacoDashEditorMod.editor.TextEditorCursorStyle.LineThin
import typings.monacoDashEditor.monacoDashEditorMod.editor.TextEditorCursorStyle.Underline
import typings.monacoDashEditor.monacoDashEditorMod.editor.TextEditorCursorStyle.UnderlineThin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextEditorCursorStyle extends js.Object

@JSImport("monaco-editor", "editor.TextEditorCursorStyle")
@js.native
object TextEditorCursorStyle extends js.Object {
  /**
    * As a block (sitting on top of a character).
    */
  @js.native
  sealed trait Block extends TextEditorCursorStyle
  
  /**
    * As an outlined block (sitting on top of a character).
    */
  @js.native
  sealed trait BlockOutline extends TextEditorCursorStyle
  
  /**
    * As a vertical line (sitting between two characters).
    */
  @js.native
  sealed trait Line extends TextEditorCursorStyle
  
  /**
    * As a thin vertical line (sitting between two characters).
    */
  @js.native
  sealed trait LineThin extends TextEditorCursorStyle
  
  /**
    * As a horizontal line (sitting under a character).
    */
  @js.native
  sealed trait Underline extends TextEditorCursorStyle
  
  /**
    * As a thin horizontal line (sitting under a character).
    */
  @js.native
  sealed trait UnderlineThin extends TextEditorCursorStyle
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextEditorCursorStyle with Double] = js.native
  /* 2 */ @js.native
  object Block extends TopLevel[Block with Double]
  
  /* 5 */ @js.native
  object BlockOutline extends TopLevel[BlockOutline with Double]
  
  /* 1 */ @js.native
  object Line extends TopLevel[Line with Double]
  
  /* 4 */ @js.native
  object LineThin extends TopLevel[LineThin with Double]
  
  /* 3 */ @js.native
  object Underline extends TopLevel[Underline with Double]
  
  /* 6 */ @js.native
  object UnderlineThin extends TopLevel[UnderlineThin with Double]
  
}

