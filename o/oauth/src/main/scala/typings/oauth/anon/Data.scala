package typings.oauth.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var statusCode: Double
}

object Data {
  @scala.inline
  def apply(statusCode: Double, data: js.Any = null): Data = {
    val __obj = js.Dynamic.literal(statusCode = statusCode.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

