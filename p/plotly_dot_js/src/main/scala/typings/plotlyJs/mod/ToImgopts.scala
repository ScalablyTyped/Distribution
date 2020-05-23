package typings.plotlyJs.mod

import typings.plotlyJs.plotlyJsStrings.jpeg
import typings.plotlyJs.plotlyJsStrings.png
import typings.plotlyJs.plotlyJsStrings.svg
import typings.plotlyJs.plotlyJsStrings.webp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToImgopts extends js.Object {
  var format: jpeg | png | webp | svg
  var height: Double
  var scale: js.UndefOr[Double] = js.undefined
  var width: Double
}

object ToImgopts {
  @scala.inline
  def apply(
    format: jpeg | png | webp | svg,
    height: Double,
    width: Double,
    scale: js.UndefOr[Double] = js.undefined
  ): ToImgopts = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToImgopts]
  }
}

