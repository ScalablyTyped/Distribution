package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommsOperation extends Entity {
  var clientContext: js.UndefOr[String] = js.undefined
  var resultInfo: js.UndefOr[ResultInfo] = js.undefined
  var status: js.UndefOr[OperationStatus] = js.undefined
}

object CommsOperation {
  @scala.inline
  def apply(
    clientContext: String = null,
    id: String = null,
    resultInfo: ResultInfo = null,
    status: OperationStatus = null
  ): CommsOperation = {
    val __obj = js.Dynamic.literal()
    if (clientContext != null) __obj.updateDynamic("clientContext")(clientContext.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (resultInfo != null) __obj.updateDynamic("resultInfo")(resultInfo.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommsOperation]
  }
}

