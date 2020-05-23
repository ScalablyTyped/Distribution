package typings.meshblu

import typings.meshblu.Meshblu.Connection
import typings.meshblu.Meshblu.ConnectionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeshbluStatic extends js.Object {
  /**
    * Establish a secure socket.io connection to Meshblu.
    * @param opt
    * @returns A Meshblu Connection.
    */
  def createConnection(opt: ConnectionOptions): Connection
}

object MeshbluStatic {
  @scala.inline
  def apply(createConnection: ConnectionOptions => Connection): MeshbluStatic = {
    val __obj = js.Dynamic.literal(createConnection = js.Any.fromFunction1(createConnection))
    __obj.asInstanceOf[MeshbluStatic]
  }
}

