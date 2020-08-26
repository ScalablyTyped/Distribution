package typings.parcelWatcher.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParcelWatcherEvent extends js.Object {
  var path: String = js.native
  var `type`: ParcelWatcherEventType = js.native
}

object ParcelWatcherEvent {
  @scala.inline
  def apply(path: String, `type`: ParcelWatcherEventType): ParcelWatcherEvent = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParcelWatcherEvent]
  }
  @scala.inline
  implicit class ParcelWatcherEventOps[Self <: ParcelWatcherEvent] (val x: Self) extends AnyVal {
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: ParcelWatcherEventType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

