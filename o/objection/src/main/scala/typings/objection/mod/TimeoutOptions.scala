package typings.objection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeoutOptions extends js.Object {
  var cancel: Boolean
}

object TimeoutOptions {
  @scala.inline
  def apply(cancel: Boolean): TimeoutOptions = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeoutOptions]
  }
}

