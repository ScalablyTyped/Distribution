package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FourTrafficLightsSet extends /* index */ NumberDictionary[Icon] {
  var blackCircleWithBorder: Icon = js.native
  var greenCircle: Icon = js.native
  var redCircleWithBorder: Icon = js.native
  var yellowCircle: Icon = js.native
}

object FourTrafficLightsSet {
  @scala.inline
  def apply(blackCircleWithBorder: Icon, greenCircle: Icon, redCircleWithBorder: Icon, yellowCircle: Icon): FourTrafficLightsSet = {
    val __obj = js.Dynamic.literal(blackCircleWithBorder = blackCircleWithBorder.asInstanceOf[js.Any], greenCircle = greenCircle.asInstanceOf[js.Any], redCircleWithBorder = redCircleWithBorder.asInstanceOf[js.Any], yellowCircle = yellowCircle.asInstanceOf[js.Any])
    __obj.asInstanceOf[FourTrafficLightsSet]
  }
  @scala.inline
  implicit class FourTrafficLightsSetOps[Self <: FourTrafficLightsSet] (val x: Self) extends AnyVal {
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
    def setBlackCircleWithBorder(value: Icon): Self = this.set("blackCircleWithBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def setGreenCircle(value: Icon): Self = this.set("greenCircle", value.asInstanceOf[js.Any])
    @scala.inline
    def setRedCircleWithBorder(value: Icon): Self = this.set("redCircleWithBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def setYellowCircle(value: Icon): Self = this.set("yellowCircle", value.asInstanceOf[js.Any])
  }
  
}

