package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICursorPositionChangedEvent extends js.Object {
  
  /**
    * Primary cursor's position.
    */
  val position: Position = js.native
  
  /**
    * Reason.
    */
  val reason: CursorChangeReason = js.native
  
  /**
    * Secondary cursors' position.
    */
  val secondaryPositions: js.Array[Position] = js.native
  
  /**
    * Source of the call that caused the event.
    */
  val source: String = js.native
}
object ICursorPositionChangedEvent {
  
  @scala.inline
  def apply(
    position: Position,
    reason: CursorChangeReason,
    secondaryPositions: js.Array[Position],
    source: String
  ): ICursorPositionChangedEvent = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], secondaryPositions = secondaryPositions.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICursorPositionChangedEvent]
  }
  
  @scala.inline
  implicit class ICursorPositionChangedEventOps[Self <: ICursorPositionChangedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPosition(value: Position): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: CursorChangeReason): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryPositionsVarargs(value: Position*): Self = this.set("secondaryPositions", js.Array(value :_*))
    
    @scala.inline
    def setSecondaryPositions(value: js.Array[Position]): Self = this.set("secondaryPositions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
  }
}
