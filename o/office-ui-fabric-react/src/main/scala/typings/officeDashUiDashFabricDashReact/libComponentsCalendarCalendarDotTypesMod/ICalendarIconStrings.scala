package typings.officeDashUiDashFabricDashReact.libComponentsCalendarCalendarDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICalendarIconStrings extends js.Object {
  /**
    * Close icon
    * @defaultvalue 'CalculatorMultiply'
    */
  var closeIcon: js.UndefOr[String] = js.undefined
  /**
    * FabricMDL2Icons name for the left navigation icon.  Previous default: ChevronLeft.
    * @defaultvalue 'Up'
    */
  var leftNavigation: js.UndefOr[String] = js.undefined
  /**
    * FabricMDL2Icons name for the right navigation icon.  Previous default: ChevronRight.
    * @defaultvalue 'Down'
    */
  var rightNavigation: js.UndefOr[String] = js.undefined
}

object ICalendarIconStrings {
  @scala.inline
  def apply(closeIcon: String = null, leftNavigation: String = null, rightNavigation: String = null): ICalendarIconStrings = {
    val __obj = js.Dynamic.literal()
    if (closeIcon != null) __obj.updateDynamic("closeIcon")(closeIcon.asInstanceOf[js.Any])
    if (leftNavigation != null) __obj.updateDynamic("leftNavigation")(leftNavigation.asInstanceOf[js.Any])
    if (rightNavigation != null) __obj.updateDynamic("rightNavigation")(rightNavigation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICalendarIconStrings]
  }
}

