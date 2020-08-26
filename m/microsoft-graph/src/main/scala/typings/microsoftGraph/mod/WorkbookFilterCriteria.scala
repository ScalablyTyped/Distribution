package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkbookFilterCriteria extends js.Object {
  var color: js.UndefOr[String] = js.native
  var criterion1: js.UndefOr[String] = js.native
  var criterion2: js.UndefOr[String] = js.native
  var dynamicCriteria: js.UndefOr[String] = js.native
  var filterOn: js.UndefOr[String] = js.native
  var icon: js.UndefOr[WorkbookIcon] = js.native
  var operator: js.UndefOr[String] = js.native
  var values: js.UndefOr[js.Any] = js.native
}

object WorkbookFilterCriteria {
  @scala.inline
  def apply(): WorkbookFilterCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookFilterCriteria]
  }
  @scala.inline
  implicit class WorkbookFilterCriteriaOps[Self <: WorkbookFilterCriteria] (val x: Self) extends AnyVal {
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setCriterion1(value: String): Self = this.set("criterion1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCriterion1: Self = this.set("criterion1", js.undefined)
    @scala.inline
    def setCriterion2(value: String): Self = this.set("criterion2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCriterion2: Self = this.set("criterion2", js.undefined)
    @scala.inline
    def setDynamicCriteria(value: String): Self = this.set("dynamicCriteria", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDynamicCriteria: Self = this.set("dynamicCriteria", js.undefined)
    @scala.inline
    def setFilterOn(value: String): Self = this.set("filterOn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterOn: Self = this.set("filterOn", js.undefined)
    @scala.inline
    def setIcon(value: WorkbookIcon): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setOperator(value: String): Self = this.set("operator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperator: Self = this.set("operator", js.undefined)
    @scala.inline
    def setValues(value: js.Any): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
  
}

