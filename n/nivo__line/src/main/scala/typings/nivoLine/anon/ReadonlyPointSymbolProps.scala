package typings.nivoLine.anon

import typings.nivoLine.mod.Datum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<@nivo/line.@nivo/line.PointSymbolProps> */
@js.native
trait ReadonlyPointSymbolProps extends js.Object {
  val borderColor: String = js.native
  val borderWidth: Double = js.native
  val color: String = js.native
  val datum: Datum = js.native
  val size: Double = js.native
}

object ReadonlyPointSymbolProps {
  @scala.inline
  def apply(borderColor: String, borderWidth: Double, color: String, datum: Datum, size: Double): ReadonlyPointSymbolProps = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], datum = datum.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyPointSymbolProps]
  }
  @scala.inline
  implicit class ReadonlyPointSymbolPropsOps[Self <: ReadonlyPointSymbolProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setDatum(value: Datum): Self = this.set("datum", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
  }
  
}

