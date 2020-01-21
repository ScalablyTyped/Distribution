package typings.nodeOpenload

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContenttype extends js.Object {
  var content_type: String
  var id: String
  var name: String
  var sha1: String
  var size: Double
  var status: Double
}

object AnonContenttype {
  @scala.inline
  def apply(content_type: String, id: String, name: String, sha1: String, size: Double, status: Double): AnonContenttype = {
    val __obj = js.Dynamic.literal(content_type = content_type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sha1 = sha1.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonContenttype]
  }
}

