package typings
package atNivoBarLib.atNivoBarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BarExtendedDatum extends js.Object {
  var color: java.lang.String
  var data: BarDatum
  var id: java.lang.String | scala.Double
  var index: scala.Double
  var indexValue: java.lang.String | scala.Double
  var value: scala.Double
}

object BarExtendedDatum {
  @scala.inline
  def apply(
    color: java.lang.String,
    data: BarDatum,
    id: java.lang.String | scala.Double,
    index: scala.Double,
    indexValue: java.lang.String | scala.Double,
    value: scala.Double
  ): BarExtendedDatum = {
    val __obj = js.Dynamic.literal(color = color, data = data, id = id.asInstanceOf[js.Any], index = index, indexValue = indexValue.asInstanceOf[js.Any], value = value)
  
    __obj.asInstanceOf[BarExtendedDatum]
  }
}

