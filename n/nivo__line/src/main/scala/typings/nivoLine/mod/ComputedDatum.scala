package typings.nivoLine.mod

import typings.nivoLine.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComputedDatum extends js.Object {
  var data: Datum = js.native
  var position: X = js.native
}

object ComputedDatum {
  @scala.inline
  def apply(data: Datum, position: X): ComputedDatum = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputedDatum]
  }
  @scala.inline
  implicit class ComputedDatumOps[Self <: ComputedDatum] (val x: Self) extends AnyVal {
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
    def setData(value: Datum): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: X): Self = this.set("position", value.asInstanceOf[js.Any])
  }
  
}

