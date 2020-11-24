package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextEditorCursorBlinkingStyle extends js.Object
@JSImport("monaco-editor", "editor.TextEditorCursorBlinkingStyle")
@js.native
object TextEditorCursorBlinkingStyle extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextEditorCursorBlinkingStyle with Double] = js.native
  
  /**
    * Blinking
    */
  @js.native
  sealed trait Blink extends TextEditorCursorBlinkingStyle
  /* 1 */ @js.native
  object Blink extends TopLevel[Blink with Double]
  
  /**
    * Expand collapse animation on the y axis
    */
  @js.native
  sealed trait Expand extends TextEditorCursorBlinkingStyle
  /* 4 */ @js.native
  object Expand extends TopLevel[Expand with Double]
  
  /**
    * Hidden
    */
  @js.native
  sealed trait Hidden extends TextEditorCursorBlinkingStyle
  /* 0 */ @js.native
  object Hidden extends TopLevel[Hidden with Double]
  
  /**
    * Blinking with prolonged filled state and smooth fading
    */
  @js.native
  sealed trait Phase extends TextEditorCursorBlinkingStyle
  /* 3 */ @js.native
  object Phase extends TopLevel[Phase with Double]
  
  /**
    * Blinking with smooth fading
    */
  @js.native
  sealed trait Smooth extends TextEditorCursorBlinkingStyle
  /* 2 */ @js.native
  object Smooth extends TopLevel[Smooth with Double]
  
  /**
    * No-Blinking
    */
  @js.native
  sealed trait Solid extends TextEditorCursorBlinkingStyle
  /* 5 */ @js.native
  object Solid extends TopLevel[Solid with Double]
}
