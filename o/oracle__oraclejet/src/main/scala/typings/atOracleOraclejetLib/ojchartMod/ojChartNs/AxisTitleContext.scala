package typings
package atOracleOraclejetLib.ojchartMod.ojChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait AxisTitleContext extends js.Object {
  var axis: atOracleOraclejetLib.atOracleOraclejetLibStrings.xAxis | atOracleOraclejetLib.atOracleOraclejetLibStrings.yAxis | atOracleOraclejetLib.atOracleOraclejetLibStrings.y2Axis
  var subId: java.lang.String
}

object AxisTitleContext {
  @scala.inline
  def apply(
    axis: atOracleOraclejetLib.atOracleOraclejetLibStrings.xAxis | atOracleOraclejetLib.atOracleOraclejetLibStrings.yAxis | atOracleOraclejetLib.atOracleOraclejetLibStrings.y2Axis,
    subId: java.lang.String
  ): AxisTitleContext = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], subId = subId)
  
    __obj.asInstanceOf[AxisTitleContext]
  }
}

