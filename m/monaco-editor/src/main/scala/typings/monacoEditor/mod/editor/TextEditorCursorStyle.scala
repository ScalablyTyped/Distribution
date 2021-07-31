package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextEditorCursorStyle extends StObject
@JSImport("monaco-editor", "editor.TextEditorCursorStyle")
@js.native
object TextEditorCursorStyle extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextEditorCursorStyle & Double] = js.native
  
  /**
    * As a block (sitting on top of a character).
    */
  @js.native
  sealed trait Block
    extends StObject
       with TextEditorCursorStyle
  /* 2 */ val Block: typings.monacoEditor.mod.editor.TextEditorCursorStyle.Block & Double = js.native
  
  /**
    * As an outlined block (sitting on top of a character).
    */
  @js.native
  sealed trait BlockOutline
    extends StObject
       with TextEditorCursorStyle
  /* 5 */ val BlockOutline: typings.monacoEditor.mod.editor.TextEditorCursorStyle.BlockOutline & Double = js.native
  
  /**
    * As a vertical line (sitting between two characters).
    */
  @js.native
  sealed trait Line
    extends StObject
       with TextEditorCursorStyle
  /* 1 */ val Line: typings.monacoEditor.mod.editor.TextEditorCursorStyle.Line & Double = js.native
  
  /**
    * As a thin vertical line (sitting between two characters).
    */
  @js.native
  sealed trait LineThin
    extends StObject
       with TextEditorCursorStyle
  /* 4 */ val LineThin: typings.monacoEditor.mod.editor.TextEditorCursorStyle.LineThin & Double = js.native
  
  /**
    * As a horizontal line (sitting under a character).
    */
  @js.native
  sealed trait Underline
    extends StObject
       with TextEditorCursorStyle
  /* 3 */ val Underline: typings.monacoEditor.mod.editor.TextEditorCursorStyle.Underline & Double = js.native
  
  /**
    * As a thin horizontal line (sitting under a character).
    */
  @js.native
  sealed trait UnderlineThin
    extends StObject
       with TextEditorCursorStyle
  /* 6 */ val UnderlineThin: typings.monacoEditor.mod.editor.TextEditorCursorStyle.UnderlineThin & Double = js.native
}
