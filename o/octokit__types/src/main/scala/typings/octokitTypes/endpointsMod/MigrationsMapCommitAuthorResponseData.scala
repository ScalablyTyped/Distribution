package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MigrationsMapCommitAuthorResponseData extends js.Object {
  var email: String = js.native
  var id: Double = js.native
  var import_url: String = js.native
  var name: String = js.native
  var remote_id: String = js.native
  var remote_name: String = js.native
  var url: String = js.native
}

object MigrationsMapCommitAuthorResponseData {
  @scala.inline
  def apply(
    email: String,
    id: Double,
    import_url: String,
    name: String,
    remote_id: String,
    remote_name: String,
    url: String
  ): MigrationsMapCommitAuthorResponseData = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], import_url = import_url.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], remote_id = remote_id.asInstanceOf[js.Any], remote_name = remote_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationsMapCommitAuthorResponseData]
  }
  @scala.inline
  implicit class MigrationsMapCommitAuthorResponseDataOps[Self <: MigrationsMapCommitAuthorResponseData] (val x: Self) extends AnyVal {
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
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setImport_url(value: String): Self = this.set("import_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemote_id(value: String): Self = this.set("remote_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemote_name(value: String): Self = this.set("remote_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

