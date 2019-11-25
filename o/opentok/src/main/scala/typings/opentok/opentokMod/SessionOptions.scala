package typings.opentok.opentokMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionOptions extends js.Object {
  var archiveMode: js.UndefOr[ArchiveMode] = js.undefined
  var location: js.UndefOr[String] = js.undefined
  var mediaMode: js.UndefOr[MediaMode] = js.undefined
}

object SessionOptions {
  @scala.inline
  def apply(archiveMode: ArchiveMode = null, location: String = null, mediaMode: MediaMode = null): SessionOptions = {
    val __obj = js.Dynamic.literal()
    if (archiveMode != null) __obj.updateDynamic("archiveMode")(archiveMode.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (mediaMode != null) __obj.updateDynamic("mediaMode")(mediaMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionOptions]
  }
}

