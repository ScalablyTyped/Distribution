package typings
package msgpackDashLiteLib.msgpackDashLiteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("msgpack-lite", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val codec: msgpackDashLiteLib.Anon_Preset = js.native
  def createCodec(): msgpackDashLiteLib.msgpackDashLiteMod.Codec = js.native
  def createCodec(options: msgpackDashLiteLib.msgpackDashLiteMod.CodecOptions): msgpackDashLiteLib.msgpackDashLiteMod.Codec = js.native
  def createDecodeStream(): msgpackDashLiteLib.msgpackDashLiteMod.DecodeStream = js.native
  def createDecodeStream(
    options: msgpackDashLiteLib.msgpackDashLiteMod.DecoderOptions with nodeLib.streamMod.internalNs.TransformOptions
  ): msgpackDashLiteLib.msgpackDashLiteMod.DecodeStream = js.native
  def createEncodeStream(): msgpackDashLiteLib.msgpackDashLiteMod.EncodeStream = js.native
  def createEncodeStream(
    options: msgpackDashLiteLib.msgpackDashLiteMod.EncoderOptions with nodeLib.streamMod.internalNs.TransformOptions
  ): msgpackDashLiteLib.msgpackDashLiteMod.EncodeStream = js.native
  def decode(input: js.Array[scala.Double]): js.Any = js.native
  def decode(input: js.Array[scala.Double], options: msgpackDashLiteLib.msgpackDashLiteMod.DecoderOptions): js.Any = js.native
  def decode(input: nodeLib.Buffer): js.Any = js.native
  def decode(input: nodeLib.Buffer, options: msgpackDashLiteLib.msgpackDashLiteMod.DecoderOptions): js.Any = js.native
  def decode(input: stdLib.Uint8Array): js.Any = js.native
  def decode(input: stdLib.Uint8Array, options: msgpackDashLiteLib.msgpackDashLiteMod.DecoderOptions): js.Any = js.native
  def encode(input: js.Any): nodeLib.Buffer = js.native
  def encode(input: js.Any, options: msgpackDashLiteLib.msgpackDashLiteMod.EncoderOptions): nodeLib.Buffer = js.native
}

