package typings
package nodeLib.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("http", "Agent")
@js.native
class Agent () extends js.Object {
  def this(opts: AgentOptions) = this()
  var maxFreeSockets: scala.Double = js.native
  var maxSockets: scala.Double = js.native
  val requests: org.scalablytyped.runtime.StringDictionary[js.Array[IncomingMessage]] = js.native
  val sockets: org.scalablytyped.runtime.StringDictionary[js.Array[nodeLib.netMod.Socket]] = js.native
  /**
    * Destroy any sockets that are currently in use by the agent.
    * It is usually not necessary to do this. However, if you are using an agent with KeepAlive enabled,
    * then it is best to explicitly shut down the agent when you know that it will no longer be used. Otherwise,
    * sockets may hang open for quite a long time before the server terminates them.
    */
  def destroy(): scala.Unit = js.native
}

