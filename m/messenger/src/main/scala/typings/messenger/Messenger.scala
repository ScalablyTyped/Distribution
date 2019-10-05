package typings.messenger

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Messenger extends js.Object {
  /**
    * Hides all messages.
    */
  def hideAll(): Unit
  /**
    * Posts a message.
    */
  def post(options: MessageOptions): Message
}

@JSGlobal("Messenger")
@js.native
object Messenger extends TopLevel[IMessenger]

