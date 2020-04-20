package typings.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentData extends js.Object {
  var content_type: js.Any
  var data: js.Any
  var name: String
}

object AttachmentData {
  @scala.inline
  def apply(content_type: js.Any, data: js.Any, name: String): AttachmentData = {
    val __obj = js.Dynamic.literal(content_type = content_type.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentData]
  }
}

