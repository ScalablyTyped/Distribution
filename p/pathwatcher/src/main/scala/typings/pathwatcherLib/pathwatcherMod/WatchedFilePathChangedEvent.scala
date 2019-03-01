package typings
package pathwatcherLib.pathwatcherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatchedFilePathChangedEvent extends js.Object {
  var event: java.lang.String
  var newFilePath: java.lang.String
}

object WatchedFilePathChangedEvent {
  @scala.inline
  def apply(event: java.lang.String, newFilePath: java.lang.String): WatchedFilePathChangedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("event")(event)
    __obj.updateDynamic("newFilePath")(newFilePath)
    __obj.asInstanceOf[WatchedFilePathChangedEvent]
  }
}

