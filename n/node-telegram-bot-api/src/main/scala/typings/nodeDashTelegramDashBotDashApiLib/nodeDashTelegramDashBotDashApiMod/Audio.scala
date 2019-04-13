package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Audio extends FileBase {
  var duration: scala.Double
  var mime_type: js.UndefOr[java.lang.String] = js.undefined
  var performer: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object Audio {
  @scala.inline
  def apply(
    duration: scala.Double,
    file_id: java.lang.String,
    file_size: scala.Int | scala.Double = null,
    mime_type: java.lang.String = null,
    performer: java.lang.String = null,
    title: java.lang.String = null
  ): Audio = {
    val __obj = js.Dynamic.literal(duration = duration, file_id = file_id)
    if (file_size != null) __obj.updateDynamic("file_size")(file_size.asInstanceOf[js.Any])
    if (mime_type != null) __obj.updateDynamic("mime_type")(mime_type)
    if (performer != null) __obj.updateDynamic("performer")(performer)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Audio]
  }
}

