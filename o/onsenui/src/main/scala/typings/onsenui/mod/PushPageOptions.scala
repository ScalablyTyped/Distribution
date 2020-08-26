package typings.onsenui.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PushPageOptions extends js.Object {
  var animation: js.UndefOr[String] = js.native
  var animationOptions: js.UndefOr[js.Object] = js.native
  var callback: js.UndefOr[js.Function] = js.native
  var data: js.UndefOr[js.Object] = js.native
  var page: js.UndefOr[js.Any] = js.native
  var pageHTML: js.UndefOr[String] = js.native
}

object PushPageOptions {
  @scala.inline
  def apply(): PushPageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PushPageOptions]
  }
  @scala.inline
  implicit class PushPageOptionsOps[Self <: PushPageOptions] (val x: Self) extends AnyVal {
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
    def setAnimation(value: String): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setAnimationOptions(value: js.Object): Self = this.set("animationOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationOptions: Self = this.set("animationOptions", js.undefined)
    @scala.inline
    def setCallback(value: js.Function): Self = this.set("callback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    @scala.inline
    def setData(value: js.Object): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setPage(value: js.Any): Self = this.set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    @scala.inline
    def setPageHTML(value: String): Self = this.set("pageHTML", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageHTML: Self = this.set("pageHTML", js.undefined)
  }
  
}

