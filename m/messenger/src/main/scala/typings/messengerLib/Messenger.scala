package typings
package messengerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Messenger extends js.Object {
  /**
    * Hides all messages.
    */
  def hideAll(): scala.Unit
  /**
    * Posts a message.
    */
  def post(options: MessageOptions): Message
}

