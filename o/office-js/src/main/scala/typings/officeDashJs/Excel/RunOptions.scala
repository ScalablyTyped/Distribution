package typings.officeDashJs.Excel

import typings.officeDashJs.OfficeExtension.ClientObject
import typings.officeDashJs.OfficeExtension.ClientRequestContext
import typings.officeDashJs.OfficeExtension.RequestUrlAndHeaderInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunOptions
  extends typings.officeDashJs.OfficeExtension.RunOptions[Session] {
  /**
    * Determines whether Excel will delay the batch request until the user exits cell edit mode.
    *
    * When false, if the user is in cell edit when the batch request is processed by the host, the batch will automatically fail.
    * When true, the batch request will be executed immediately if the user is not in cell edit mode, but if the user is in cell edit mode the batch request will be delayed until the user exits cell edit mode.
    */
  var delayForCellEdit: js.UndefOr[Boolean] = js.undefined
}

object RunOptions {
  @scala.inline
  def apply(
    delayForCellEdit: js.UndefOr[Boolean] = js.undefined,
    previousObjects: ClientObject | js.Array[ClientObject] | ClientRequestContext = null,
    session: RequestUrlAndHeaderInfo | Session = null
  ): RunOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(delayForCellEdit)) __obj.updateDynamic("delayForCellEdit")(delayForCellEdit.asInstanceOf[js.Any])
    if (previousObjects != null) __obj.updateDynamic("previousObjects")(previousObjects.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunOptions]
  }
}

