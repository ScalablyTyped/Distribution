package typings.nivoChord.mod

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
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], endAngle = endAngle.asInstanceOf[js.Any], formattedValue = formattedValue.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any], subindex = subindex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RibbonSubject]
  }
}

