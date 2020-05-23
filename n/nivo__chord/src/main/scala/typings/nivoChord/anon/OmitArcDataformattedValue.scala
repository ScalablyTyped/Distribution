package typings.nivoChord.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @nivo/chord.Omit<@nivo/chord.@nivo/chord.ArcData, 'formattedValue' | 'label'> */
trait OmitArcDataformattedValue extends js.Object {
  var color: String
  var endAngle: Double
  var id: String
  var index: Double
  var startAngle: Double
  var value: Double
}

object OmitArcDataformattedValue {
  @scala.inline
  def apply(color: String, endAngle: Double, id: String, index: Double, startAngle: Double, value: Double): OmitArcDataformattedValue = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], endAngle = endAngle.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitArcDataformattedValue]
  }
}

