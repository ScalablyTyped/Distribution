package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookFunctionResult extends Entity {
  var error: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object WorkbookFunctionResult {
  @scala.inline
  def apply(error: String = null, id: String = null, value: js.Any = null): WorkbookFunctionResult = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (id != null) __obj.updateDynamic("id")(id)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[WorkbookFunctionResult]
  }
}

