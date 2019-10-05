package typings.monacoDashEditor.monacoDashEditorMod.editor

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
  
  /* 1 */ val ContentFlush: typings.monacoDashEditor.monacoDashEditorMod.editor.CursorChangeReason.ContentFlush with Double = js.native
  /* 3 */ val Explicit: typings.monacoDashEditor.monacoDashEditorMod.editor.CursorChangeReason.Explicit with Double = js.native
  /* 0 */ val NotSet: typings.monacoDashEditor.monacoDashEditorMod.editor.CursorChangeReason.NotSet with Double = js.native
  /* 4 */ val Paste: typings.monacoDashEditor.monacoDashEditorMod.editor.CursorChangeReason.Paste with Double = js.native
  /* 2 */ val RecoverFromMarkers: typings.monacoDashEditor.monacoDashEditorMod.editor.CursorChangeReason.RecoverFromMarkers with Double = js.native
  /* 6 */ val Redo: typings.monacoDashEditor.monacoDashEditorMod.editor.CursorChangeReason.Redo with Double = js.native
  /* 5 */ val Undo: typings.monacoDashEditor.monacoDashEditorMod.editor.CursorChangeReason.Undo with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CursorChangeReason with Double] = js.native
}

