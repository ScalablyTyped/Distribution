package typings.nivoScatterplot.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Datum extends js.Object {
  var x: Value = js.native
  var y: Value = js.native
}

object Datum {
  @scala.inline
  def apply(x: Value, y: Value): Datum = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Datum]
  }
  @scala.inline
  implicit class DatumOps[Self <: Datum] (val x: Self) extends AnyVal {
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
    def setX(value: Value): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Value): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

