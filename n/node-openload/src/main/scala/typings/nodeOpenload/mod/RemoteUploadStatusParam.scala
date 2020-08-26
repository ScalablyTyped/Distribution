package typings.nodeOpenload.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoteUploadStatusParam extends js.Object {
  var id: js.UndefOr[String] = js.native
  var limit: js.UndefOr[Double] = js.native
}

object RemoteUploadStatusParam {
  @scala.inline
  def apply(): RemoteUploadStatusParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoteUploadStatusParam]
  }
  @scala.inline
  implicit class RemoteUploadStatusParamOps[Self <: RemoteUploadStatusParam] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
  }
  
}

