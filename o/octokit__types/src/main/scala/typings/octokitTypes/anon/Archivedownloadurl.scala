package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Archivedownloadurl extends js.Object {
  var archive_download_url: String = js.native
  var created_at: String = js.native
  var expired: Boolean = js.native
  var expires_at: String = js.native
  var id: Double = js.native
  var name: String = js.native
  var node_id: String = js.native
  var size_in_bytes: Double = js.native
  var url: String = js.native
}

object Archivedownloadurl {
  @scala.inline
  def apply(
    archive_download_url: String,
    created_at: String,
    expired: Boolean,
    expires_at: String,
    id: Double,
    name: String,
    node_id: String,
    size_in_bytes: Double,
    url: String
  ): Archivedownloadurl = {
    val __obj = js.Dynamic.literal(archive_download_url = archive_download_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], expired = expired.asInstanceOf[js.Any], expires_at = expires_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], size_in_bytes = size_in_bytes.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Archivedownloadurl]
  }
  @scala.inline
  implicit class ArchivedownloadurlOps[Self <: Archivedownloadurl] (val x: Self) extends AnyVal {
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
    def setArchive_download_url(value: String): Self = this.set("archive_download_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpired(value: Boolean): Self = this.set("expired", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpires_at(value: String): Self = this.set("expires_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode_id(value: String): Self = this.set("node_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize_in_bytes(value: Double): Self = this.set("size_in_bytes", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

