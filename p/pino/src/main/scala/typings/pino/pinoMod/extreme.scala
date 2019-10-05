package typings.pino.pinoMod

import typings.sonicDashBoom.sonicDashBoomMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pino", "extreme")
@js.native
object extreme extends js.Object {
  /**
    * Create an extreme mode destination. This yields an additional 60% performance boost.
    * There are trade-offs that should be understood before usage.
    * @param [fileDescriptor]: File path or numerical file descriptor, by default 1
    * @returns A Sonic-Boom  stream to be used as destination for the pino function
    */
  def apply(): ^ = js.native
  def apply(fileDescriptor: String): ^ = js.native
  def apply(fileDescriptor: Double): ^ = js.native
}

