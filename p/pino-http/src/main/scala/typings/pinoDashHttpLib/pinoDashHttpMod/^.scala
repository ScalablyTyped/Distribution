package typings
package pinoDashHttpLib.pinoDashHttpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pino-http", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): HttpLogger = js.native
  def apply(opts: Options): HttpLogger = js.native
  def apply(opts: Options, stream: pinoLib.pinoMod.DestinationStream): HttpLogger = js.native
  def apply(stream: pinoLib.pinoMod.DestinationStream): HttpLogger = js.native
}

