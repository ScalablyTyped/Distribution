package typings
package memjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Flags extends js.Object {
  var flags: nodeLib.Buffer
  var value: nodeLib.Buffer
}

object Anon_Flags {
  @scala.inline
  def apply(flags: nodeLib.Buffer, value: nodeLib.Buffer): Anon_Flags = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("flags")(flags)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_Flags]
  }
}

