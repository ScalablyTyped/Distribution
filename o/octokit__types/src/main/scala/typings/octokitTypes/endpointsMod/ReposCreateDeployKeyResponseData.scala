package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposCreateDeployKeyResponseData extends js.Object {
  var created_at: String = js.native
  var id: Double = js.native
  var key: String = js.native
  var read_only: Boolean = js.native
  var title: String = js.native
  var url: String = js.native
  var verified: Boolean = js.native
}

object ReposCreateDeployKeyResponseData {
  @scala.inline
  def apply(
    created_at: String,
    id: Double,
    key: String,
    read_only: Boolean,
    title: String,
    url: String,
    verified: Boolean
  ): ReposCreateDeployKeyResponseData = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], read_only = read_only.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateDeployKeyResponseData]
  }
  @scala.inline
  implicit class ReposCreateDeployKeyResponseDataOps[Self <: ReposCreateDeployKeyResponseData] (val x: Self) extends AnyVal {
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
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setRead_only(value: Boolean): Self = this.set("read_only", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerified(value: Boolean): Self = this.set("verified", value.asInstanceOf[js.Any])
  }
  
}

