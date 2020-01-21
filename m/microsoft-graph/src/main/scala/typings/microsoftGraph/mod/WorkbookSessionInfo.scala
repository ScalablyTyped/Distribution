package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookSessionInfo extends js.Object {
  // Id of the workbook session.
  var id: js.UndefOr[String] = js.undefined
  // true for persistent session. false for non-persistent session (view mode)
  var persistChanges: js.UndefOr[Boolean] = js.undefined
}

object WorkbookSessionInfo {
  @scala.inline
  def apply(id: String = null, persistChanges: js.UndefOr[Boolean] = js.undefined): WorkbookSessionInfo = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(persistChanges)) __obj.updateDynamic("persistChanges")(persistChanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkbookSessionInfo]
  }
}

