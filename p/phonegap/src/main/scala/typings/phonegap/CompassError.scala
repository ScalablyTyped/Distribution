package typings.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompassError extends js.Object {
  var code: Double
}

object CompassError {
  @scala.inline
  def apply(code: Double): CompassError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompassError]
  }
}

