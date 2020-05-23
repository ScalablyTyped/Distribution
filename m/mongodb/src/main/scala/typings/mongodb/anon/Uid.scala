package typings.mongodb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Uid extends js.Object {
  var id: js.Any
  var uid: js.Any
}

object Uid {
  @scala.inline
  def apply(id: js.Any, uid: js.Any): Uid = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Uid]
  }
}

