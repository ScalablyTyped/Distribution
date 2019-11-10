package typings.next

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_StatusCode extends js.Object {
  var statusCode: js.UndefOr[Double] = js.undefined
}

object Anon_StatusCode {
  @scala.inline
  def apply(statusCode: Int | Double = null): Anon_StatusCode = {
    val __obj = js.Dynamic.literal()
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_StatusCode]
  }
}

