package typings.pako.pakoMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pako", "gzip")
@js.native
object gzip extends js.Object {
  def apply(data: Data): Uint8Array = js.native
  def apply(data: Data, options: DeflateFunctionOptions): Uint8Array = js.native
}

