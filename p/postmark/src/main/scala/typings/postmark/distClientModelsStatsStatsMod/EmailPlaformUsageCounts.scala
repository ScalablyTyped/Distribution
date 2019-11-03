package typings.postmark.distClientModelsStatsStatsMod

import typings.postmark.Anon_DateDesktop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailPlaformUsageCounts extends js.Object {
  var Days: js.Array[Anon_DateDesktop]
  var Desktop: js.UndefOr[Double] = js.undefined
  var Mobile: js.UndefOr[Double] = js.undefined
  var Unknown: js.UndefOr[Double] = js.undefined
  var WebMail: js.UndefOr[Double] = js.undefined
}

object EmailPlaformUsageCounts {
  @scala.inline
  def apply(
    Days: js.Array[Anon_DateDesktop],
    Desktop: Int | Double = null,
    Mobile: Int | Double = null,
    Unknown: Int | Double = null,
    WebMail: Int | Double = null
  ): EmailPlaformUsageCounts = {
    val __obj = js.Dynamic.literal(Days = Days)
    if (Desktop != null) __obj.updateDynamic("Desktop")(Desktop.asInstanceOf[js.Any])
    if (Mobile != null) __obj.updateDynamic("Mobile")(Mobile.asInstanceOf[js.Any])
    if (Unknown != null) __obj.updateDynamic("Unknown")(Unknown.asInstanceOf[js.Any])
    if (WebMail != null) __obj.updateDynamic("WebMail")(WebMail.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailPlaformUsageCounts]
  }
}

