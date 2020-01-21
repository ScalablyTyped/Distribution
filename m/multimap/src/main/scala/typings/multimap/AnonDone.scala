package typings.multimap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDone extends js.Object {
  var done: Boolean
  var value: js.Any
}

object AnonDone {
  @scala.inline
  def apply(done: Boolean, value: js.Any): AnonDone = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDone]
  }
}

