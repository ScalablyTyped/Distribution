package typings.nivoGeo.mod

import typings.nivoGeo.nivoGeoStrings.`string VerticallineNobreakspacenumber`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChoroplethBoundFeature extends js.Object {
  var color: String
  var data: js.Any
  var formattedValue: `string VerticallineNobreakspacenumber`
  var label: String
  var value: Double
}

object ChoroplethBoundFeature {
  @scala.inline
  def apply(
    color: String,
    data: js.Any,
    formattedValue: `string VerticallineNobreakspacenumber`,
    label: String,
    value: Double
  ): ChoroplethBoundFeature = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], formattedValue = formattedValue.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChoroplethBoundFeature]
  }
}

