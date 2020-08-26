package typings.nivoWaffle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WaffleDatum extends js.Object {
  var id: String | Double = js.native
  var label: String | Double = js.native
  var value: Double = js.native
}

object WaffleDatum {
  @scala.inline
  def apply(id: String | Double, label: String | Double, value: Double): WaffleDatum = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaffleDatum]
  }
  @scala.inline
  implicit class WaffleDatumOps[Self <: WaffleDatum] (val x: Self) extends AnyVal {
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
    def setId(value: String | Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String | Double): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

