package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemPreviewInfo extends js.Object {
  var getUrl: js.UndefOr[String] = js.native
  var postParameters: js.UndefOr[String] = js.native
  var postUrl: js.UndefOr[String] = js.native
}

object ItemPreviewInfo {
  @scala.inline
  def apply(): ItemPreviewInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemPreviewInfo]
  }
  @scala.inline
  implicit class ItemPreviewInfoOps[Self <: ItemPreviewInfo] (val x: Self) extends AnyVal {
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
    def setGetUrl(value: String): Self = this.set("getUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetUrl: Self = this.set("getUrl", js.undefined)
    @scala.inline
    def setPostParameters(value: String): Self = this.set("postParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostParameters: Self = this.set("postParameters", js.undefined)
    @scala.inline
    def setPostUrl(value: String): Self = this.set("postUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostUrl: Self = this.set("postUrl", js.undefined)
  }
  
}

