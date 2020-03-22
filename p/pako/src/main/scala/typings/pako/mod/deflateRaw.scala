package typings.pako.mod

import typings.pako.DeflateFunctionOptionstos
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pako", "deflateRaw")
@js.native
object deflateRaw extends js.Object {
  def apply(data: Data): Uint8Array = js.native
  /**
    * The same as deflate, but creates raw data, without wrapper (header and adler32 crc).
    */
  def apply(data: Data, options: DeflateFunctionOptionstos): String = js.native
  def apply(data: Data, options: DeflateFunctionOptions): Uint8Array = js.native
}

