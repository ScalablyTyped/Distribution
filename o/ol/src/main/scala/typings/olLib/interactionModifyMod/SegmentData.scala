package typings
package olLib.interactionModifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentData extends js.Object {
  var depth: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var feature: olLib.featureMod.default
  var featureSegments: js.UndefOr[js.Array[SegmentData]] = js.undefined
  var geometry: olLib.geomSimpleGeometryMod.default
  var index: js.UndefOr[scala.Double] = js.undefined
  var segment: js.Array[olLib.extentMod.Extent]
}

object SegmentData {
  @scala.inline
  def apply(
    feature: olLib.featureMod.default,
    geometry: olLib.geomSimpleGeometryMod.default,
    segment: js.Array[olLib.extentMod.Extent],
    depth: js.Array[scala.Double] = null,
    featureSegments: js.Array[SegmentData] = null,
    index: scala.Int | scala.Double = null
  ): SegmentData = {
    val __obj = js.Dynamic.literal(feature = feature, geometry = geometry, segment = segment)
    if (depth != null) __obj.updateDynamic("depth")(depth)
    if (featureSegments != null) __obj.updateDynamic("featureSegments")(featureSegments)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentData]
  }
}

