package typings
package microLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OriginalError extends js.Object {
  var originalError: js.UndefOr[stdLib.Error] = js.undefined
  var statusCode: scala.Double
}

object Anon_OriginalError {
  @scala.inline
  def apply(statusCode: scala.Double, originalError: stdLib.Error = null): Anon_OriginalError = {
    val __obj = js.Dynamic.literal(statusCode = statusCode)
    if (originalError != null) __obj.updateDynamic("originalError")(originalError)
    __obj.asInstanceOf[Anon_OriginalError]
  }
}

