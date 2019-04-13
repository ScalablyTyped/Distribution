package typings
package nightmareLib.nightmareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStackTrace extends js.Object {
  var file: java.lang.String
  var function: js.UndefOr[java.lang.String] = js.undefined
  var line: scala.Double
}

object IStackTrace {
  @scala.inline
  def apply(file: java.lang.String, line: scala.Double, function: java.lang.String = null): IStackTrace = {
    val __obj = js.Dynamic.literal(file = file, line = line)
    if (function != null) __obj.updateDynamic("function")(function)
    __obj.asInstanceOf[IStackTrace]
  }
}

