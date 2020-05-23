package typings.pako.mod

import typings.pako.anon.InflateFunctionOptionstos
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pako", "ungzip")
@js.native
object ungzip extends js.Object {
  def apply(data: Data): Uint8Array = js.native
  /**
    * Just shortcut to inflate, because it autodetects format by header.content. Done for convenience.
    */
  def apply(data: Data, options: InflateFunctionOptionstos): String = js.native
  def apply(data: Data, options: InflateFunctionOptions): Uint8Array = js.native
}

