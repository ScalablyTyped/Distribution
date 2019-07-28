package typings.atNivoGeo.atNivoGeoMod

import typings.atNivoGeo.atNivoGeoStrings.`string |BACKSLASHu00A0number`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChoroplethBoundFeature extends js.Object {
  var color: String
  var data: js.Any
  var formattedValue: `string |BACKSLASHu00A0number`
  var label: String
  var value: Double
}

object ChoroplethBoundFeature {
  @scala.inline
  def apply(
    color: String,
    data: js.Any,
    formattedValue: `string |BACKSLASHu00A0number`,
    label: String,
    value: Double
  ): ChoroplethBoundFeature = {
    val __obj = js.Dynamic.literal(color = color, data = data, formattedValue = formattedValue, label = label, value = value)
  
    __obj.asInstanceOf[ChoroplethBoundFeature]
  }
}

