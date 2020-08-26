package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AriaIndeterminateProgressText extends js.Object {
  var ariaIndeterminateProgressText: js.UndefOr[String] = js.native
}

object AriaIndeterminateProgressText {
  @scala.inline
  def apply(): AriaIndeterminateProgressText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AriaIndeterminateProgressText]
  }
  @scala.inline
  implicit class AriaIndeterminateProgressTextOps[Self <: AriaIndeterminateProgressText] (val x: Self) extends AnyVal {
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
    def setAriaIndeterminateProgressText(value: String): Self = this.set("ariaIndeterminateProgressText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaIndeterminateProgressText: Self = this.set("ariaIndeterminateProgressText", js.undefined)
  }
  
}

