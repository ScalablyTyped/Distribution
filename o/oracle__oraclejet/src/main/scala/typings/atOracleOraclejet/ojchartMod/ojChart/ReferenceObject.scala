package typings.atOracleOraclejet.ojchartMod.ojChart

import typings.atOracleOraclejet.atOracleOraclejetStrings.xAxis
import typings.atOracleOraclejet.atOracleOraclejetStrings.y2Axis
import typings.atOracleOraclejet.atOracleOraclejetStrings.yAxis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait ReferenceObject extends js.Object {
  var axis: xAxis | yAxis | y2Axis
  var index: Double
  var subId: String
}

object ReferenceObject {
  @scala.inline
  def apply(axis: xAxis | yAxis | y2Axis, index: Double, subId: String): ReferenceObject = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], index = index, subId = subId)
  
    __obj.asInstanceOf[ReferenceObject]
  }
}

