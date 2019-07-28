package typings.meshblu

import typings.meshblu.MeshbluNs.Connection
import typings.meshblu.MeshbluNs.ConnectionOptions
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

