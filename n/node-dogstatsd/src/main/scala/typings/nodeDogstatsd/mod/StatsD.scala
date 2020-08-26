package typings.nodeDogstatsd.mod

import typings.node.dgramMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-dogstatsd", "StatsD")
@js.native
class StatsD protected () extends StatsDClient {
  def this(host: String) = this()
  def this(host: String, port: Double) = this()
  def this(host: String, port: js.UndefOr[scala.Nothing], socket: Socket) = this()
  def this(host: String, port: Double, socket: Socket) = this()
  def this(
    host: String,
    port: js.UndefOr[scala.Nothing],
    socket: js.UndefOr[scala.Nothing],
    options: StatsDOptions
  ) = this()
  def this(host: String, port: js.UndefOr[scala.Nothing], socket: Socket, options: StatsDOptions) = this()
  def this(host: String, port: Double, socket: js.UndefOr[scala.Nothing], options: StatsDOptions) = this()
  def this(host: String, port: Double, socket: Socket, options: StatsDOptions) = this()
  var socket: Socket = js.native
  def close(): Unit = js.native
}

