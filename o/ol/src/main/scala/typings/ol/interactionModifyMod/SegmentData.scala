package typings.ol.interactionModifyMod

import typings.ol.extentMod.Extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentData extends js.Object {
  var depth: js.UndefOr[js.Array[Double]] = js.undefined
  var feature: typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]
  var featureSegments: js.UndefOr[js.Array[SegmentData]] = js.undefined
  var geometry: typings.ol.geomSimpleGeometryMod.default
  var index: js.UndefOr[Double] = js.undefined
  var segment: js.Array[Extent]
}

object SegmentData {
  @scala.inline
  def apply(
    feature: typings.ol.featureMod.default[typings.ol.geomGeometryMod.default],
    geometry: typings.ol.geomSimpleGeometryMod.default,
    segment: js.Array[Extent],
    depth: js.Array[Double] = null,
    featureSegments: js.Array[SegmentData] = null,
    index: Int | Double = null
  ): SegmentData = {
    val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], segment = segment.asInstanceOf[js.Any])
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (featureSegments != null) __obj.updateDynamic("featureSegments")(featureSegments.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentData]
  }
}

