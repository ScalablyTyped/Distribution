package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextEditorCursorStyle extends StObject
@JSImport("monaco-editor", "editor.TextEditorCursorStyle")
@js.native
object TextEditorCursorStyle extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextEditorCursorStyle with Double] = js.native
  
  /**
    * As a block (sitting on top of a character).
    */
  @js.native
  sealed trait Block extends TextEditorCursorStyle
  /* 2 */ val Block: typings.monacoEditor.mod.editor.TextEditorCursorStyle.Block with Double = js.native
  
  /**
    * As an outlined block (sitting on top of a character).
    */
  @js.native
  sealed trait BlockOutline extends TextEditorCursorStyle
  /* 5 */ val BlockOutline: typings.monacoEditor.mod.editor.TextEditorCursorStyle.BlockOutline with Double = js.native
  
  /**
    * As a vertical line (sitting between two characters).
    */
  @js.native
  sealed trait Line extends TextEditorCursorStyle
  /* 1 */ val Line: typings.monacoEditor.mod.editor.TextEditorCursorStyle.Line with Double = js.native
  
  /**
    * As a thin vertical line (sitting between two characters).
    */
  @js.native
  sealed trait LineThin extends TextEditorCursorStyle
  /* 4 */ val LineThin: typings.monacoEditor.mod.editor.TextEditorCursorStyle.LineThin with Double = js.native
  
  /**
    * As a horizontal line (sitting under a character).
    */
  @js.native
  sealed trait Underline extends TextEditorCursorStyle
  /* 3 */ val Underline: typings.monacoEditor.mod.editor.TextEditorCursorStyle.Underline with Double = js.native
  
  /**
    * As a thin horizontal line (sitting under a character).
    */
  @js.native
  sealed trait UnderlineThin extends TextEditorCursorStyle
  /* 6 */ val UnderlineThin: typings.monacoEditor.mod.editor.TextEditorCursorStyle.UnderlineThin with Double = js.native
}
