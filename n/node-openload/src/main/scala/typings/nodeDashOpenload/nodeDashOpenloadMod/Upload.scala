package typings.nodeDashOpenload.nodeDashOpenloadMod

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
    val __obj = js.Dynamic.literal(url = url, valid_until = valid_until)
  
    __obj.asInstanceOf[Upload]
  }
}

