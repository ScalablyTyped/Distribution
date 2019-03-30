package typings
package atNivoGeoLib.atNivoGeoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChoroplethBoundFeature extends js.Object {
  var color: java.lang.String
  var data: js.Any
  var formattedValue: atNivoGeoLib.atNivoGeoLibStrings.`string |BACKSLASHu00A0number`
  var label: java.lang.String
  var value: scala.Double
}

object ChoroplethBoundFeature {
  @scala.inline
  def apply(
    color: java.lang.String,
    data: js.Any,
    formattedValue: atNivoGeoLib.atNivoGeoLibStrings.`string |BACKSLASHu00A0number`,
    label: java.lang.String,
    value: scala.Double
  ): ChoroplethBoundFeature = {
    val __obj = js.Dynamic.literal(color = color, data = data, formattedValue = formattedValue, label = label, value = value)
  
    __obj.asInstanceOf[ChoroplethBoundFeature]
  }
}

