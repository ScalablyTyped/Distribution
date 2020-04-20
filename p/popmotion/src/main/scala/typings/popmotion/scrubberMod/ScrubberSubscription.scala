package typings.popmotion.scrubberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrubberSubscription extends js.Object {
  def seek(progress: Double): js.Any
}

object ScrubberSubscription {
  @scala.inline
  def apply(seek: Double => js.Any): ScrubberSubscription = {
    val __obj = js.Dynamic.literal(seek = js.Any.fromFunction1(seek))
    __obj.asInstanceOf[ScrubberSubscription]
  }
}

