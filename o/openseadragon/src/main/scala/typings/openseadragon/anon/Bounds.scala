package typings.openseadragon.anon

import typings.openseadragon.mod.Point
import typings.openseadragon.mod.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bounds extends js.Object {
  var bounds: js.UndefOr[Rect] = js.undefined
  var compositeOperation: js.UndefOr[String] = js.undefined
  var opacity: Double
  var scale: js.UndefOr[Double] = js.undefined
  var translate: js.UndefOr[Point] = js.undefined
}

object Bounds {
  @scala.inline
  def apply(
    opacity: Double,
    bounds: Rect = null,
    compositeOperation: String = null,
    scale: js.UndefOr[Double] = js.undefined,
    translate: Point = null
  ): Bounds = {
    val __obj = js.Dynamic.literal(opacity = opacity.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (compositeOperation != null) __obj.updateDynamic("compositeOperation")(compositeOperation.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bounds]
  }
}

