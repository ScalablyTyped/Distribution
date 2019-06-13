package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookSessionInfo extends js.Object {
  /** Id of the workbook session. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** true for persistent session. false for non-persistent session (view mode) */
  var persistChanges: js.UndefOr[scala.Boolean] = js.undefined
}

object WorkbookSessionInfo {
  @scala.inline
  def apply(id: java.lang.String = null, persistChanges: js.UndefOr[scala.Boolean] = js.undefined): WorkbookSessionInfo = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(persistChanges)) __obj.updateDynamic("persistChanges")(persistChanges)
    __obj.asInstanceOf[WorkbookSessionInfo]
  }
}

