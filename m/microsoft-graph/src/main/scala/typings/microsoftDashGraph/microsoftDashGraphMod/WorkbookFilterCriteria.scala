package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookFilterCriteria extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var criterion1: js.UndefOr[String] = js.undefined
  var criterion2: js.UndefOr[String] = js.undefined
  var dynamicCriteria: js.UndefOr[String] = js.undefined
  var filterOn: js.UndefOr[String] = js.undefined
  var icon: js.UndefOr[WorkbookIcon] = js.undefined
  var operator: js.UndefOr[String] = js.undefined
  var values: js.UndefOr[js.Any] = js.undefined
}

object WorkbookFilterCriteria {
  @scala.inline
  def apply(
    color: String = null,
    criterion1: String = null,
    criterion2: String = null,
    dynamicCriteria: String = null,
    filterOn: String = null,
    icon: WorkbookIcon = null,
    operator: String = null,
    values: js.Any = null
  ): WorkbookFilterCriteria = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (criterion1 != null) __obj.updateDynamic("criterion1")(criterion1)
    if (criterion2 != null) __obj.updateDynamic("criterion2")(criterion2)
    if (dynamicCriteria != null) __obj.updateDynamic("dynamicCriteria")(dynamicCriteria)
    if (filterOn != null) __obj.updateDynamic("filterOn")(filterOn)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (operator != null) __obj.updateDynamic("operator")(operator)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[WorkbookFilterCriteria]
  }
}

