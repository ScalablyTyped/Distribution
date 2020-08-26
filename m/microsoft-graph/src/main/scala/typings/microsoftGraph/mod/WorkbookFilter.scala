package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkbookFilter extends Entity {
  // The currently applied filter on the given column. Read-only.
  var criteria: js.UndefOr[WorkbookFilterCriteria] = js.native
}

object WorkbookFilter {
  @scala.inline
  def apply(): WorkbookFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookFilter]
  }
  @scala.inline
  implicit class WorkbookFilterOps[Self <: WorkbookFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCriteria(value: WorkbookFilterCriteria): Self = this.set("criteria", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCriteria: Self = this.set("criteria", js.undefined)
  }
  
}

