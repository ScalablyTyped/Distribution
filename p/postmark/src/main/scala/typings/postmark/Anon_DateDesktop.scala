package typings.postmark

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DateDesktop extends js.Object {
  var Date: String
  var Desktop: js.UndefOr[Double] = js.undefined
  var Mobile: js.UndefOr[Double] = js.undefined
  var Unknown: js.UndefOr[Double] = js.undefined
  var WebMail: js.UndefOr[Double] = js.undefined
}

object Anon_DateDesktop {
  @scala.inline
  def apply(
    Date: String,
    Desktop: Int | Double = null,
    Mobile: Int | Double = null,
    Unknown: Int | Double = null,
    WebMail: Int | Double = null
  ): Anon_DateDesktop = {
    val __obj = js.Dynamic.literal(Date = Date)
    if (Desktop != null) __obj.updateDynamic("Desktop")(Desktop.asInstanceOf[js.Any])
    if (Mobile != null) __obj.updateDynamic("Mobile")(Mobile.asInstanceOf[js.Any])
    if (Unknown != null) __obj.updateDynamic("Unknown")(Unknown.asInstanceOf[js.Any])
    if (WebMail != null) __obj.updateDynamic("WebMail")(WebMail.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DateDesktop]
  }
}

