package typings.monacoDashEditor.monacoDashEditorMod.editor

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CursorChangeReason extends js.Object

@JSImport("monaco-editor", "editor.CursorChangeReason")
@js.native
object CursorChangeReason extends js.Object {
  /**
    * A `model.setValue()` was called.
    */
  @js.native
  sealed trait ContentFlush extends CursorChangeReason
  
  /**
    * There was an explicit user gesture.
    */
  @js.native
  sealed trait Explicit extends CursorChangeReason
  
  /**
    * Unknown or not set.
    */
  @js.native
  sealed trait NotSet extends CursorChangeReason
  
  /**
    * There was a Paste.
    */
  @js.native
  sealed trait Paste extends CursorChangeReason
  
  /**
    * The `model` has been changed outside of this cursor and the cursor recovers its position from associated markers.
    */
  @js.native
  sealed trait RecoverFromMarkers extends CursorChangeReason
  
  /**
    * There was a Redo.
    */
  @js.native
  sealed trait Redo extends CursorChangeReason
  
  /**
    * There was an Undo.
    */
  @js.native
  sealed trait Undo extends CursorChangeReason
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CursorChangeReason with Double] = js.native
  /* 1 */ @js.native
  object ContentFlush extends TopLevel[ContentFlush with Double]
  
  /* 3 */ @js.native
  object Explicit extends TopLevel[Explicit with Double]
  
  /* 0 */ @js.native
  object NotSet extends TopLevel[NotSet with Double]
  
  /* 4 */ @js.native
  object Paste extends TopLevel[Paste with Double]
  
  /* 2 */ @js.native
  object RecoverFromMarkers extends TopLevel[RecoverFromMarkers with Double]
  
  /* 6 */ @js.native
  object Redo extends TopLevel[Redo with Double]
  
  /* 5 */ @js.native
  object Undo extends TopLevel[Undo with Double]
  
}

