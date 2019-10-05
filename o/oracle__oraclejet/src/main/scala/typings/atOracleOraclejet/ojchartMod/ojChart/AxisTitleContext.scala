package typings.atOracleOraclejet.ojchartMod.ojChart

import typings.atOracleOraclejet.atOracleOraclejetStrings.xAxis
import typings.atOracleOraclejet.atOracleOraclejetStrings.y2Axis
import typings.atOracleOraclejet.atOracleOraclejetStrings.yAxis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait AxisTitleContext extends js.Object {
  var axis: xAxis | yAxis | y2Axis
  var subId: String
}

object AxisTitleContext {
  @scala.inline
  def apply(axis: xAxis | yAxis | y2Axis, subId: String): AxisTitleContext = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], subId = subId)
  
    __obj.asInstanceOf[AxisTitleContext]
  }
}

