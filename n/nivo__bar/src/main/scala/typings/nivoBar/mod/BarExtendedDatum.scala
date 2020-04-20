package typings.nivoBar.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BarExtendedDatum extends js.Object {
  var color: String
  var data: BarDatum
  var id: String | Double
  var index: Double
  var indexValue: String | Double
  var value: Double
}

object BarExtendedDatum {
  @scala.inline
  def apply(
    color: String,
    data: BarDatum,
    id: String | Double,
    index: Double,
    indexValue: String | Double,
    value: Double
  ): BarExtendedDatum = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], indexValue = indexValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarExtendedDatum]
  }
}

