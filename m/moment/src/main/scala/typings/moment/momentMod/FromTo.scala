package typings.moment.momentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FromTo extends _DurationInputArg1 {
  var from: MomentInput
  var to: MomentInput
}

object FromTo {
  @scala.inline
  def apply(from: MomentInput, to: MomentInput): FromTo = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FromTo]
  }
}

