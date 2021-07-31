package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CursorChangeReason extends StObject
@JSImport("monaco-editor", "editor.CursorChangeReason")
@js.native
object CursorChangeReason extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CursorChangeReason & Double] = js.native
  
  /**
    * A `model.setValue()` was called.
    */
  @js.native
  sealed trait ContentFlush
    extends StObject
       with CursorChangeReason
  /* 1 */ val ContentFlush: typings.monacoEditor.mod.editor.CursorChangeReason.ContentFlush & Double = js.native
  
  /**
    * There was an explicit user gesture.
    */
  @js.native
  sealed trait Explicit
    extends StObject
       with CursorChangeReason
  /* 3 */ val Explicit: typings.monacoEditor.mod.editor.CursorChangeReason.Explicit & Double = js.native
  
  /**
    * Unknown or not set.
    */
  @js.native
  sealed trait NotSet
    extends StObject
       with CursorChangeReason
  /* 0 */ val NotSet: typings.monacoEditor.mod.editor.CursorChangeReason.NotSet & Double = js.native
  
  /**
    * There was a Paste.
    */
  @js.native
  sealed trait Paste
    extends StObject
       with CursorChangeReason
  /* 4 */ val Paste: typings.monacoEditor.mod.editor.CursorChangeReason.Paste & Double = js.native
  
  /**
    * The `model` has been changed outside of this cursor and the cursor recovers its position from associated markers.
    */
  @js.native
  sealed trait RecoverFromMarkers
    extends StObject
       with CursorChangeReason
  /* 2 */ val RecoverFromMarkers: typings.monacoEditor.mod.editor.CursorChangeReason.RecoverFromMarkers & Double = js.native
  
  /**
    * There was a Redo.
    */
  @js.native
  sealed trait Redo
    extends StObject
       with CursorChangeReason
  /* 6 */ val Redo: typings.monacoEditor.mod.editor.CursorChangeReason.Redo & Double = js.native
  
  /**
    * There was an Undo.
    */
  @js.native
  sealed trait Undo
    extends StObject
       with CursorChangeReason
  /* 5 */ val Undo: typings.monacoEditor.mod.editor.CursorChangeReason.Undo & Double = js.native
}
