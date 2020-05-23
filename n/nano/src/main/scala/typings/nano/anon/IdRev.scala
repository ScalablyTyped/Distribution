package typings.nano.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdRev extends js.Object {
  var _id: String
  var _rev: String
}

object IdRev {
  @scala.inline
  def apply(_id: String, _rev: String): IdRev = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _rev = _rev.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdRev]
  }
}

