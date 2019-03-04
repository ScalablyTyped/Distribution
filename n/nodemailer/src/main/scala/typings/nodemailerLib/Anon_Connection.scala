package typings
package nodemailerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Connection extends js.Object {
  var connection: nodeLib.netMod.Socket
}

object Anon_Connection {
  @scala.inline
  def apply(connection: nodeLib.netMod.Socket): Anon_Connection = {
    val __obj = js.Dynamic.literal(connection = connection)
  
    __obj.asInstanceOf[Anon_Connection]
  }
}

