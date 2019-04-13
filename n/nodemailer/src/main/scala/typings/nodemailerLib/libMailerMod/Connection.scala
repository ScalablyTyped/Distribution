package typings
package nodemailerLib.libMailerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Connection extends js.Object {
  var connection: nodeLib.netMod.Socket
}

object Connection {
  @scala.inline
  def apply(connection: nodeLib.netMod.Socket): Connection = {
    val __obj = js.Dynamic.literal(connection = connection)
  
    __obj.asInstanceOf[Connection]
  }
}

