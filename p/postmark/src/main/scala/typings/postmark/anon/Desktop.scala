package typings.postmark.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Desktop extends js.Object {
  var Date: String
  var Desktop: js.UndefOr[Double] = js.undefined
  var Mobile: js.UndefOr[Double] = js.undefined
  var Unknown: js.UndefOr[Double] = js.undefined
  var WebMail: js.UndefOr[Double] = js.undefined
}

object Desktop {
  @scala.inline
  def apply(
    Date: String,
    Desktop: js.UndefOr[Double] = js.undefined,
    Mobile: js.UndefOr[Double] = js.undefined,
    Unknown: js.UndefOr[Double] = js.undefined,
    WebMail: js.UndefOr[Double] = js.undefined
  ): Desktop = {
    val __obj = js.Dynamic.literal(Date = Date.asInstanceOf[js.Any])
    if (!js.isUndefined(Desktop)) __obj.updateDynamic("Desktop")(Desktop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Mobile)) __obj.updateDynamic("Mobile")(Mobile.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Unknown)) __obj.updateDynamic("Unknown")(Unknown.get.asInstanceOf[js.Any])
    if (!js.isUndefined(WebMail)) __obj.updateDynamic("WebMail")(WebMail.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Desktop]
  }
}

