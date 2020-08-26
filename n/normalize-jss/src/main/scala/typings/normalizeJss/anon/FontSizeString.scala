package typings.normalizeJss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontSizeString extends js.Object {
  var fontSize: String = js.native
}

object FontSizeString {
  @scala.inline
  def apply(fontSize: String): FontSizeString = {
    val __obj = js.Dynamic.literal(fontSize = fontSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontSizeString]
  }
  @scala.inline
  implicit class FontSizeStringOps[Self <: FontSizeString] (val x: Self) extends AnyVal {
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
  }
  
}

