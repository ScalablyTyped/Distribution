package typings.plotlyJs

import typings.plotlyJs.mod.Transition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFrame extends js.Object {
  var frame: AnonDuration
  var transition: Transition
}

object AnonFrame {
  @scala.inline
  def apply(frame: AnonDuration, transition: Transition): AnonFrame = {
    val __obj = js.Dynamic.literal(frame = frame.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFrame]
  }
}

