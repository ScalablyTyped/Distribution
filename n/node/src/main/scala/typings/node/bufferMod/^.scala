package typings.node.bufferMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("buffer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val INSPECT_MAX_BYTES: Double = js.native
  val kMaxLength: Double = js.native
  val kStringMaxLength: Double = js.native
  def transcode(source: Uint8Array, fromEnc: TranscodeEncoding, toEnc: TranscodeEncoding): typings.node.Buffer = js.native
}

