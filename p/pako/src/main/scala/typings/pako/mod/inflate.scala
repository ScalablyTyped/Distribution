package typings.pako.mod

import typings.pako.anon.InflateFunctionOptionstos
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pako", "inflate")
@js.native
object inflate extends js.Object {
  def apply(data: Data): Uint8Array = js.native
  /**
    * Decompress data with inflate/ungzip and options. Autodetect format via wrapper header
    * by default. That's why we don't provide separate ungzip method.
    */
  def apply(data: Data, options: InflateFunctionOptionstos): String = js.native
  def apply(data: Data, options: InflateFunctionOptions): Uint8Array = js.native
}

