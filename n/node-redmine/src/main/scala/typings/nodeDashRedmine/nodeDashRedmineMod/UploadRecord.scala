package typings.nodeDashRedmine.nodeDashRedmineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadRecord extends js.Object {
  var content_type: js.UndefOr[String] = js.undefined
  var filename: String
  var token: String
}

object UploadRecord {
  @scala.inline
  def apply(filename: String, token: String, content_type: String = null): UploadRecord = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    if (content_type != null) __obj.updateDynamic("content_type")(content_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadRecord]
  }
}

