package typings.nodeOpenload.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Upload extends js.Object {
  var url: String
  var valid_until: String
}

object Upload {
  @scala.inline
  def apply(url: String, valid_until: String): Upload = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any], valid_until = valid_until.asInstanceOf[js.Any])
    __obj.asInstanceOf[Upload]
  }
}

