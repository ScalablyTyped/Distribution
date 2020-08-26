package typings.normalizeJss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextTransform extends js.Object {
  var textTransform: String = js.native
}

object TextTransform {
  @scala.inline
  def apply(textTransform: String): TextTransform = {
    val __obj = js.Dynamic.literal(textTransform = textTransform.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextTransform]
  }
  @scala.inline
  implicit class TextTransformOps[Self <: TextTransform] (val x: Self) extends AnyVal {
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
    def setTextTransform(value: String): Self = this.set("textTransform", value.asInstanceOf[js.Any])
  }
  
}

