package typings.normalizeJss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Border extends js.Object {
  var border: String = js.native
  var margin: js.Array[js.Array[Double]] = js.native
  var padding: js.Array[js.Array[String]] = js.native
}

object Border {
  @scala.inline
  def apply(border: String, margin: js.Array[js.Array[Double]], padding: js.Array[js.Array[String]]): Border = {
    val __obj = js.Dynamic.literal(border = border.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Border]
  }
  @scala.inline
  implicit class BorderOps[Self <: Border] (val x: Self) extends AnyVal {
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
    def setBorder(value: String): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarginVarargs(value: js.Array[Double]*): Self = this.set("margin", js.Array(value :_*))
    @scala.inline
    def setMargin(value: js.Array[js.Array[Double]]): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaddingVarargs(value: js.Array[String]*): Self = this.set("padding", js.Array(value :_*))
    @scala.inline
    def setPadding(value: js.Array[js.Array[String]]): Self = this.set("padding", value.asInstanceOf[js.Any])
  }
  
}

