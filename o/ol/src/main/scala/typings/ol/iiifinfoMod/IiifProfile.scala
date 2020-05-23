package typings.ol.iiifinfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IiifProfile extends js.Object {
  var formats: js.UndefOr[js.Array[String]] = js.undefined
  var maxArea: js.UndefOr[Double] = js.undefined
  var maxHeight: js.UndefOr[Double] = js.undefined
  var maxWidth: js.UndefOr[Double] = js.undefined
  var qualities: js.UndefOr[js.Array[String]] = js.undefined
  var supports: js.UndefOr[js.Array[String]] = js.undefined
}

object IiifProfile {
  @scala.inline
  def apply(
    formats: js.Array[String] = null,
    maxArea: js.UndefOr[Double] = js.undefined,
    maxHeight: js.UndefOr[Double] = js.undefined,
    maxWidth: js.UndefOr[Double] = js.undefined,
    qualities: js.Array[String] = null,
    supports: js.Array[String] = null
  ): IiifProfile = {
    val __obj = js.Dynamic.literal()
    if (formats != null) __obj.updateDynamic("formats")(formats.asInstanceOf[js.Any])
    if (!js.isUndefined(maxArea)) __obj.updateDynamic("maxArea")(maxArea.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxHeight)) __obj.updateDynamic("maxHeight")(maxHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWidth)) __obj.updateDynamic("maxWidth")(maxWidth.get.asInstanceOf[js.Any])
    if (qualities != null) __obj.updateDynamic("qualities")(qualities.asInstanceOf[js.Any])
    if (supports != null) __obj.updateDynamic("supports")(supports.asInstanceOf[js.Any])
    __obj.asInstanceOf[IiifProfile]
  }
}

