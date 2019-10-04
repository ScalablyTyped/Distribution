package typings.atPollyjsCore.atPollyjsCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListenerEvent extends js.Object {
  val `type`: String
  def stopPropagation(): Unit
}

object ListenerEvent {
  @scala.inline
  def apply(stopPropagation: () => Unit, `type`: String): ListenerEvent = {
    val __obj = js.Dynamic.literal(stopPropagation = js.Any.fromFunction0(stopPropagation))
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ListenerEvent]
  }
}

