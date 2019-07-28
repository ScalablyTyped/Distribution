package typings.nodemailer

import typings.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Connection extends js.Object {
  var connection: Socket
}

object Anon_Connection {
  @scala.inline
  def apply(connection: Socket): Anon_Connection = {
    val __obj = js.Dynamic.literal(connection = connection)
  
    __obj.asInstanceOf[Anon_Connection]
  }
}

