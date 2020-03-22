package typings.pako.mod

import typings.pako.DeflateFunctionOptionstos
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pako", "deflate")
@js.native
object deflate extends js.Object {
  def apply(data: Data): Uint8Array = js.native
  /**
    * Compress data with deflate algorithm and options.
    */
  def apply(data: Data, options: DeflateFunctionOptionstos): String = js.native
  def apply(data: Data, options: DeflateFunctionOptions): Uint8Array = js.native
}

