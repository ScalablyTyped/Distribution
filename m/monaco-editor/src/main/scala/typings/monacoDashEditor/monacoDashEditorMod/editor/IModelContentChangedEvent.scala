package typings.monacoDashEditor.monacoDashEditorMod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IModelContentChangedEvent extends js.Object {
  val changes: js.Array[IModelContentChange]
  /**
    * The (new) end-of-line character.
    */
  val eol: String
  /**
    * Flag that indicates that all decorations were lost with this edit.
    * The model has been reset to a new value.
    */
  val isFlush: Boolean
  /**
    * Flag that indicates that this event was generated while redoing.
    */
  val isRedoing: Boolean
  /**
    * Flag that indicates that this event was generated while undoing.
    */
  val isUndoing: Boolean
  /**
    * The new version id the model has transitioned to.
    */
  val versionId: Double
}

object IModelContentChangedEvent {
  @scala.inline
  def apply(
    changes: js.Array[IModelContentChange],
    eol: String,
    isFlush: Boolean,
    isRedoing: Boolean,
    isUndoing: Boolean,
    versionId: Double
  ): IModelContentChangedEvent = {
    val __obj = js.Dynamic.literal(changes = changes, eol = eol, isFlush = isFlush, isRedoing = isRedoing, isUndoing = isUndoing, versionId = versionId)
  
    __obj.asInstanceOf[IModelContentChangedEvent]
  }
}

