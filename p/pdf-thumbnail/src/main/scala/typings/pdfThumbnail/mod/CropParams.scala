package typings.pdfThumbnail.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CropParams extends js.Object {
  var height: Double
  var ratio: js.UndefOr[Boolean] = js.undefined
  var width: Double
  var x: Double
  var y: Double
}

object CropParams {
  @scala.inline
  def apply(height: Double, width: Double, x: Double, y: Double, ratio: js.UndefOr[Boolean] = js.undefined): CropParams = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (!js.isUndefined(ratio)) __obj.updateDynamic("ratio")(ratio.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CropParams]
  }
}

