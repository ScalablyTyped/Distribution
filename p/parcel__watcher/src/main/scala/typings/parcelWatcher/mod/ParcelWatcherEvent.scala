package typings.parcelWatcher.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParcelWatcherEvent extends js.Object {
  var path: String
  var `type`: ParcelWatcherEventType
}

object ParcelWatcherEvent {
  @scala.inline
  def apply(path: String, `type`: ParcelWatcherEventType): ParcelWatcherEvent = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParcelWatcherEvent]
  }
}

