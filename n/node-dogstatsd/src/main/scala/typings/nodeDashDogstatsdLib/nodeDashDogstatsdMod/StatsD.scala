package typings
package nodeDashDogstatsdLib.nodeDashDogstatsdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-dogstatsd", "StatsD")
@js.native
class StatsD protected () extends StatsDClient {
  def this(host: java.lang.String) = this()
  def this(host: java.lang.String, port: scala.Double) = this()
  def this(host: java.lang.String, port: scala.Double, socket: nodeLib.dgramMod.Socket) = this()
  def this(host: java.lang.String, port: scala.Double, socket: nodeLib.dgramMod.Socket, options: StatsDOptions) = this()
  var socket: nodeLib.dgramMod.Socket = js.native
  def close(): scala.Unit = js.native
}

