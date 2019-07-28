package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookFilter extends Entity {
  // The currently applied filter on the given column. Read-only.
  var criteria: js.UndefOr[WorkbookFilterCriteria] = js.undefined
}

object WorkbookFilter {
  @scala.inline
  def apply(criteria: WorkbookFilterCriteria = null, id: String = null): WorkbookFilter = {
    val __obj = js.Dynamic.literal()
    if (criteria != null) __obj.updateDynamic("criteria")(criteria)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[WorkbookFilter]
  }
}

