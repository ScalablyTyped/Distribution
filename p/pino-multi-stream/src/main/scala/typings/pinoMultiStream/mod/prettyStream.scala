package typings.pinoMultiStream.mod

import typings.pino.mod.DestinationStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pino-multi-stream", "prettyStream")
@js.native
object prettyStream extends js.Object {
  def apply(): DestinationStream = js.native
  def apply(opts: PrettyStreamOptions): DestinationStream = js.native
}

