package typings.oracleOraclejet.ojchartMod.ojChart

import typings.oracleOraclejet.oracleOraclejetStrings.xAxis
import typings.oracleOraclejet.oracleOraclejetStrings.y2Axis
import typings.oracleOraclejet.oracleOraclejetStrings.yAxis
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
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], subId = subId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReferenceObject]
  }
}

