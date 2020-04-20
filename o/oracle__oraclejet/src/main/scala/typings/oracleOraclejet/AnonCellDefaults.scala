package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCellDefaults extends js.Object {
  var animationDuration: Double
  var cellDefaults: AnonLabelHalign
  var columnLabelStyle: js.Object
  var columnsTitleStyle: js.Object
  var hoverBehaviorDelay: Double
  var nodeDefaults: AnonIconDefaults
  var rowLabelStyle: js.Object
  var rowsTitleStyle: js.Object
}

object AnonCellDefaults {
  @scala.inline
  def apply(
    animationDuration: Double,
    cellDefaults: AnonLabelHalign,
    columnLabelStyle: js.Object,
    columnsTitleStyle: js.Object,
    hoverBehaviorDelay: Double,
    nodeDefaults: AnonIconDefaults,
    rowLabelStyle: js.Object,
    rowsTitleStyle: js.Object
  ): AnonCellDefaults = {
    val __obj = js.Dynamic.literal(animationDuration = animationDuration.asInstanceOf[js.Any], cellDefaults = cellDefaults.asInstanceOf[js.Any], columnLabelStyle = columnLabelStyle.asInstanceOf[js.Any], columnsTitleStyle = columnsTitleStyle.asInstanceOf[js.Any], hoverBehaviorDelay = hoverBehaviorDelay.asInstanceOf[js.Any], nodeDefaults = nodeDefaults.asInstanceOf[js.Any], rowLabelStyle = rowLabelStyle.asInstanceOf[js.Any], rowsTitleStyle = rowsTitleStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCellDefaults]
  }
}

