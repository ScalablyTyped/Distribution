package typings.pino.pinoMod

import typings.sonicDashBoom.sonicDashBoomMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pino", "destination")
@js.native
object destination extends js.Object {
  /**
    * Create a Pino Destination instance: a stream-like object with significantly more throughput (over 30%) than a standard Node.js stream.
    * @param [fileDescriptor]: File path or numerical file descriptor, by default 1
    * @returns A Sonic-Boom  stream to be used as destination for the pino function
    */
  def apply(): ^ = js.native
  def apply(fileDescriptor: String): ^ = js.native
  def apply(fileDescriptor: Double): ^ = js.native
}

