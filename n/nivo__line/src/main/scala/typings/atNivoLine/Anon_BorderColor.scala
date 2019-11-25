package typings.atNivoLine

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BorderColor extends js.Object {
  var borderColor: String
  var color: String
  var data: Anon_Color
  var id: String
  var index: Double
  var serieColor: String
  var serieId: String | Double
  var x: Double | String | Date
  var y: Double | String | Date
}

object Anon_BorderColor {
  @scala.inline
  def apply(
    borderColor: String,
    color: String,
    data: Anon_Color,
    id: String,
    index: Double,
    serieColor: String,
    serieId: String | Double,
    x: Double | String | Date,
    y: Double | String | Date
  ): Anon_BorderColor = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], serieColor = serieColor.asInstanceOf[js.Any], serieId = serieId.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BorderColor]
  }
}

