package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellDefaults extends js.Object {
  var animationDuration: Double
  var cellDefaults: LabelHalign
  var columnLabelStyle: js.Object
  var columnsTitleStyle: js.Object
  var hoverBehaviorDelay: Double
  var nodeDefaults: IconDefaults
  var rowLabelStyle: js.Object
  var rowsTitleStyle: js.Object
}

object CellDefaults {
  @scala.inline
  def apply(
    animationDuration: Double,
    cellDefaults: LabelHalign,
    columnLabelStyle: js.Object,
    columnsTitleStyle: js.Object,
    hoverBehaviorDelay: Double,
    nodeDefaults: IconDefaults,
    rowLabelStyle: js.Object,
    rowsTitleStyle: js.Object
  ): CellDefaults = {
    val __obj = js.Dynamic.literal(animationDuration = animationDuration.asInstanceOf[js.Any], cellDefaults = cellDefaults.asInstanceOf[js.Any], columnLabelStyle = columnLabelStyle.asInstanceOf[js.Any], columnsTitleStyle = columnsTitleStyle.asInstanceOf[js.Any], hoverBehaviorDelay = hoverBehaviorDelay.asInstanceOf[js.Any], nodeDefaults = nodeDefaults.asInstanceOf[js.Any], rowLabelStyle = rowLabelStyle.asInstanceOf[js.Any], rowsTitleStyle = rowsTitleStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellDefaults]
  }
}

