package typings.atNivoLine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Color extends js.Object {
  var color: String
  var x: String | Double
  var xFormatted: String | Double
  var y: Double
  var yFormatted: String | Double
  var yStacked: Double
}

object Anon_Color {
  @scala.inline
  def apply(
    color: String,
    x: String | Double,
    xFormatted: String | Double,
    y: Double,
    yFormatted: String | Double,
    yStacked: Double
  ): Anon_Color = {
    val __obj = js.Dynamic.literal(color = color, x = x.asInstanceOf[js.Any], xFormatted = xFormatted.asInstanceOf[js.Any], y = y, yFormatted = yFormatted.asInstanceOf[js.Any], yStacked = yStacked)
  
    __obj.asInstanceOf[Anon_Color]
  }
}

