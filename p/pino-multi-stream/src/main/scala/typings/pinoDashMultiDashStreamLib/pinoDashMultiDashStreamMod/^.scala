package typings
package pinoDashMultiDashStreamLib.pinoDashMultiDashStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pino-multi-stream", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(options: LoggerOptions): Logger = js.native
  def multistream(streams: Streams): nodeLib.streamMod.Writable = js.native
}

