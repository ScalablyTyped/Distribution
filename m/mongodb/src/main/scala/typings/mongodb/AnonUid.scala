package typings.mongodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUid extends js.Object {
  var id: js.Any
  var uid: js.Any
}

object AnonUid {
  @scala.inline
  def apply(id: js.Any, uid: js.Any): AnonUid = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonUid]
  }
}

