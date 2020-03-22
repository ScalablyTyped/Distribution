package typings.nivoLine

import typings.nivoLine.mod.Datum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<@nivo/line.@nivo/line.PointSymbolProps> */
trait ReadonlyPointSymbolProps extends js.Object {
  val borderColor: String
  val borderWidth: Double
  val color: String
  val datum: Datum
  val size: Double
}

object ReadonlyPointSymbolProps {
  @scala.inline
  def apply(borderColor: String, borderWidth: Double, color: String, datum: Datum, size: Double): ReadonlyPointSymbolProps = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], datum = datum.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReadonlyPointSymbolProps]
  }
}

