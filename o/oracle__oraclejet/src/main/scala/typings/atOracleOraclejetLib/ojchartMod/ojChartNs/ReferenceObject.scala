package typings
package atOracleOraclejetLib.ojchartMod.ojChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait ReferenceObject extends js.Object {
  var axis: atOracleOraclejetLib.atOracleOraclejetLibStrings.xAxis | atOracleOraclejetLib.atOracleOraclejetLibStrings.yAxis | atOracleOraclejetLib.atOracleOraclejetLibStrings.y2Axis
  var index: scala.Double
  var subId: java.lang.String
}

object ReferenceObject {
  @scala.inline
  def apply(
    axis: atOracleOraclejetLib.atOracleOraclejetLibStrings.xAxis | atOracleOraclejetLib.atOracleOraclejetLibStrings.yAxis | atOracleOraclejetLib.atOracleOraclejetLibStrings.y2Axis,
    index: scala.Double,
    subId: java.lang.String
  ): ReferenceObject = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], index = index, subId = subId)
  
    __obj.asInstanceOf[ReferenceObject]
  }
}

