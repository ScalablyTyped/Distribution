package typings.pako.mod

import typings.pako.anon.InflateFunctionOptionstos
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pako", "inflateRaw")
@js.native
object inflateRaw extends js.Object {
  
  def apply(data: Data): Uint8Array = js.native
  /**
    * The same as inflate, but creates raw data, without wrapper (header and adler32 crc).
    */
  def apply(data: Data, options: InflateFunctionOptionstos): String = js.native
  def apply(data: Data, options: InflateFunctionOptions): Uint8Array = js.native
}
