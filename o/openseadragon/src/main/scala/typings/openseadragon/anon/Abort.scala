package typings.openseadragon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Abort extends js.Object {
  var abort: js.UndefOr[js.Function0[Unit]] = js.native
  var ajaxHeaders: js.UndefOr[String] = js.native
  var ajaxWithCredentials: js.UndefOr[Boolean] = js.native
  var callback: js.UndefOr[js.Function0[Unit]] = js.native
  var crossOriginPolicy: js.UndefOr[String | Boolean] = js.native
  var loadWithAjax: js.UndefOr[String] = js.native
  var src: js.UndefOr[String] = js.native
}

object Abort {
  @scala.inline
  def apply(): Abort = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Abort]
  }
  @scala.inline
  implicit class AbortOps[Self <: Abort] (val x: Self) extends AnyVal {
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
    def setAbort(value: () => Unit): Self = this.set("abort", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAbort: Self = this.set("abort", js.undefined)
    @scala.inline
    def setAjaxHeaders(value: String): Self = this.set("ajaxHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAjaxHeaders: Self = this.set("ajaxHeaders", js.undefined)
    @scala.inline
    def setAjaxWithCredentials(value: Boolean): Self = this.set("ajaxWithCredentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAjaxWithCredentials: Self = this.set("ajaxWithCredentials", js.undefined)
    @scala.inline
    def setCallback(value: () => Unit): Self = this.set("callback", js.Any.fromFunction0(value))
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    @scala.inline
    def setCrossOriginPolicy(value: String | Boolean): Self = this.set("crossOriginPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrossOriginPolicy: Self = this.set("crossOriginPolicy", js.undefined)
    @scala.inline
    def setLoadWithAjax(value: String): Self = this.set("loadWithAjax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadWithAjax: Self = this.set("loadWithAjax", js.undefined)
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
  }
  
}

