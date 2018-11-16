package typings
package msgpackDashLiteLib.msgpackDashLiteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("msgpack-lite", JSImport.Namespace)
@js.native
object msgpackDashLiteModMembers extends js.Object {
  val codec: msgpackDashLiteLib.Anon_Preset = js.native
  def createCodec(): Codec = js.native
  def createCodec(options: CodecOptions): Codec = js.native
  def createDecodeStream(): DecodeStream = js.native
  def createDecodeStream(options: DecoderOptions with nodeLib.streamMod.internalNs.TransformOptions): DecodeStream = js.native
  def createEncodeStream(): EncodeStream = js.native
  def createEncodeStream(options: EncoderOptions with nodeLib.streamMod.internalNs.TransformOptions): EncodeStream = js.native
  def decode(input: js.Array[scala.Double]): js.Any = js.native
  def decode(input: js.Array[scala.Double], options: DecoderOptions): js.Any = js.native
  def decode(input: nodeLib.Buffer): js.Any = js.native
  def decode(input: nodeLib.Buffer, options: DecoderOptions): js.Any = js.native
  def decode(input: stdLib.Uint8Array): js.Any = js.native
  def decode(input: stdLib.Uint8Array, options: DecoderOptions): js.Any = js.native
  def encode(input: js.Any): nodeLib.Buffer = js.native
  def encode(input: js.Any, options: EncoderOptions): nodeLib.Buffer = js.native
}

