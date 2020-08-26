package typings.nivoScatterplot.anon

import typings.nivoScatterplot.mod.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormattedX extends js.Object {
  var formattedX: String | Double = js.native
  var formattedY: String | Double = js.native
  var serieId: String = js.native
  var x: Value = js.native
  var y: Value = js.native
}

object FormattedX {
  @scala.inline
  def apply(formattedX: String | Double, formattedY: String | Double, serieId: String, x: Value, y: Value): FormattedX = {
    val __obj = js.Dynamic.literal(formattedX = formattedX.asInstanceOf[js.Any], formattedY = formattedY.asInstanceOf[js.Any], serieId = serieId.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormattedX]
  }
  @scala.inline
  implicit class FormattedXOps[Self <: FormattedX] (val x: Self) extends AnyVal {
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
    def setFormattedX(value: String | Double): Self = this.set("formattedX", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormattedY(value: String | Double): Self = this.set("formattedY", value.asInstanceOf[js.Any])
    @scala.inline
    def setSerieId(value: String): Self = this.set("serieId", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Value): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Value): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

