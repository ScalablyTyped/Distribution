package typings.ot.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ot", "UndoManager")
@js.native
/**
  * Create a new UndoManager with an optional maximum history size.
  * @param maxItems The max history size
  */
class UndoManager () extends StObject {
  def this(maxItems: Double) = this()
  
  /**
    * Add an operation to the undo or redo stack, depending on the current state
    * of the UndoManager.
    * @param operation The operation added must be the inverse of the last
    * edit.
    * @param compose When `true`, compose the operation with the last operation
    * unless the last operation was alread pushed on the redo stack or was hidden
    * by a newer operation on the undo stack
    */
  def add(operation: TextOperation): Unit = js.native
  def add(operation: TextOperation, compose: Boolean): Unit = js.native
  def add(operation: WrappedOperation[js.Any]): Unit = js.native
  def add(operation: WrappedOperation[js.Any], compose: Boolean): Unit = js.native
  
  /**
    * Is the redo stack not empty?
    */
  def canRedo(): Boolean = js.native
  
  /**
    * Is the undo stack not empty?
    */
  def canUndo(): Boolean = js.native
  
  var dontCompose: Boolean = js.native
  
  /**
    * Whether the UndoManager is currently performing a redo.
    */
  def isRedoing(): Boolean = js.native
  
  /**
    * Whether the UndoManager is currently performing an undo.
    */
  def isUndoing(): Boolean = js.native
  
  /**
    * The inverse of `performUndo`.
    * @param fun The function
    */
  def performRedo(fun: js.Function1[/* op */ WrappedOperation[js.Any], Unit]): Unit = js.native
  
  /**
    * Perform an undo by calling a function with the latest operation on the undo
    * stack.
    * @param fun The function is expected to call the `add` method with the inverse
    * of the operation, which pushes the inverse on the redo stack.
    */
  def performUndo(fun: js.Function1[/* op */ WrappedOperation[js.Any], Unit]): Unit = js.native
  
  var redoStack: js.Array[WrappedOperation[js.Any]] = js.native
  
  var state: UndoState = js.native
  
  /**
    * Transform the undo and redo stacks against a operation by another client.
    * @param operation The op
    */
  def transform(operation: TextOperation): Unit = js.native
  def transform(operation: WrappedOperation[js.Any]): Unit = js.native
  
  var undoStack: js.Array[WrappedOperation[js.Any]] = js.native
}
