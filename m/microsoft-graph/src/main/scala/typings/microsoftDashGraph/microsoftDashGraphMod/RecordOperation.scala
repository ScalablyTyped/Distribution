package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecordOperation extends CommsOperation {
  var recordingAccessToken: js.UndefOr[String] = js.undefined
  var recordingLocation: js.UndefOr[String] = js.undefined
}

object RecordOperation {
  @scala.inline
  def apply(
    clientContext: String = null,
    id: String = null,
    recordingAccessToken: String = null,
    recordingLocation: String = null,
    resultInfo: ResultInfo = null,
    status: OperationStatus = null
  ): RecordOperation = {
    val __obj = js.Dynamic.literal()
    if (clientContext != null) __obj.updateDynamic("clientContext")(clientContext.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (recordingAccessToken != null) __obj.updateDynamic("recordingAccessToken")(recordingAccessToken.asInstanceOf[js.Any])
    if (recordingLocation != null) __obj.updateDynamic("recordingLocation")(recordingLocation.asInstanceOf[js.Any])
    if (resultInfo != null) __obj.updateDynamic("resultInfo")(resultInfo.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordOperation]
  }
}

