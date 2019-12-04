package typings.phaser.typesMatterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChamfer extends js.Object {
  var quality: js.UndefOr[Double] = js.undefined
  var qualityMax: js.UndefOr[Double] = js.undefined
  var qualityMin: js.UndefOr[Double] = js.undefined
  var radius: js.UndefOr[Double | js.Array[Double]] = js.undefined
}

object IChamfer {
  @scala.inline
  def apply(
    quality: Int | Double = null,
    qualityMax: Int | Double = null,
    qualityMin: Int | Double = null,
    radius: Double | js.Array[Double] = null
  ): IChamfer = {
    val __obj = js.Dynamic.literal()
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (qualityMax != null) __obj.updateDynamic("qualityMax")(qualityMax.asInstanceOf[js.Any])
    if (qualityMin != null) __obj.updateDynamic("qualityMin")(qualityMin.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChamfer]
  }
}

