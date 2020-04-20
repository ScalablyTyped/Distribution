package typings.nodeOpenload

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCstatus extends js.Object {
  var content_type: String
  var cstatus: String
  var download_count: String
  var folderid: String
  var link: String
  var linkextid: String
  var name: String
  var sha1: String
  var size: String
  var status: String
  var upload_at: String
}

object AnonCstatus {
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
  ): AnonCstatus = {
    val __obj = js.Dynamic.literal(content_type = content_type.asInstanceOf[js.Any], cstatus = cstatus.asInstanceOf[js.Any], download_count = download_count.asInstanceOf[js.Any], folderid = folderid.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], linkextid = linkextid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sha1 = sha1.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], upload_at = upload_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCstatus]
  }
}

