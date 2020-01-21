package typings.pako.mod

import typings.pako.AnonString
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pako", "gzip")
@js.native
object gzip extends js.Object {
  def apply(data: Data): Uint8Array = js.native
  /**
    * The same as deflate, but create gzip wrapper instead of deflate one.
    */
  def apply(data: Data, options: DeflateFunctionOptions with AnonString): String = js.native
}

