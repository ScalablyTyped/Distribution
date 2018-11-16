package typings
package nodeLib.utilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("util", "TextEncoder")
@js.native
class TextEncoder () extends js.Object {
  val encoding: java.lang.String = js.native
  def encode(): stdLib.Uint8Array = js.native
  def encode(input: java.lang.String): stdLib.Uint8Array = js.native
}

