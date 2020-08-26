package typings.pathwatcher.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WatchedFilePathChangedEvent extends js.Object {
  var event: String = js.native
  var newFilePath: String = js.native
}

object WatchedFilePathChangedEvent {
  @scala.inline
  def apply(event: String, newFilePath: String): WatchedFilePathChangedEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], newFilePath = newFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchedFilePathChangedEvent]
  }
  @scala.inline
  implicit class WatchedFilePathChangedEventOps[Self <: WatchedFilePathChangedEvent] (val x: Self) extends AnyVal {
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
    def setEvent(value: String): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewFilePath(value: String): Self = this.set("newFilePath", value.asInstanceOf[js.Any])
  }
  
}

