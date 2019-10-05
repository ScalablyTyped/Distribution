package typings.monacoDashEditor.monacoDashEditorMod.editor

import typings.monacoDashEditor.monacoDashEditorMod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICursorPositionChangedEvent extends js.Object {
  /**
    * Primary cursor's position.
    */
  val position: Position
  /**
    * Reason.
    */
  val reason: CursorChangeReason
  /**
    * Secondary cursors' position.
    */
  val secondaryPositions: js.Array[Position]
  /**
    * Source of the call that caused the event.
    */
  val source: String
}

object ICursorPositionChangedEvent {
  @scala.inline
  def apply(
    position: Position,
    reason: CursorChangeReason,
    secondaryPositions: js.Array[Position],
    source: String
  ): ICursorPositionChangedEvent = {
    val __obj = js.Dynamic.literal(position = position, reason = reason, secondaryPositions = secondaryPositions, source = source)
  
    __obj.asInstanceOf[ICursorPositionChangedEvent]
  }
}

