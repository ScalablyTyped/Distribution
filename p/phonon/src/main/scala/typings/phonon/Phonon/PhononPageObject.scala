package typings.phonon.Phonon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhononPageObject extends js.Object {
  var content: js.UndefOr[String | Null] = js.native
  var page: String = js.native
  var preventClose: js.UndefOr[Boolean] = js.native
  var readyDelay: js.UndefOr[Double] = js.native
}

object PhononPageObject {
  @scala.inline
  def apply(page: String): PhononPageObject = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhononPageObject]
  }
  @scala.inline
  implicit class PhononPageObjectOps[Self <: PhononPageObject] (val x: Self) extends AnyVal {
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
    def setPage(value: String): Self = this.set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setContentNull: Self = this.set("content", null)
    @scala.inline
    def setPreventClose(value: Boolean): Self = this.set("preventClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreventClose: Self = this.set("preventClose", js.undefined)
    @scala.inline
    def setReadyDelay(value: Double): Self = this.set("readyDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadyDelay: Self = this.set("readyDelay", js.undefined)
  }
  
}

