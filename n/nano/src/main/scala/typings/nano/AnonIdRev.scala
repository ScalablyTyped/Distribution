package typings.nano

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIdRev extends js.Object {
  var _id: String
  var _rev: String
}

object AnonIdRev {
  @scala.inline
  def apply(_id: String, _rev: String): AnonIdRev = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _rev = _rev.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIdRev]
  }
}

