package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextEditorCursorBlinkingStyle extends StObject
@JSImport("monaco-editor", "editor.TextEditorCursorBlinkingStyle")
@js.native
object TextEditorCursorBlinkingStyle extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextEditorCursorBlinkingStyle with Double] = js.native
  
  /**
    * Blinking
    */
  @js.native
  sealed trait Blink extends TextEditorCursorBlinkingStyle
  /* 1 */ val Blink: typings.monacoEditor.mod.editor.TextEditorCursorBlinkingStyle.Blink with Double = js.native
  
  /**
    * Expand collapse animation on the y axis
    */
  @js.native
  sealed trait Expand extends TextEditorCursorBlinkingStyle
  /* 4 */ val Expand: typings.monacoEditor.mod.editor.TextEditorCursorBlinkingStyle.Expand with Double = js.native
  
  /**
    * Hidden
    */
  @js.native
  sealed trait Hidden extends TextEditorCursorBlinkingStyle
  /* 0 */ val Hidden: typings.monacoEditor.mod.editor.TextEditorCursorBlinkingStyle.Hidden with Double = js.native
  
  /**
    * Blinking with prolonged filled state and smooth fading
    */
  @js.native
  sealed trait Phase extends TextEditorCursorBlinkingStyle
  /* 3 */ val Phase: typings.monacoEditor.mod.editor.TextEditorCursorBlinkingStyle.Phase with Double = js.native
  
  /**
    * Blinking with smooth fading
    */
  @js.native
  sealed trait Smooth extends TextEditorCursorBlinkingStyle
  /* 2 */ val Smooth: typings.monacoEditor.mod.editor.TextEditorCursorBlinkingStyle.Smooth with Double = js.native
  
  /**
    * No-Blinking
    */
  @js.native
  sealed trait Solid extends TextEditorCursorBlinkingStyle
  /* 5 */ val Solid: typings.monacoEditor.mod.editor.TextEditorCursorBlinkingStyle.Solid with Double = js.native
}
