package typings.ol.iiifinfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreferredOptions extends js.Object {
  var format: js.UndefOr[String] = js.undefined
  var quality: js.UndefOr[String] = js.undefined
}

object PreferredOptions {
  @scala.inline
  def apply(format: String = null, quality: String = null): PreferredOptions = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreferredOptions]
  }
}

