package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnimationDurationCellDefaults extends js.Object {
  var animationDuration: scala.Double
  var cellDefaults: Anon_AutoCenterEnd
  var columnLabelStyle: js.Object
  var columnsTitleStyle: js.Object
  var hoverBehaviorDelay: scala.Double
  var nodeDefaults: Anon_BorderColorBorderWidth
  var rowLabelStyle: js.Object
  var rowsTitleStyle: js.Object
}

object Anon_AnimationDurationCellDefaults {
  @scala.inline
  def apply(
    animationDuration: scala.Double,
    cellDefaults: Anon_AutoCenterEnd,
    columnLabelStyle: js.Object,
    columnsTitleStyle: js.Object,
    hoverBehaviorDelay: scala.Double,
    nodeDefaults: Anon_BorderColorBorderWidth,
    rowLabelStyle: js.Object,
    rowsTitleStyle: js.Object
  ): Anon_AnimationDurationCellDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("animationDuration")(animationDuration)
    __obj.updateDynamic("cellDefaults")(cellDefaults)
    __obj.updateDynamic("columnLabelStyle")(columnLabelStyle)
    __obj.updateDynamic("columnsTitleStyle")(columnsTitleStyle)
    __obj.updateDynamic("hoverBehaviorDelay")(hoverBehaviorDelay)
    __obj.updateDynamic("nodeDefaults")(nodeDefaults)
    __obj.updateDynamic("rowLabelStyle")(rowLabelStyle)
    __obj.updateDynamic("rowsTitleStyle")(rowsTitleStyle)
    __obj.asInstanceOf[Anon_AnimationDurationCellDefaults]
  }
}

