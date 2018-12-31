package typings
package orientjsLib.orientjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * # Server
  * Represents a connection to an orientdb server.
  *
  * @param options The server URL, or configuration object
  */
@JSImport("orientjs", "Server")
@js.native
class Server ()
  extends orientjsLib.orientjsMod.orientjsNs.Server {
  def this(options: orientjsLib.orientjsMod.orientjsNs.ServerConfig) = this()
}

