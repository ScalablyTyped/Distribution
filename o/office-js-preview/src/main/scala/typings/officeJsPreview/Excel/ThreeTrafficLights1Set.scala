package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThreeTrafficLights1Set extends /* index */ NumberDictionary[Icon] {
  var greenCircle: Icon = js.native
  var redCircleWithBorder: Icon = js.native
  var yellowCircle: Icon = js.native
}

object ThreeTrafficLights1Set {
  @scala.inline
  def apply(greenCircle: Icon, redCircleWithBorder: Icon, yellowCircle: Icon): ThreeTrafficLights1Set = {
    val __obj = js.Dynamic.literal(greenCircle = greenCircle.asInstanceOf[js.Any], redCircleWithBorder = redCircleWithBorder.asInstanceOf[js.Any], yellowCircle = yellowCircle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreeTrafficLights1Set]
  }
  @scala.inline
  implicit class ThreeTrafficLights1SetOps[Self <: ThreeTrafficLights1Set] (val x: Self) extends AnyVal {
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
    def setGreenCircle(value: Icon): Self = this.set("greenCircle", value.asInstanceOf[js.Any])
    @scala.inline
    def setRedCircleWithBorder(value: Icon): Self = this.set("redCircleWithBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def setYellowCircle(value: Icon): Self = this.set("yellowCircle", value.asInstanceOf[js.Any])
  }
  
}

