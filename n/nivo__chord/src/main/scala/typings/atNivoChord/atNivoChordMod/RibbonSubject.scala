package typings.atNivoChord.atNivoChordMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RibbonSubject extends ArcData {
  var subindex: Double
}

object RibbonSubject {
  @scala.inline
  def apply(
    color: String,
    endAngle: Double,
    formattedValue: Double | String,
    id: String,
    index: Double,
    label: String,
    startAngle: Double,
    subindex: Double,
    value: Double
  ): RibbonSubject = {
    val __obj = js.Dynamic.literal(color = color, endAngle = endAngle, formattedValue = formattedValue.asInstanceOf[js.Any], id = id, index = index, label = label, startAngle = startAngle, subindex = subindex, value = value)
  
    __obj.asInstanceOf[RibbonSubject]
  }
}

