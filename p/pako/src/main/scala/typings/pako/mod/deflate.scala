package typings.pako.mod

import typings.pako.AnonString
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
  def apply(data: Data, options: DeflateFunctionOptions with AnonString): String = js.native
}

