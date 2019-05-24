package typings
package atNivoChordLib.atNivoChordMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RibbonSubject extends ArcData {
  var subindex: scala.Double
}

object RibbonSubject {
  @scala.inline
  def apply(
    color: java.lang.String,
    endAngle: scala.Double,
    formattedValue: scala.Double | java.lang.String,
    id: java.lang.String,
    index: scala.Double,
    label: java.lang.String,
    startAngle: scala.Double,
    subindex: scala.Double,
    value: scala.Double
  ): RibbonSubject = {
    val __obj = js.Dynamic.literal(color = color, endAngle = endAngle, formattedValue = formattedValue.asInstanceOf[js.Any], id = id, index = index, label = label, startAngle = startAngle, subindex = subindex, value = value)
  
    __obj.asInstanceOf[RibbonSubject]
  }
}

