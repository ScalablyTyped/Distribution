package typings.atNivoChord.atNivoChordMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArcData extends js.Object {
  var color: String
  var endAngle: Double
  var formattedValue: Double | String
  var id: String
  var index: Double
  var label: String
  var startAngle: Double
  var value: Double
}

object ArcData {
  @scala.inline
  def apply(
    color: String,
    endAngle: Double,
    formattedValue: Double | String,
    id: String,
    index: Double,
    label: String,
    startAngle: Double,
    value: Double
  ): ArcData = {
    val __obj = js.Dynamic.literal(color = color, endAngle = endAngle, formattedValue = formattedValue.asInstanceOf[js.Any], id = id, index = index, label = label, startAngle = startAngle, value = value)
  
    __obj.asInstanceOf[ArcData]
  }
}

