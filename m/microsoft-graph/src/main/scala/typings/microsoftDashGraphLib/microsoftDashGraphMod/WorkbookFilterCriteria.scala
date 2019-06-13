package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookFilterCriteria extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var criterion1: js.UndefOr[java.lang.String] = js.undefined
  var criterion2: js.UndefOr[java.lang.String] = js.undefined
  var dynamicCriteria: js.UndefOr[java.lang.String] = js.undefined
  var filterOn: js.UndefOr[java.lang.String] = js.undefined
  var icon: js.UndefOr[WorkbookIcon] = js.undefined
  var operator: js.UndefOr[java.lang.String] = js.undefined
  var values: js.UndefOr[js.Any] = js.undefined
}

object WorkbookFilterCriteria {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    criterion1: java.lang.String = null,
    criterion2: java.lang.String = null,
    dynamicCriteria: java.lang.String = null,
    filterOn: java.lang.String = null,
    icon: WorkbookIcon = null,
    operator: java.lang.String = null,
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

