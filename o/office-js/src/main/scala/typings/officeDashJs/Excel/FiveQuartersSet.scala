package typings.officeDashJs.Excel

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FiveQuartersSet extends /* index */ NumberDictionary[Icon] {
  var blackCircle: Icon
  var circleWithOneWhiteQuarter: Icon
  var circleWithThreeWhiteQuarters: Icon
  var circleWithTwoWhiteQuarters: Icon
  var whiteCircleAllWhiteQuarters: Icon
}

object FiveQuartersSet {
  @scala.inline
  def apply(
    blackCircle: Icon,
    circleWithOneWhiteQuarter: Icon,
    circleWithThreeWhiteQuarters: Icon,
    circleWithTwoWhiteQuarters: Icon,
    whiteCircleAllWhiteQuarters: Icon,
    NumberDictionary: /* index */ NumberDictionary[Icon] = null
  ): FiveQuartersSet = {
    val __obj = js.Dynamic.literal(blackCircle = blackCircle.asInstanceOf[js.Any], circleWithOneWhiteQuarter = circleWithOneWhiteQuarter.asInstanceOf[js.Any], circleWithThreeWhiteQuarters = circleWithThreeWhiteQuarters.asInstanceOf[js.Any], circleWithTwoWhiteQuarters = circleWithTwoWhiteQuarters.asInstanceOf[js.Any], whiteCircleAllWhiteQuarters = whiteCircleAllWhiteQuarters.asInstanceOf[js.Any])
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[FiveQuartersSet]
  }
}

