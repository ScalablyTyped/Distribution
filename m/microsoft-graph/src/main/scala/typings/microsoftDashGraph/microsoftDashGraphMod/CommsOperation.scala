package typings.microsoftDashGraph.microsoftDashGraphMod

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
    if (clientContext != null) __obj.updateDynamic("clientContext")(clientContext)
    if (id != null) __obj.updateDynamic("id")(id)
    if (resultInfo != null) __obj.updateDynamic("resultInfo")(resultInfo)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[CommsOperation]
  }
}

