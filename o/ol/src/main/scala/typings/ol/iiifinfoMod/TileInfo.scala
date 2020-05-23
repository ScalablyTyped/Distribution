package typings.ol.iiifinfoMod

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
  def apply(scaleFactors: js.Array[Double], width: Double, height: js.UndefOr[Double] = js.undefined): TileInfo = {
    val __obj = js.Dynamic.literal(scaleFactors = scaleFactors.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileInfo]
  }
}

