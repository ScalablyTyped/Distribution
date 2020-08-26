package typings.mobileDetect.anon

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FullPattern extends js.Object {
  var fullPattern: RegExp = js.native
  var shortPattern: RegExp = js.native
  var tabletPattern: RegExp = js.native
}

object FullPattern {
  @scala.inline
  def apply(fullPattern: RegExp, shortPattern: RegExp, tabletPattern: RegExp): FullPattern = {
    val __obj = js.Dynamic.literal(fullPattern = fullPattern.asInstanceOf[js.Any], shortPattern = shortPattern.asInstanceOf[js.Any], tabletPattern = tabletPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullPattern]
  }
  @scala.inline
  implicit class FullPatternOps[Self <: FullPattern] (val x: Self) extends AnyVal {
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
    def setFullPattern(value: RegExp): Self = this.set("fullPattern", value.asInstanceOf[js.Any])
    @scala.inline
    def setShortPattern(value: RegExp): Self = this.set("shortPattern", value.asInstanceOf[js.Any])
    @scala.inline
    def setTabletPattern(value: RegExp): Self = this.set("tabletPattern", value.asInstanceOf[js.Any])
  }
  
}

