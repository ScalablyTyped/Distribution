package typings.nodeOpenload.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cstatus extends js.Object {
  var content_type: String = js.native
  var cstatus: String = js.native
  var download_count: String = js.native
  var folderid: String = js.native
  var link: String = js.native
  var linkextid: String = js.native
  var name: String = js.native
  var sha1: String = js.native
  var size: String = js.native
  var status: String = js.native
  var upload_at: String = js.native
}

object Cstatus {
  @scala.inline
  def apply(
    content_type: String,
    cstatus: String,
    download_count: String,
    folderid: String,
    link: String,
    linkextid: String,
    name: String,
    sha1: String,
    size: String,
    status: String,
    upload_at: String
  ): Cstatus = {
    val __obj = js.Dynamic.literal(content_type = content_type.asInstanceOf[js.Any], cstatus = cstatus.asInstanceOf[js.Any], download_count = download_count.asInstanceOf[js.Any], folderid = folderid.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], linkextid = linkextid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sha1 = sha1.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], upload_at = upload_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cstatus]
  }
  @scala.inline
  implicit class CstatusOps[Self <: Cstatus] (val x: Self) extends AnyVal {
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
    def setContent_type(value: String): Self = this.set("content_type", value.asInstanceOf[js.Any])
    @scala.inline
    def setCstatus(value: String): Self = this.set("cstatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setDownload_count(value: String): Self = this.set("download_count", value.asInstanceOf[js.Any])
    @scala.inline
    def setFolderid(value: String): Self = this.set("folderid", value.asInstanceOf[js.Any])
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinkextid(value: String): Self = this.set("linkextid", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSha1(value: String): Self = this.set("sha1", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpload_at(value: String): Self = this.set("upload_at", value.asInstanceOf[js.Any])
  }
  
}

