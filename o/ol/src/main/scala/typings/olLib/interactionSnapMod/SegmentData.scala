package typings
package olLib.interactionSnapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentData extends js.Object {
  var feature: olLib.featureMod.default
  var segment: js.Array[olLib.coordinateMod.Coordinate]
}

object SegmentData {
  @scala.inline
  def apply(feature: olLib.featureMod.default, segment: js.Array[olLib.coordinateMod.Coordinate]): SegmentData = {
    val __obj = js.Dynamic.literal(feature = feature, segment = segment)
  
    __obj.asInstanceOf[SegmentData]
  }
}

