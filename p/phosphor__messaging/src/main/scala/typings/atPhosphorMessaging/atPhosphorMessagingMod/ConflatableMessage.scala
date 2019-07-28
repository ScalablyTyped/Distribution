package typings.atPhosphorMessaging.atPhosphorMessagingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/messaging", "ConflatableMessage")
@js.native
class ConflatableMessage () extends Message {
  /**
    * Conflate this message with another message of the same `type`.
    *
    * #### Notes
    * This method always returns `true`.
    */
  def conflate(other: ConflatableMessage): Boolean = js.native
}

