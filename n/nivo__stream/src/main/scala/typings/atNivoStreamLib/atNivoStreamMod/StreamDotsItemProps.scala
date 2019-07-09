package typings
package atNivoStreamLib.atNivoStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamDotsItemProps extends js.Object {
  var borderColor: java.lang.String
  var borderWidth: scala.Double
  var color: java.lang.String
  var size: scala.Double
  var x: scala.Double
  var y: scala.Double
}

object StreamDotsItemProps {
  @scala.inline
  def apply(
    borderColor: java.lang.String,
    borderWidth: scala.Double,
    color: java.lang.String,
    size: scala.Double,
    x: scala.Double,
    y: scala.Double
  ): StreamDotsItemProps = {
    val __obj = js.Dynamic.literal(borderColor = borderColor, borderWidth = borderWidth, color = color, size = size, x = x, y = y)
  
    __obj.asInstanceOf[StreamDotsItemProps]
  }
}

