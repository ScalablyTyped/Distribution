package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongodb", "Server")
@js.native
class Server protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(host: java.lang.String, port: scala.Double) = this()
  def this(host: java.lang.String, port: scala.Double, options: ServerOptions) = this()
  def connections(): js.Array[_] = js.native
}

