package typings.microsoftGraph.mod

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
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (criterion1 != null) __obj.updateDynamic("criterion1")(criterion1.asInstanceOf[js.Any])
    if (criterion2 != null) __obj.updateDynamic("criterion2")(criterion2.asInstanceOf[js.Any])
    if (dynamicCriteria != null) __obj.updateDynamic("dynamicCriteria")(dynamicCriteria.asInstanceOf[js.Any])
    if (filterOn != null) __obj.updateDynamic("filterOn")(filterOn.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkbookFilterCriteria]
  }
}

