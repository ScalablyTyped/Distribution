package typings
package nodeLib.bufferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("buffer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Buffer: nodeLib.Anon_Alloc = js.native
  val INSPECT_MAX_BYTES: scala.Double = js.native
  val SlowBuffer: nodeLib.Anon_Size = js.native
  def transcode(
    source: nodeLib.Buffer,
    fromEnc: nodeLib.bufferMod.TranscodeEncoding,
    toEnc: nodeLib.bufferMod.TranscodeEncoding
  ): nodeLib.Buffer = js.native
  def transcode(
    source: stdLib.Uint8Array,
    fromEnc: nodeLib.bufferMod.TranscodeEncoding,
    toEnc: nodeLib.bufferMod.TranscodeEncoding
  ): nodeLib.Buffer = js.native
}

