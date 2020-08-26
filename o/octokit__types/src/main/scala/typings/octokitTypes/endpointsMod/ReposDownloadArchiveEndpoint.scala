package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposDownloadArchiveEndpoint extends js.Object {
  var archive_format: String = js.native
  var owner: String = js.native
  var ref: String = js.native
  var repo: String = js.native
}

object ReposDownloadArchiveEndpoint {
  @scala.inline
  def apply(archive_format: String, owner: String, ref: String, repo: String): ReposDownloadArchiveEndpoint = {
    val __obj = js.Dynamic.literal(archive_format = archive_format.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposDownloadArchiveEndpoint]
  }
  @scala.inline
  implicit class ReposDownloadArchiveEndpointOps[Self <: ReposDownloadArchiveEndpoint] (val x: Self) extends AnyVal {
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
    def setArchive_format(value: String): Self = this.set("archive_format", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def setRef(value: String): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
  }
  
}

