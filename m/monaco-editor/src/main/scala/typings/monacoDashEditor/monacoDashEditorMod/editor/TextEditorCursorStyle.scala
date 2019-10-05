package typings.monacoDashEditor.monacoDashEditorMod.editor

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
  
  /* 2 */ val Block: typings.monacoDashEditor.monacoDashEditorMod.editor.TextEditorCursorStyle.Block with Double = js.native
  /* 5 */ val BlockOutline: typings.monacoDashEditor.monacoDashEditorMod.editor.TextEditorCursorStyle.BlockOutline with Double = js.native
  /* 1 */ val Line: typings.monacoDashEditor.monacoDashEditorMod.editor.TextEditorCursorStyle.Line with Double = js.native
  /* 4 */ val LineThin: typings.monacoDashEditor.monacoDashEditorMod.editor.TextEditorCursorStyle.LineThin with Double = js.native
  /* 3 */ val Underline: typings.monacoDashEditor.monacoDashEditorMod.editor.TextEditorCursorStyle.Underline with Double = js.native
  /* 6 */ val UnderlineThin: typings.monacoDashEditor.monacoDashEditorMod.editor.TextEditorCursorStyle.UnderlineThin with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextEditorCursorStyle with Double] = js.native
}

