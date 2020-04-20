package typings.pathwatcher.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatchedFilePathChangedEvent extends js.Object {
  var event: String
  var newFilePath: String
}

object WatchedFilePathChangedEvent {
  @scala.inline
  def apply(event: String, newFilePath: String): WatchedFilePathChangedEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], newFilePath = newFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchedFilePathChangedEvent]
  }
}

