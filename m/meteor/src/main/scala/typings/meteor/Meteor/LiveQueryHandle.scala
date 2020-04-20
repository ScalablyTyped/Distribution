package typings.meteor.Meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveQueryHandle extends js.Object {
  def stop(): Unit
}

object LiveQueryHandle {
  @scala.inline
  def apply(stop: () => Unit): LiveQueryHandle = {
    val __obj = js.Dynamic.literal(stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[LiveQueryHandle]
  }
}

