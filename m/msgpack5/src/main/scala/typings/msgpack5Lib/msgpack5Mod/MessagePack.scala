package typings
package msgpack5Lib.msgpack5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessagePack extends js.Object {
  def decode(buf: blLib.blMod.^): js.Any = js.native
  def decode(buf: nodeLib.Buffer): js.Any = js.native
  def decoder(): Decoder = js.native
  def decoder(opts: EncodeDecodeOptions): Decoder = js.native
  def encode(obj: js.Any): blLib.blMod.^ = js.native
  def encoder(): Encoder = js.native
  def encoder(opts: EncodeDecodeOptions): Encoder = js.native
  def register[T](
    `type`: scala.Double,
    $constructor: js.Any,
    encode: js.Function1[/* obj */ T, nodeLib.Buffer],
    decode: js.Function1[/* data */ nodeLib.Buffer, T]
  ): MessagePack = js.native
  def registerDecoder(`type`: scala.Double, decode: js.Function1[/* data */ nodeLib.Buffer, _]): MessagePack = js.native
  def registerEncoder[T](check: js.Function1[/* obj */ T, scala.Boolean], encode: js.Function1[/* obj */ T, nodeLib.Buffer]): MessagePack = js.native
}

