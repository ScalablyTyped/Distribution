package typings.phonon.Phonon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhononDetail extends js.Object {
  var page: String = js.native
  var req: js.Array[String] = js.native
}

object PhononDetail {
  @scala.inline
  def apply(page: String, req: js.Array[String]): PhononDetail = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhononDetail]
  }
  @scala.inline
  implicit class PhononDetailOps[Self <: PhononDetail] (val x: Self) extends AnyVal {
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
    def setReqVarargs(value: String*): Self = this.set("req", js.Array(value :_*))
    @scala.inline
    def setReq(value: js.Array[String]): Self = this.set("req", value.asInstanceOf[js.Any])
  }
  
}

