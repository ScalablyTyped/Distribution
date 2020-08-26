package typings.officeJs.Excel

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FiveQuartersSet extends /* index */ NumberDictionary[Icon] {
  var blackCircle: Icon = js.native
  var circleWithOneWhiteQuarter: Icon = js.native
  var circleWithThreeWhiteQuarters: Icon = js.native
  var circleWithTwoWhiteQuarters: Icon = js.native
  var whiteCircleAllWhiteQuarters: Icon = js.native
}

object FiveQuartersSet {
  @scala.inline
  def apply(
    blackCircle: Icon,
    circleWithOneWhiteQuarter: Icon,
    circleWithThreeWhiteQuarters: Icon,
    circleWithTwoWhiteQuarters: Icon,
    whiteCircleAllWhiteQuarters: Icon
  ): FiveQuartersSet = {
    val __obj = js.Dynamic.literal(blackCircle = blackCircle.asInstanceOf[js.Any], circleWithOneWhiteQuarter = circleWithOneWhiteQuarter.asInstanceOf[js.Any], circleWithThreeWhiteQuarters = circleWithThreeWhiteQuarters.asInstanceOf[js.Any], circleWithTwoWhiteQuarters = circleWithTwoWhiteQuarters.asInstanceOf[js.Any], whiteCircleAllWhiteQuarters = whiteCircleAllWhiteQuarters.asInstanceOf[js.Any])
    __obj.asInstanceOf[FiveQuartersSet]
  }
  @scala.inline
  implicit class FiveQuartersSetOps[Self <: FiveQuartersSet] (val x: Self) extends AnyVal {
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
    def setBlackCircle(value: Icon): Self = this.set("blackCircle", value.asInstanceOf[js.Any])
    @scala.inline
    def setCircleWithOneWhiteQuarter(value: Icon): Self = this.set("circleWithOneWhiteQuarter", value.asInstanceOf[js.Any])
    @scala.inline
    def setCircleWithThreeWhiteQuarters(value: Icon): Self = this.set("circleWithThreeWhiteQuarters", value.asInstanceOf[js.Any])
    @scala.inline
    def setCircleWithTwoWhiteQuarters(value: Icon): Self = this.set("circleWithTwoWhiteQuarters", value.asInstanceOf[js.Any])
    @scala.inline
    def setWhiteCircleAllWhiteQuarters(value: Icon): Self = this.set("whiteCircleAllWhiteQuarters", value.asInstanceOf[js.Any])
  }
  
}

