package typings
package nedbLib.nedbMod.NedbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CursorCount extends js.Object {
  def exec(callback: js.Function2[/* err */ nodeLib.Error, /* count */ scala.Double, scala.Unit]): scala.Unit
}

object CursorCount {
  @scala.inline
  def apply(
    exec: js.Function1[
      js.Function2[/* err */ nodeLib.Error, /* count */ scala.Double, scala.Unit], 
      scala.Unit
    ]
  ): CursorCount = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("exec")(exec)
    __obj.asInstanceOf[CursorCount]
  }
}

