package typings
package atNivoLineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Color extends js.Object {
  var color: java.lang.String
  var x: java.lang.String | scala.Double
  var xFormatted: java.lang.String | scala.Double
  var y: scala.Double
  var yFormatted: java.lang.String | scala.Double
  var yStacked: scala.Double
}

object Anon_Color {
  @scala.inline
  def apply(
    color: java.lang.String,
    x: java.lang.String | scala.Double,
    xFormatted: java.lang.String | scala.Double,
    y: scala.Double,
    yFormatted: java.lang.String | scala.Double,
    yStacked: scala.Double
  ): Anon_Color = {
    val __obj = js.Dynamic.literal(color = color, x = x.asInstanceOf[js.Any], xFormatted = xFormatted.asInstanceOf[js.Any], y = y, yFormatted = yFormatted.asInstanceOf[js.Any], yStacked = yStacked)
  
    __obj.asInstanceOf[Anon_Color]
  }
}

