package typings.nodemailer

import typings.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConnection extends js.Object {
  var connection: Socket
}

object AnonConnection {
  @scala.inline
  def apply(connection: Socket): AnonConnection = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConnection]
  }
}

