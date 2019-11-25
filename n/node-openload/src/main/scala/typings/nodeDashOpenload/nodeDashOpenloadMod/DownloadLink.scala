package typings.nodeDashOpenload.nodeDashOpenloadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadLink extends js.Object {
  var content_type: String
  var name: String
  var sha1: String
  var size: Double
  var token: String
  var upload_at: String
  var url: String
}

object DownloadLink {
  @scala.inline
  def apply(
    content_type: String,
    name: String,
    sha1: String,
    size: Double,
    token: String,
    upload_at: String,
    url: String
  ): DownloadLink = {
    val __obj = js.Dynamic.literal(content_type = content_type.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sha1 = sha1.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], upload_at = upload_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DownloadLink]
  }
}

