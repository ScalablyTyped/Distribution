package typings.mjml.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MJMLMinifyOptions extends js.Object {
  var collapseWhitespace: js.UndefOr[Boolean] = js.native
  var minifyCSS: js.UndefOr[Boolean] = js.native
  var removeEmptyAttributes: js.UndefOr[Boolean] = js.native
}

object MJMLMinifyOptions {
  @scala.inline
  def apply(): MJMLMinifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MJMLMinifyOptions]
  }
  @scala.inline
  implicit class MJMLMinifyOptionsOps[Self <: MJMLMinifyOptions] (val x: Self) extends AnyVal {
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
    def setCollapseWhitespace(value: Boolean): Self = this.set("collapseWhitespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapseWhitespace: Self = this.set("collapseWhitespace", js.undefined)
    @scala.inline
    def setMinifyCSS(value: Boolean): Self = this.set("minifyCSS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinifyCSS: Self = this.set("minifyCSS", js.undefined)
    @scala.inline
    def setRemoveEmptyAttributes(value: Boolean): Self = this.set("removeEmptyAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveEmptyAttributes: Self = this.set("removeEmptyAttributes", js.undefined)
  }
  
}

