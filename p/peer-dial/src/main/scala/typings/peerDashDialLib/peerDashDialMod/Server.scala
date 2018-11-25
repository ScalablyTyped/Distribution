package typings
package peerDashDialLib.peerDashDialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("peer-dial", "Server")
@js.native
class Server protected ()
  extends eventsLib.eventsMod.EventEmitter {
  def this(options: ServerOptions) = this()
  def corsOptionsAppsDelegate(
    req: java.lang.String,
    callback: js.Function2[/* err */ js.Any, /* data */ CorsOptions, scala.Unit]
  ): scala.Unit = js.native
  def start(): scala.Unit = js.native
  def stop(): scala.Unit = js.native
}

