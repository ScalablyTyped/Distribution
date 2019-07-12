package typings
package atNivoLineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BorderColor extends js.Object {
  var borderColor: java.lang.String
  var color: java.lang.String
  var data: Anon_Color
  var id: java.lang.String
  var index: scala.Double
  var serieColor: java.lang.String
  var serieId: java.lang.String | scala.Double
  var x: scala.Double | java.lang.String | stdLib.Date
  var y: scala.Double | java.lang.String | stdLib.Date
}

object Anon_BorderColor {
  @scala.inline
  def apply(
    borderColor: java.lang.String,
    color: java.lang.String,
    data: Anon_Color,
    id: java.lang.String,
    index: scala.Double,
    serieColor: java.lang.String,
    serieId: java.lang.String | scala.Double,
    x: scala.Double | java.lang.String | stdLib.Date,
    y: scala.Double | java.lang.String | stdLib.Date
  ): Anon_BorderColor = {
    val __obj = js.Dynamic.literal(borderColor = borderColor, color = color, data = data, id = id, index = index, serieColor = serieColor, serieId = serieId.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BorderColor]
  }
}

