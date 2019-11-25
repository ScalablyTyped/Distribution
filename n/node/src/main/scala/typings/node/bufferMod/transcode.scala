package typings.node.bufferMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("buffer", "transcode")
@js.native
object transcode extends js.Object {
  def apply(source: Uint8Array, fromEnc: TranscodeEncoding, toEnc: TranscodeEncoding): typings.node.Buffer = js.native
}

