package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FourTrafficLightsSet
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[Icon] {
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
    NumberDictionary: /* index */ org.scalablytyped.runtime.NumberDictionary[Icon] = null
  ): FourTrafficLightsSet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("blackCircleWithBorder")(blackCircleWithBorder)
    __obj.updateDynamic("greenCircle")(greenCircle)
    __obj.updateDynamic("redCircleWithBorder")(redCircleWithBorder)
    __obj.updateDynamic("yellowCircle")(yellowCircle)
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[FourTrafficLightsSet]
  }
}

