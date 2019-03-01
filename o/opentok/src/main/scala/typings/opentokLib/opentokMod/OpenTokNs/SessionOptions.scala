package typings
package opentokLib.opentokMod.OpenTokNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionOptions extends js.Object {
  var archiveMode: js.UndefOr[ArchiveMode] = js.undefined
  var location: js.UndefOr[java.lang.String] = js.undefined
  var mediaMode: js.UndefOr[MediaMode] = js.undefined
}

object SessionOptions {
  @scala.inline
  def apply(archiveMode: ArchiveMode = null, location: java.lang.String = null, mediaMode: MediaMode = null): SessionOptions = {
    val __obj = js.Dynamic.literal()
    if (archiveMode != null) __obj.updateDynamic("archiveMode")(archiveMode)
    if (location != null) __obj.updateDynamic("location")(location)
    if (mediaMode != null) __obj.updateDynamic("mediaMode")(mediaMode)
    __obj.asInstanceOf[SessionOptions]
  }
}

