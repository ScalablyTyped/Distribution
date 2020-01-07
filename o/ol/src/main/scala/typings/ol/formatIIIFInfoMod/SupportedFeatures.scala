package typings.ol.formatIIIFInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SupportedFeatures extends js.Object {
  var formats: js.UndefOr[js.Array[String]] = js.undefined
  var qualities: js.UndefOr[js.Array[String]] = js.undefined
  var supports: js.UndefOr[js.Array[String]] = js.undefined
}

object SupportedFeatures {
  @scala.inline
  def apply(
    formats: js.Array[String] = null,
    qualities: js.Array[String] = null,
    supports: js.Array[String] = null
  ): SupportedFeatures = {
    val __obj = js.Dynamic.literal()
    if (formats != null) __obj.updateDynamic("formats")(formats.asInstanceOf[js.Any])
    if (qualities != null) __obj.updateDynamic("qualities")(qualities.asInstanceOf[js.Any])
    if (supports != null) __obj.updateDynamic("supports")(supports.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupportedFeatures]
  }
}

