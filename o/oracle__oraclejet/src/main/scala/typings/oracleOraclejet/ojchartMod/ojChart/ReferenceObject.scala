package typings.oracleOraclejet.ojchartMod.ojChart

import typings.oracleOraclejet.oracleOraclejetStrings.xAxis
import typings.oracleOraclejet.oracleOraclejetStrings.y2Axis
import typings.oracleOraclejet.oracleOraclejetStrings.yAxis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
@js.native
trait ReferenceObject extends js.Object {
  var axis: xAxis | yAxis | y2Axis = js.native
  var index: Double = js.native
  var subId: String = js.native
}

object ReferenceObject {
  @scala.inline
  def apply(axis: xAxis | yAxis | y2Axis, index: Double, subId: String): ReferenceObject = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], subId = subId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceObject]
  }
  @scala.inline
  implicit class ReferenceObjectOps[Self <: ReferenceObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAxis(value: xAxis | yAxis | y2Axis): Self = this.set("axis", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubId(value: String): Self = this.set("subId", value.asInstanceOf[js.Any])
  }
  
}

