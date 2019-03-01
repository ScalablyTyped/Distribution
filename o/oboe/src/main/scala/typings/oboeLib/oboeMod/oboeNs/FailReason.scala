package typings
package oboeLib.oboeMod.oboeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FailReason extends js.Object {
  var body: js.UndefOr[java.lang.String] = js.undefined
  var jsonBody: js.UndefOr[js.Object] = js.undefined
  var statusCode: js.UndefOr[scala.Double] = js.undefined
  var thrown: js.UndefOr[nodeLib.Error] = js.undefined
}

object FailReason {
  @scala.inline
  def apply(
    body: java.lang.String = null,
    jsonBody: js.Object = null,
    statusCode: scala.Int | scala.Double = null,
    thrown: nodeLib.Error = null
  ): FailReason = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    if (jsonBody != null) __obj.updateDynamic("jsonBody")(jsonBody)
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    if (thrown != null) __obj.updateDynamic("thrown")(thrown)
    __obj.asInstanceOf[FailReason]
  }
}

