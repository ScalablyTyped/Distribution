package typings.nodeTimecodes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFramerate extends js.Object {
  var framerate: Double
}

object AnonFramerate {
  @scala.inline
  def apply(framerate: Double): AnonFramerate = {
    val __obj = js.Dynamic.literal(framerate = framerate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFramerate]
  }
}

