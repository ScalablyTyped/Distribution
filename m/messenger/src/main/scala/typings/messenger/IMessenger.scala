package typings.messenger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMessenger extends js.Object {
  var options: MessengerOptions = js.native
  def apply(): Messenger = js.native
}

