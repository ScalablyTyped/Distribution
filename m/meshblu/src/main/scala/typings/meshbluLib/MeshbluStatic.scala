package typings
package meshbluLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MeshbluStatic extends js.Object {
  /**
  	 * Establish a secure socket.io connection to Meshblu.
  	 * @param opt
  	 * @returns A Meshblu Connection.
  	 */
  def createConnection(opt: meshbluLib.MeshbluNs.ConnectionOptions): meshbluLib.MeshbluNs.Connection
}

