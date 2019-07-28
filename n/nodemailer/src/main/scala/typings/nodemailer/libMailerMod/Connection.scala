package typings.nodemailer.libMailerMod

import typings.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Connection extends js.Object {
  var connection: Socket
}

object Connection {
  @scala.inline
  def apply(connection: Socket): Connection = {
    val __obj = js.Dynamic.literal(connection = connection)
  
    __obj.asInstanceOf[Connection]
  }
}

