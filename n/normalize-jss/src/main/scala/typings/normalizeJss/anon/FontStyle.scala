package typings.normalizeJss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontStyle extends js.Object {
  var fontStyle: String = js.native
}

object FontStyle {
  @scala.inline
  def apply(fontStyle: String): FontStyle = {
    val __obj = js.Dynamic.literal(fontStyle = fontStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontStyle]
  }
  @scala.inline
  implicit class FontStyleOps[Self <: FontStyle] (val x: Self) extends AnyVal {
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
    def setFontStyle(value: String): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
  }
  
}

