package typings.nightwatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NightwatchScreenshotOptions extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.native
  var on_error: js.UndefOr[Boolean] = js.native
  var on_failure: js.UndefOr[Boolean] = js.native
  var path: js.UndefOr[String] = js.native
}

object NightwatchScreenshotOptions {
  @scala.inline
  def apply(): NightwatchScreenshotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NightwatchScreenshotOptions]
  }
  @scala.inline
  implicit class NightwatchScreenshotOptionsOps[Self <: NightwatchScreenshotOptions] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setOn_error(value: Boolean): Self = this.set("on_error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOn_error: Self = this.set("on_error", js.undefined)
    @scala.inline
    def setOn_failure(value: Boolean): Self = this.set("on_failure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOn_failure: Self = this.set("on_failure", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
  
}

