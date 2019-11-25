package typings.msDashRestDashAzure.msDashRestDashAzureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudErrorParameters extends js.Object {
  var code: String
  var details: js.UndefOr[js.Array[CloudError]] = js.undefined
  var message: String
  var target: js.UndefOr[String] = js.undefined
}

object CloudErrorParameters {
  @scala.inline
  def apply(code: String, message: String, details: js.Array[CloudError] = null, target: String = null): CloudErrorParameters = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudErrorParameters]
  }
}

