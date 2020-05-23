package typings.plotlyJs.anon

import typings.plotlyJs.mod.Transition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Frame extends js.Object {
  var frame: Duration
  var transition: Transition
}

object Frame {
  @scala.inline
  def apply(frame: Duration, transition: Transition): Frame = {
    val __obj = js.Dynamic.literal(frame = frame.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frame]
  }
}

