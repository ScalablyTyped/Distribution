package typings.p2

import typings.p2.mod.Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPairs extends js.Object {
  var pairs: js.Array[Body]
  var `type`: String
}

object AnonPairs {
  @scala.inline
  def apply(pairs: js.Array[Body], `type`: String): AnonPairs = {
    val __obj = js.Dynamic.literal(pairs = pairs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPairs]
  }
}

