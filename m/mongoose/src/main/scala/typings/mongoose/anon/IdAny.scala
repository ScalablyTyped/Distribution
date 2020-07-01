package typings.mongoose.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdAny extends js.Object {
  var _id: js.Any
}

object IdAny {
  @scala.inline
  def apply(_id: js.Any): IdAny = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdAny]
  }
}

