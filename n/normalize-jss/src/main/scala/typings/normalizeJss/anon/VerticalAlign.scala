package typings.normalizeJss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VerticalAlign extends js.Object {
  var borderStyle: String = js.native
  var verticalAlign: String = js.native
}

object VerticalAlign {
  @scala.inline
  def apply(borderStyle: String, verticalAlign: String): VerticalAlign = {
    val __obj = js.Dynamic.literal(borderStyle = borderStyle.asInstanceOf[js.Any], verticalAlign = verticalAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerticalAlign]
  }
  @scala.inline
  implicit class VerticalAlignOps[Self <: VerticalAlign] (val x: Self) extends AnyVal {
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
    def setBorderStyle(value: String): Self = this.set("borderStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerticalAlign(value: String): Self = this.set("verticalAlign", value.asInstanceOf[js.Any])
  }
  
}

