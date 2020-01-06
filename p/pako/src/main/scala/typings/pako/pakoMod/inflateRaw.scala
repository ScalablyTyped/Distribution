package typings.pako.pakoMod

import typings.pako.Anon_String
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pako", "inflateRaw")
@js.native
object inflateRaw extends js.Object {
  def apply(data: Data): Uint8Array = js.native
  /**
    * The same as inflate, but creates raw data, without wrapper (header and adler32 crc).
    */
  def apply(data: Data, options: InflateFunctionOptions with Anon_String): String = js.native
}

