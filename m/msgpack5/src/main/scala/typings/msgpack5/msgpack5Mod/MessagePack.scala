package typings.msgpack5.msgpack5Mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessagePack extends js.Object {
  def decode(buf: typings.bl.blMod.^): js.Any = js.native
  def decode(buf: Buffer): js.Any = js.native
  def decoder(): Decoder = js.native
  def decoder(opts: EncodeDecodeOptions): Decoder = js.native
  def encode(obj: js.Any): typings.bl.blMod.^ = js.native
  def encoder(): Encoder = js.native
  def encoder(opts: EncodeDecodeOptions): Encoder = js.native
  def register[T](
    `type`: Double,
    $constructor: js.Any,
    encode: js.Function1[/* obj */ T, Buffer],
    decode: js.Function1[/* data */ Buffer, T]
  ): MessagePack = js.native
  def registerDecoder(`type`: Double, decode: js.Function1[/* data */ Buffer, _]): MessagePack = js.native
  def registerEncoder[T](check: js.Function1[/* obj */ T, Boolean], encode: js.Function1[/* obj */ T, Buffer]): MessagePack = js.native
}

