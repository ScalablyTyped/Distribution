package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextEditorCursorBlinkingStyle extends StObject
@JSImport("monaco-editor", "editor.TextEditorCursorBlinkingStyle")
@js.native
object TextEditorCursorBlinkingStyle extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextEditorCursorBlinkingStyle & Double] = js.native
  
  /**
    * Blinking
    */
  @js.native
  sealed trait Blink
    extends StObject
       with TextEditorCursorBlinkingStyle
  /* 1 */ val Blink: typings.monacoEditor.mod.editor.TextEditorCursorBlinkingStyle.Blink & Double = js.native
  
  /**
    * Expand collapse animation on the y axis
    */
  @js.native
  sealed trait Expand
    extends StObject
       with TextEditorCursorBlinkingStyle
  /* 4 */ val Expand: typings.monacoEditor.mod.editor.TextEditorCursorBlinkingStyle.Expand & Double = js.native
  
  /**
    * Hidden
    */
  @js.native
  sealed trait Hidden
    extends StObject
       with TextEditorCursorBlinkingStyle
  /* 0 */ val Hidden: typings.monacoEditor.mod.editor.TextEditorCursorBlinkingStyle.Hidden & Double = js.native
  
  /**
    * Blinking with prolonged filled state and smooth fading
    */
  @js.native
  sealed trait Phase
    extends StObject
       with TextEditorCursorBlinkingStyle
  /* 3 */ val Phase: typings.monacoEditor.mod.editor.TextEditorCursorBlinkingStyle.Phase & Double = js.native
  
  /**
    * Blinking with smooth fading
    */
  @js.native
  sealed trait Smooth
    extends StObject
       with TextEditorCursorBlinkingStyle
  /* 2 */ val Smooth: typings.monacoEditor.mod.editor.TextEditorCursorBlinkingStyle.Smooth & Double = js.native
  
  /**
    * No-Blinking
    */
  @js.native
  sealed trait Solid
    extends StObject
       with TextEditorCursorBlinkingStyle
  /* 5 */ val Solid: typings.monacoEditor.mod.editor.TextEditorCursorBlinkingStyle.Solid & Double = js.native
}
