package typings.nivoLine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointSymbolProps extends js.Object {
  var borderColor: String
  var borderWidth: Double
  var color: String
  var datum: Datum
  var size: Double
}

object PointSymbolProps {
  @scala.inline
  def apply(borderColor: String, borderWidth: Double, color: String, datum: Datum, size: Double): PointSymbolProps = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], datum = datum.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PointSymbolProps]
  }
}

