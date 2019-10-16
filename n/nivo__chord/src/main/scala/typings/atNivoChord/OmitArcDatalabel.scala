package typings.atNivoChord

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @nivo/chord.Omit<@nivo/chord.@nivo/chord.ArcData, 'label'> */
trait OmitArcDatalabel extends js.Object {
  var color: String
  var endAngle: Double
  var formattedValue: Double | String
  var id: String
  var index: Double
  var startAngle: Double
  var value: Double
}

object OmitArcDatalabel {
  @scala.inline
  def apply(
    color: String,
    endAngle: Double,
    formattedValue: Double | String,
    id: String,
    index: Double,
    startAngle: Double,
    value: Double
  ): OmitArcDatalabel = {
    val __obj = js.Dynamic.literal(color = color, endAngle = endAngle, formattedValue = formattedValue.asInstanceOf[js.Any], id = id, index = index, startAngle = startAngle, value = value)
  
    __obj.asInstanceOf[OmitArcDatalabel]
  }
}

