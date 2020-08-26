package typings.openseadragon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AjaxWithCredentials extends js.Object {
  var ajaxWithCredentials: js.UndefOr[String | Boolean] = js.native
  var buildPyramid: js.UndefOr[Boolean] = js.native
  var crossOriginPolicy: js.UndefOr[String | Boolean] = js.native
  var url: String = js.native
  var useCanvas: js.UndefOr[Boolean] = js.native
}

object AjaxWithCredentials {
  @scala.inline
  def apply(url: String): AjaxWithCredentials = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AjaxWithCredentials]
  }
  @scala.inline
  implicit class AjaxWithCredentialsOps[Self <: AjaxWithCredentials] (val x: Self) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setAjaxWithCredentials(value: String | Boolean): Self = this.set("ajaxWithCredentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAjaxWithCredentials: Self = this.set("ajaxWithCredentials", js.undefined)
    @scala.inline
    def setBuildPyramid(value: Boolean): Self = this.set("buildPyramid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuildPyramid: Self = this.set("buildPyramid", js.undefined)
    @scala.inline
    def setCrossOriginPolicy(value: String | Boolean): Self = this.set("crossOriginPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrossOriginPolicy: Self = this.set("crossOriginPolicy", js.undefined)
    @scala.inline
    def setUseCanvas(value: Boolean): Self = this.set("useCanvas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseCanvas: Self = this.set("useCanvas", js.undefined)
  }
  
}

