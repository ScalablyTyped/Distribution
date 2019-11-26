package typings.officeDashJsDashPreview.Excel

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreeTrafficLights1Set extends /* index */ NumberDictionary[Icon] {
  var greenCircle: Icon
  var redCircleWithBorder: Icon
  var yellowCircle: Icon
}

object ThreeTrafficLights1Set {
  @scala.inline
  def apply(
    greenCircle: Icon,
    redCircleWithBorder: Icon,
    yellowCircle: Icon,
    NumberDictionary: /* index */ NumberDictionary[Icon] = null
  ): ThreeTrafficLights1Set = {
    val __obj = js.Dynamic.literal(greenCircle = greenCircle.asInstanceOf[js.Any], redCircleWithBorder = redCircleWithBorder.asInstanceOf[js.Any], yellowCircle = yellowCircle.asInstanceOf[js.Any])
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[ThreeTrafficLights1Set]
  }
}

