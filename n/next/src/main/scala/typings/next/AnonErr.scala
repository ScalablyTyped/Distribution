package typings.next

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErr extends js.Object {
  var err: js.Any
}

object AnonErr {
  @scala.inline
  def apply(err: js.Any): AnonErr = {
    val __obj = js.Dynamic.literal(err = err.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonErr]
  }
}

