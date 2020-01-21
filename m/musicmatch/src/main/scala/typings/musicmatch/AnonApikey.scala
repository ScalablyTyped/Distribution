package typings.musicmatch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonApikey extends js.Object {
  var apikey: js.UndefOr[String] = js.undefined
  var format: js.UndefOr[String] = js.undefined
}

object AnonApikey {
  @scala.inline
  def apply(apikey: String = null, format: String = null): AnonApikey = {
    val __obj = js.Dynamic.literal()
    if (apikey != null) __obj.updateDynamic("apikey")(apikey.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonApikey]
  }
}

