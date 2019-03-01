package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoNote extends FileBase {
  var duration: scala.Double
  var length: scala.Double
  var thumb: js.UndefOr[PhotoSize] = js.undefined
}

object VideoNote {
  @scala.inline
  def apply(
    duration: scala.Double,
    file_id: java.lang.String,
    length: scala.Double,
    file_size: scala.Int | scala.Double = null,
    thumb: PhotoSize = null
  ): VideoNote = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("file_id")(file_id)
    __obj.updateDynamic("length")(length)
    if (file_size != null) __obj.updateDynamic("file_size")(file_size.asInstanceOf[js.Any])
    if (thumb != null) __obj.updateDynamic("thumb")(thumb)
    __obj.asInstanceOf[VideoNote]
  }
}

