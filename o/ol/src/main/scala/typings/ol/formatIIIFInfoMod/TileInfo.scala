package typings.ol.formatIIIFInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileInfo extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var scaleFactors: js.Array[Double]
  var width: Double
}

object TileInfo {
  @scala.inline
  def apply(scaleFactors: js.Array[Double], width: Double, height: Int | Double = null): TileInfo = {
    val __obj = js.Dynamic.literal(scaleFactors = scaleFactors.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileInfo]
  }
}

