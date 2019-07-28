package typings.node.utilMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("util", "TextEncoder")
@js.native
class TextEncoder () extends js.Object {
  val encoding: java.lang.String = js.native
  def encode(): Uint8Array = js.native
  def encode(input: java.lang.String): Uint8Array = js.native
}

