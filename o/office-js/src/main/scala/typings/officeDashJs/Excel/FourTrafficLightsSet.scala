package typings.officeDashJs.Excel

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FourTrafficLightsSet extends /* index */ NumberDictionary[Icon] {
  var blackCircleWithBorder: Icon
  var greenCircle: Icon
  var redCircleWithBorder: Icon
  var yellowCircle: Icon
}

object FourTrafficLightsSet {
  @scala.inline
  def apply(
    blackCircleWithBorder: Icon,
    greenCircle: Icon,
    redCircleWithBorder: Icon,
    yellowCircle: Icon,
    NumberDictionary: /* index */ NumberDictionary[Icon] = null
  ): FourTrafficLightsSet = {
    val __obj = js.Dynamic.literal(blackCircleWithBorder = blackCircleWithBorder.asInstanceOf[js.Any], greenCircle = greenCircle.asInstanceOf[js.Any], redCircleWithBorder = redCircleWithBorder.asInstanceOf[js.Any], yellowCircle = yellowCircle.asInstanceOf[js.Any])
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[FourTrafficLightsSet]
  }
}

