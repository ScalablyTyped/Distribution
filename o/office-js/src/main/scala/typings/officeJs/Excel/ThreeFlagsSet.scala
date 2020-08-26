package typings.officeJs.Excel

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThreeFlagsSet extends /* index */ NumberDictionary[Icon] {
  var greenFlag: Icon = js.native
  var redFlag: Icon = js.native
  var yellowFlag: Icon = js.native
}

object ThreeFlagsSet {
  @scala.inline
  def apply(greenFlag: Icon, redFlag: Icon, yellowFlag: Icon): ThreeFlagsSet = {
    val __obj = js.Dynamic.literal(greenFlag = greenFlag.asInstanceOf[js.Any], redFlag = redFlag.asInstanceOf[js.Any], yellowFlag = yellowFlag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreeFlagsSet]
  }
  @scala.inline
  implicit class ThreeFlagsSetOps[Self <: ThreeFlagsSet] (val x: Self) extends AnyVal {
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
    def setGreenFlag(value: Icon): Self = this.set("greenFlag", value.asInstanceOf[js.Any])
    @scala.inline
    def setRedFlag(value: Icon): Self = this.set("redFlag", value.asInstanceOf[js.Any])
    @scala.inline
    def setYellowFlag(value: Icon): Self = this.set("yellowFlag", value.asInstanceOf[js.Any])
  }
  
}

