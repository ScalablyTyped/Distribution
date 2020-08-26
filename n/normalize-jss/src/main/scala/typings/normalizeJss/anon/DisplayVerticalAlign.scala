package typings.normalizeJss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisplayVerticalAlign extends js.Object {
  var display: String = js.native
  var verticalAlign: String = js.native
}

object DisplayVerticalAlign {
  @scala.inline
  def apply(display: String, verticalAlign: String): DisplayVerticalAlign = {
    val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any], verticalAlign = verticalAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayVerticalAlign]
  }
  @scala.inline
  implicit class DisplayVerticalAlignOps[Self <: DisplayVerticalAlign] (val x: Self) extends AnyVal {
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
    def setDisplay(value: String): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerticalAlign(value: String): Self = this.set("verticalAlign", value.asInstanceOf[js.Any])
  }
  
}

