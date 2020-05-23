package typings.meteor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stop extends js.Object {
  def stop(): Unit
}

object Stop {
  @scala.inline
  def apply(stop: () => Unit): Stop = {
    val __obj = js.Dynamic.literal(stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[Stop]
  }
}

