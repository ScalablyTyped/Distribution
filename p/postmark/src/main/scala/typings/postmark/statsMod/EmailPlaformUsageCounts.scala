package typings.postmark.statsMod

import typings.postmark.AnonDesktop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailPlaformUsageCounts extends js.Object {
  var Days: js.Array[AnonDesktop]
  var Desktop: js.UndefOr[Double] = js.undefined
  var Mobile: js.UndefOr[Double] = js.undefined
  var Unknown: js.UndefOr[Double] = js.undefined
  var WebMail: js.UndefOr[Double] = js.undefined
}

object EmailPlaformUsageCounts {
  @scala.inline
  def apply(
    Days: js.Array[AnonDesktop],
    Desktop: Int | Double = null,
    Mobile: Int | Double = null,
    Unknown: Int | Double = null,
    WebMail: Int | Double = null
  ): EmailPlaformUsageCounts = {
    val __obj = js.Dynamic.literal(Days = Days.asInstanceOf[js.Any])
    if (Desktop != null) __obj.updateDynamic("Desktop")(Desktop.asInstanceOf[js.Any])
    if (Mobile != null) __obj.updateDynamic("Mobile")(Mobile.asInstanceOf[js.Any])
    if (Unknown != null) __obj.updateDynamic("Unknown")(Unknown.asInstanceOf[js.Any])
    if (WebMail != null) __obj.updateDynamic("WebMail")(WebMail.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailPlaformUsageCounts]
  }
}

