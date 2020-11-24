package typings.pinoMultiStream.mod

import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pino-multi-stream", "multistream")
@js.native
object multistream extends js.Object {
  
  def apply(streams: Streams): Writable = js.native
  def apply(streams: Streams, opts: MultiStreamOptions): Writable = js.native
}
