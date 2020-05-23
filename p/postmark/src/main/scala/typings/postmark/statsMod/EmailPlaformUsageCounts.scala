package typings.postmark.statsMod

import typings.postmark.anon.Desktop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailPlaformUsageCounts extends js.Object {
  var Days: js.Array[Desktop]
  var Desktop: js.UndefOr[Double] = js.undefined
  var Mobile: js.UndefOr[Double] = js.undefined
  var Unknown: js.UndefOr[Double] = js.undefined
  var WebMail: js.UndefOr[Double] = js.undefined
}

object EmailPlaformUsageCounts {
  @scala.inline
  def apply(
    Days: js.Array[Desktop],
    Desktop: js.UndefOr[Double] = js.undefined,
    Mobile: js.UndefOr[Double] = js.undefined,
    Unknown: js.UndefOr[Double] = js.undefined,
    WebMail: js.UndefOr[Double] = js.undefined
  ): EmailPlaformUsageCounts = {
    val __obj = js.Dynamic.literal(Days = Days.asInstanceOf[js.Any])
    if (!js.isUndefined(Desktop)) __obj.updateDynamic("Desktop")(Desktop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Mobile)) __obj.updateDynamic("Mobile")(Mobile.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Unknown)) __obj.updateDynamic("Unknown")(Unknown.get.asInstanceOf[js.Any])
    if (!js.isUndefined(WebMail)) __obj.updateDynamic("WebMail")(WebMail.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailPlaformUsageCounts]
  }
}

