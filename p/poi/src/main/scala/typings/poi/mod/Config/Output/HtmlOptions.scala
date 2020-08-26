package typings.poi.mod.Config.Output

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HtmlOptions extends js.Object {
  var filename: js.UndefOr[String] = js.native
  var inject: js.UndefOr[Boolean] = js.native
  var template: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
}

object HtmlOptions {
  @scala.inline
  def apply(): HtmlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HtmlOptions]
  }
  @scala.inline
  implicit class HtmlOptionsOps[Self <: HtmlOptions] (val x: Self) extends AnyVal {
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
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    @scala.inline
    def setInject(value: Boolean): Self = this.set("inject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInject: Self = this.set("inject", js.undefined)
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

