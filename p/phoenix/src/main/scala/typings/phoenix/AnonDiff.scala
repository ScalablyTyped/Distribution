package typings.phoenix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDiff extends js.Object {
  var diff: String
  var state: String
}

object AnonDiff {
  @scala.inline
  def apply(diff: String, state: String): AnonDiff = {
    val __obj = js.Dynamic.literal(diff = diff.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDiff]
  }
}

