package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FourArrowsGraySet
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[Icon] {
  var grayDownArrow: Icon
  var grayDownInclineArrow: Icon
  var grayUpArrow: Icon
  var grayUpInclineArrow: Icon
}

object FourArrowsGraySet {
  @scala.inline
  def apply(
    grayDownArrow: Icon,
    grayDownInclineArrow: Icon,
    grayUpArrow: Icon,
    grayUpInclineArrow: Icon,
    NumberDictionary: /* index */ org.scalablytyped.runtime.NumberDictionary[Icon] = null
  ): FourArrowsGraySet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("grayDownArrow")(grayDownArrow)
    __obj.updateDynamic("grayDownInclineArrow")(grayDownInclineArrow)
    __obj.updateDynamic("grayUpArrow")(grayUpArrow)
    __obj.updateDynamic("grayUpInclineArrow")(grayUpInclineArrow)
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[FourArrowsGraySet]
  }
}

