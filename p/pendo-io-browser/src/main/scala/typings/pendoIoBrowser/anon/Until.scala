package typings.pendoIoBrowser.anon

import typings.pendoIoBrowser.pendoIoBrowserStrings.reload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Until extends js.Object {
  var until: reload = js.native
}

object Until {
  @scala.inline
  def apply(until: reload): Until = {
    val __obj = js.Dynamic.literal(until = until.asInstanceOf[js.Any])
    __obj.asInstanceOf[Until]
  }
  @scala.inline
  implicit class UntilOps[Self <: Until] (val x: Self) extends AnyVal {
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
    def setUntil(value: reload): Self = this.set("until", value.asInstanceOf[js.Any])
  }
  
}

