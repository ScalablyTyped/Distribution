package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FiveArrowsGraySet
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[Icon] {
  var grayDownArrow: Icon
  var grayDownInclineArrow: Icon
  var graySideArrow: Icon
  var grayUpArrow: Icon
  var grayUpInclineArrow: Icon
}

object FiveArrowsGraySet {
  @scala.inline
  def apply(
    grayDownArrow: Icon,
    grayDownInclineArrow: Icon,
    graySideArrow: Icon,
    grayUpArrow: Icon,
    grayUpInclineArrow: Icon,
    NumberDictionary: /* index */ org.scalablytyped.runtime.NumberDictionary[Icon] = null
  ): FiveArrowsGraySet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("grayDownArrow")(grayDownArrow)
    __obj.updateDynamic("grayDownInclineArrow")(grayDownInclineArrow)
    __obj.updateDynamic("graySideArrow")(graySideArrow)
    __obj.updateDynamic("grayUpArrow")(grayUpArrow)
    __obj.updateDynamic("grayUpInclineArrow")(grayUpInclineArrow)
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[FiveArrowsGraySet]
  }
}

