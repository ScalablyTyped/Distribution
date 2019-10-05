package typings.monacoDashEditor.monacoDashEditorMod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextEditorCursorBlinkingStyle extends js.Object

@JSImport("monaco-editor", "editor.TextEditorCursorBlinkingStyle")
@js.native
object TextEditorCursorBlinkingStyle extends js.Object {
  /**
    * Blinking
    */
  @js.native
  sealed trait Blink extends TextEditorCursorBlinkingStyle
  
  /**
    * Expand collapse animation on the y axis
    */
  @js.native
  sealed trait Expand extends TextEditorCursorBlinkingStyle
  
  /**
    * Hidden
    */
  @js.native
  sealed trait Hidden extends TextEditorCursorBlinkingStyle
  
  /**
    * Blinking with prolonged filled state and smooth fading
    */
  @js.native
  sealed trait Phase extends TextEditorCursorBlinkingStyle
  
  /**
    * Blinking with smooth fading
    */
  @js.native
  sealed trait Smooth extends TextEditorCursorBlinkingStyle
  
  /**
    * No-Blinking
    */
  @js.native
  sealed trait Solid extends TextEditorCursorBlinkingStyle
  
  /* 1 */ val Blink: typings.monacoDashEditor.monacoDashEditorMod.editor.TextEditorCursorBlinkingStyle.Blink with Double = js.native
  /* 4 */ val Expand: typings.monacoDashEditor.monacoDashEditorMod.editor.TextEditorCursorBlinkingStyle.Expand with Double = js.native
  /* 0 */ val Hidden: typings.monacoDashEditor.monacoDashEditorMod.editor.TextEditorCursorBlinkingStyle.Hidden with Double = js.native
  /* 3 */ val Phase: typings.monacoDashEditor.monacoDashEditorMod.editor.TextEditorCursorBlinkingStyle.Phase with Double = js.native
  /* 2 */ val Smooth: typings.monacoDashEditor.monacoDashEditorMod.editor.TextEditorCursorBlinkingStyle.Smooth with Double = js.native
  /* 5 */ val Solid: typings.monacoDashEditor.monacoDashEditorMod.editor.TextEditorCursorBlinkingStyle.Solid with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextEditorCursorBlinkingStyle with Double] = js.native
}

