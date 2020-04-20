package typings.ol.snapMod

import typings.ol.coordinateMod.Coordinate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentData extends js.Object {
  var feature: typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]
  var segment: js.Array[Coordinate]
}

object SegmentData {
  @scala.inline
  def apply(
    feature: typings.ol.olFeatureMod.default[typings.ol.geometryMod.default],
    segment: js.Array[Coordinate]
  ): SegmentData = {
    val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any], segment = segment.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentData]
  }
}

