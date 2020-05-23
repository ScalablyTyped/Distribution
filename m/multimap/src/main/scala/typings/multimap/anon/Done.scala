package typings.multimap.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Done extends js.Object {
  var done: Boolean
  var value: js.Any
}

object Done {
  @scala.inline
  def apply(done: Boolean, value: js.Any): Done = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Done]
  }
}

