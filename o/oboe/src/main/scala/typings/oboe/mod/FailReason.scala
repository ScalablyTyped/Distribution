package typings.oboe.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FailReason extends js.Object {
  var body: js.UndefOr[String] = js.undefined
  var jsonBody: js.UndefOr[js.Object] = js.undefined
  var statusCode: js.UndefOr[Double] = js.undefined
  var thrown: js.UndefOr[Error] = js.undefined
}

object FailReason {
  @scala.inline
  def apply(
    body: String = null,
    jsonBody: js.Object = null,
    statusCode: js.UndefOr[Double] = js.undefined,
    thrown: Error = null
  ): FailReason = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (jsonBody != null) __obj.updateDynamic("jsonBody")(jsonBody.asInstanceOf[js.Any])
    if (!js.isUndefined(statusCode)) __obj.updateDynamic("statusCode")(statusCode.get.asInstanceOf[js.Any])
    if (thrown != null) __obj.updateDynamic("thrown")(thrown.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailReason]
  }
}

