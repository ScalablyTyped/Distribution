package typings.msgpackDashLite.msgpackDashLiteMod

import typings.node.Buffer
import typings.node.streamMod.TransformOptions
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("msgpack-lite", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createCodec(): Codec = js.native
  def createCodec(options: CodecOptions): Codec = js.native
  def createDecodeStream(): DecodeStream = js.native
  def createDecodeStream(options: DecoderOptions with TransformOptions): DecodeStream = js.native
  def createEncodeStream(): EncodeStream = js.native
  def createEncodeStream(options: EncoderOptions with TransformOptions): EncodeStream = js.native
  def decode(input: js.Array[Double]): js.Any = js.native
  def decode(input: js.Array[Double], options: DecoderOptions): js.Any = js.native
  def decode(input: Buffer): js.Any = js.native
  def decode(input: Buffer, options: DecoderOptions): js.Any = js.native
  def decode(input: Uint8Array): js.Any = js.native
  def decode(input: Uint8Array, options: DecoderOptions): js.Any = js.native
  def encode(input: js.Any): Buffer = js.native
  def encode(input: js.Any, options: EncoderOptions): Buffer = js.native
}

