package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Video extends FileBase {
  var duration: scala.Double
  var height: scala.Double
  var mime_type: js.UndefOr[java.lang.String] = js.undefined
  var thumb: js.UndefOr[PhotoSize] = js.undefined
  var width: scala.Double
}

object Video {
  @scala.inline
  def apply(
    duration: scala.Double,
    file_id: java.lang.String,
    height: scala.Double,
    width: scala.Double,
    file_size: scala.Int | scala.Double = null,
    mime_type: java.lang.String = null,
    thumb: PhotoSize = null
  ): Video = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("file_id")(file_id)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("width")(width)
    if (file_size != null) __obj.updateDynamic("file_size")(file_size.asInstanceOf[js.Any])
    if (mime_type != null) __obj.updateDynamic("mime_type")(mime_type)
    if (thumb != null) __obj.updateDynamic("thumb")(thumb)
    __obj.asInstanceOf[Video]
  }
}

