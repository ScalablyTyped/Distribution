package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CursorChangeReason extends StObject
@JSImport("monaco-editor", "editor.CursorChangeReason")
@js.native
object CursorChangeReason extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CursorChangeReason with Double] = js.native
  
  /**
    * A `model.setValue()` was called.
    */
  @js.native
  sealed trait ContentFlush extends CursorChangeReason
  /* 1 */ val ContentFlush: typings.monacoEditor.mod.editor.CursorChangeReason.ContentFlush with Double = js.native
  
  /**
    * There was an explicit user gesture.
    */
  @js.native
  sealed trait Explicit extends CursorChangeReason
  /* 3 */ val Explicit: typings.monacoEditor.mod.editor.CursorChangeReason.Explicit with Double = js.native
  
  /**
    * Unknown or not set.
    */
  @js.native
  sealed trait NotSet extends CursorChangeReason
  /* 0 */ val NotSet: typings.monacoEditor.mod.editor.CursorChangeReason.NotSet with Double = js.native
  
  /**
    * There was a Paste.
    */
  @js.native
  sealed trait Paste extends CursorChangeReason
  /* 4 */ val Paste: typings.monacoEditor.mod.editor.CursorChangeReason.Paste with Double = js.native
  
  /**
    * The `model` has been changed outside of this cursor and the cursor recovers its position from associated markers.
    */
  @js.native
  sealed trait RecoverFromMarkers extends CursorChangeReason
  /* 2 */ val RecoverFromMarkers: typings.monacoEditor.mod.editor.CursorChangeReason.RecoverFromMarkers with Double = js.native
  
  /**
    * There was a Redo.
    */
  @js.native
  sealed trait Redo extends CursorChangeReason
  /* 6 */ val Redo: typings.monacoEditor.mod.editor.CursorChangeReason.Redo with Double = js.native
  
  /**
    * There was an Undo.
    */
  @js.native
  sealed trait Undo extends CursorChangeReason
  /* 5 */ val Undo: typings.monacoEditor.mod.editor.CursorChangeReason.Undo with Double = js.native
}
