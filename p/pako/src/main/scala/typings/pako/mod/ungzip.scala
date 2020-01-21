package typings.pako.mod

import typings.pako.AnonString
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
  def apply(data: Data, options: InflateFunctionOptions with AnonString): String = js.native
}

