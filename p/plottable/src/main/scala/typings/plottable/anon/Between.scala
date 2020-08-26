package typings.plottable.anon

import typings.plottable.plottableStrings.between
import typings.plottable.plottableStrings.center
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Between extends js.Object {
  var between: typings.plottable.plottableStrings.between = js.native
  var center: typings.plottable.plottableStrings.center = js.native
}

object Between {
  @scala.inline
  def apply(between: between, center: center): Between = {
    val __obj = js.Dynamic.literal(between = between.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any])
    __obj.asInstanceOf[Between]
  }
  @scala.inline
  implicit class BetweenOps[Self <: Between] (val x: Self) extends AnyVal {
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
    def setBetween(value: between): Self = this.set("between", value.asInstanceOf[js.Any])
    @scala.inline
    def setCenter(value: center): Self = this.set("center", value.asInstanceOf[js.Any])
  }
  
}

