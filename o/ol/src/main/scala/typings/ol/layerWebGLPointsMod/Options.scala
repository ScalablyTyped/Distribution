package typings.ol.layerWebGLPointsMod

import typings.ol.extentMod.Extent
import typings.ol.styleLiteralStyleMod.LiteralStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var disableHitDetection: js.UndefOr[Boolean] = js.undefined
  var extent: js.UndefOr[Extent] = js.undefined
  var maxResolution: js.UndefOr[Double] = js.undefined
  var minResolution: js.UndefOr[Double] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var source: js.UndefOr[typings.ol.sourceVectorMod.default[typings.ol.geomGeometryMod.default]] = js.undefined
  var style: LiteralStyle
  var visible: js.UndefOr[Boolean] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    style: LiteralStyle,
    className: String = null,
    disableHitDetection: js.UndefOr[Boolean] = js.undefined,
    extent: Extent = null,
    maxResolution: Int | Double = null,
    minResolution: Int | Double = null,
    opacity: Int | Double = null,
    source: typings.ol.sourceVectorMod.default[typings.ol.geomGeometryMod.default] = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    zIndex: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disableHitDetection)) __obj.updateDynamic("disableHitDetection")(disableHitDetection.asInstanceOf[js.Any])
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    if (maxResolution != null) __obj.updateDynamic("maxResolution")(maxResolution.asInstanceOf[js.Any])
    if (minResolution != null) __obj.updateDynamic("minResolution")(minResolution.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

