package typings
package atNivoChordLib.atNivoChordMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArcData extends js.Object {
  var color: java.lang.String
  var endAngle: scala.Double
  var formattedValue: scala.Double | java.lang.String
  var id: java.lang.String
  var index: scala.Double
  var label: java.lang.String
  var startAngle: scala.Double
  var value: scala.Double
}

object ArcData {
  @scala.inline
  def apply(
    color: java.lang.String,
    endAngle: scala.Double,
    formattedValue: scala.Double | java.lang.String,
    id: java.lang.String,
    index: scala.Double,
    label: java.lang.String,
    startAngle: scala.Double,
    value: scala.Double
  ): ArcData = {
    val __obj = js.Dynamic.literal(color = color, endAngle = endAngle, formattedValue = formattedValue.asInstanceOf[js.Any], id = id, index = index, label = label, startAngle = startAngle, value = value)
  
    __obj.asInstanceOf[ArcData]
  }
}

