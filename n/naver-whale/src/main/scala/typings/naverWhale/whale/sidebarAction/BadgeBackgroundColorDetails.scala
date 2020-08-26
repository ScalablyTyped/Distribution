package typings.naverWhale.whale.sidebarAction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BadgeBackgroundColorDetails extends js.Object {
  /** 색상값 배열([255, 0, 0, 255]) 혹은 HEX 색상 표현 문자열(#FF0000). */
  var color: String | ColorArray = js.native
}

object BadgeBackgroundColorDetails {
  @scala.inline
  def apply(color: String | ColorArray): BadgeBackgroundColorDetails = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[BadgeBackgroundColorDetails]
  }
  @scala.inline
  implicit class BadgeBackgroundColorDetailsOps[Self <: BadgeBackgroundColorDetails] (val x: Self) extends AnyVal {
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
    def setColor(value: String | ColorArray): Self = this.set("color", value.asInstanceOf[js.Any])
  }
  
}

