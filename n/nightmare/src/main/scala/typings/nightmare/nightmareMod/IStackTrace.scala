package typings.nightmare.nightmareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStackTrace extends js.Object {
  var file: String
  var function: js.UndefOr[String] = js.undefined
  var line: Double
}

object IStackTrace {
  @scala.inline
  def apply(file: String, line: Double, function: String = null): IStackTrace = {
    val __obj = js.Dynamic.literal(file = file, line = line)
    if (function != null) __obj.updateDynamic("function")(function)
    __obj.asInstanceOf[IStackTrace]
  }
}

