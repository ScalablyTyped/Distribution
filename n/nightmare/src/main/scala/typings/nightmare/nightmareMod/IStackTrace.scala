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
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    if (function != null) __obj.updateDynamic("function")(function.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStackTrace]
  }
}

