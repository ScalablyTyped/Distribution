package typings.normalizeJss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontSizeMargin extends js.Object {
  var fontSize: String = js.native
  var margin: js.Array[js.Array[String]] = js.native
}

object FontSizeMargin {
  @scala.inline
  def apply(fontSize: String, margin: js.Array[js.Array[String]]): FontSizeMargin = {
    val __obj = js.Dynamic.literal(fontSize = fontSize.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontSizeMargin]
  }
  @scala.inline
  implicit class FontSizeMarginOps[Self <: FontSizeMargin] (val x: Self) extends AnyVal {
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
    def setFontSize(value: String): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarginVarargs(value: js.Array[String]*): Self = this.set("margin", js.Array(value :_*))
    @scala.inline
    def setMargin(value: js.Array[js.Array[String]]): Self = this.set("margin", value.asInstanceOf[js.Any])
  }
  
}

