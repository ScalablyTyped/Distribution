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
    maxArea: Int | Double = null,
    maxHeight: Int | Double = null,
    maxWidth: Int | Double = null,
    qualities: js.Array[String] = null,
    supports: js.Array[String] = null
  ): IiifProfile = {
    val __obj = js.Dynamic.literal()
    if (formats != null) __obj.updateDynamic("formats")(formats.asInstanceOf[js.Any])
    if (maxArea != null) __obj.updateDynamic("maxArea")(maxArea.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (qualities != null) __obj.updateDynamic("qualities")(qualities.asInstanceOf[js.Any])
    if (supports != null) __obj.updateDynamic("supports")(supports.asInstanceOf[js.Any])
    __obj.asInstanceOf[IiifProfile]
  }
}

