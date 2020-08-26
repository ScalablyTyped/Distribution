package typings.plaidLink.mod.Plaid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnExitMetaData extends js.Object {
  var institution: Institution = js.native
  var link_session_id: String = js.native
  var request_id: String = js.native
  var status: ExitStatus = js.native
}

object OnExitMetaData {
  @scala.inline
  def apply(institution: Institution, link_session_id: String, request_id: String, status: ExitStatus): OnExitMetaData = {
    val __obj = js.Dynamic.literal(institution = institution.asInstanceOf[js.Any], link_session_id = link_session_id.asInstanceOf[js.Any], request_id = request_id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnExitMetaData]
  }
  @scala.inline
  implicit class OnExitMetaDataOps[Self <: OnExitMetaData] (val x: Self) extends AnyVal {
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
    def setInstitution(value: Institution): Self = this.set("institution", value.asInstanceOf[js.Any])
    @scala.inline
    def setLink_session_id(value: String): Self = this.set("link_session_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest_id(value: String): Self = this.set("request_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: ExitStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

