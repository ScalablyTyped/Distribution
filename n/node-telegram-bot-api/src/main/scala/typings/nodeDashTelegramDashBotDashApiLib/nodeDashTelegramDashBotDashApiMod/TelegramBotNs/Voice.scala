package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Voice extends FileBase {
  var duration: scala.Double
  var mime_type: js.UndefOr[java.lang.String] = js.undefined
}

object Voice {
  @scala.inline
  def apply(
    duration: scala.Double,
    file_id: java.lang.String,
    file_size: scala.Int | scala.Double = null,
    mime_type: java.lang.String = null
  ): Voice = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("file_id")(file_id)
    if (file_size != null) __obj.updateDynamic("file_size")(file_size.asInstanceOf[js.Any])
    if (mime_type != null) __obj.updateDynamic("mime_type")(mime_type)
    __obj.asInstanceOf[Voice]
  }
}

