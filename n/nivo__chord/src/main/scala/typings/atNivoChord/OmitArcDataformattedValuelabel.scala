package typings.atNivoChord

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @nivo/chord.Omit<@nivo/chord.@nivo/chord.ArcData, 'formattedValue' | 'label'> */
trait OmitArcDataformattedValuelabel extends js.Object {
  var color: String
  var endAngle: Double
  var id: String
  var index: Double
  var startAngle: Double
  var value: Double
}

object OmitArcDataformattedValuelabel {
  @scala.inline
  def apply(color: String, endAngle: Double, id: String, index: Double, startAngle: Double, value: Double): OmitArcDataformattedValuelabel = {
    val __obj = js.Dynamic.literal(color = color, endAngle = endAngle, id = id, index = index, startAngle = startAngle, value = value)
  
    __obj.asInstanceOf[OmitArcDataformattedValuelabel]
  }
}

