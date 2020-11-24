package typings.msgpackLite.mod

import typings.node.Buffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("msgpack-lite", "decode")
@js.native
object decode extends js.Object {
  
  def apply(input: js.Array[Double]): js.Any = js.native
  def apply(input: js.Array[Double], options: DecoderOptions): js.Any = js.native
  def apply(input: Buffer): js.Any = js.native
  def apply(input: Buffer, options: DecoderOptions): js.Any = js.native
  def apply(input: Uint8Array): js.Any = js.native
  def apply(input: Uint8Array, options: DecoderOptions): js.Any = js.native
}
