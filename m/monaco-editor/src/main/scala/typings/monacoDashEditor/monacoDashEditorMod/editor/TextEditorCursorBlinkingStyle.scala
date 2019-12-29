package typings.monacoDashEditor.monacoDashEditorMod.editor

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextEditorCursorBlinkingStyle with Double] = js.native
  /* 1 */ @js.native
  object Blink extends TopLevel[Blink with Double]
  
  /* 4 */ @js.native
  object Expand extends TopLevel[Expand with Double]
  
  /* 0 */ @js.native
  object Hidden extends TopLevel[Hidden with Double]
  
  /* 3 */ @js.native
  object Phase extends TopLevel[Phase with Double]
  
  /* 2 */ @js.native
  object Smooth extends TopLevel[Smooth with Double]
  
  /* 5 */ @js.native
  object Solid extends TopLevel[Solid with Double]
  
}

