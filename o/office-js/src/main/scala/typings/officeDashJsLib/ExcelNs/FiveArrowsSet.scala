package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FiveArrowsSet
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[Icon] {
  var greenUpArrow: Icon
  var redDownArrow: Icon
  var yellowDownInclineArrow: Icon
  var yellowSideArrow: Icon
  var yellowUpInclineArrow: Icon
}

object FiveArrowsSet {
  @scala.inline
  def apply(
    greenUpArrow: Icon,
    redDownArrow: Icon,
    yellowDownInclineArrow: Icon,
    yellowSideArrow: Icon,
    yellowUpInclineArrow: Icon,
    NumberDictionary: /* index */ org.scalablytyped.runtime.NumberDictionary[Icon] = null
  ): FiveArrowsSet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("greenUpArrow")(greenUpArrow)
    __obj.updateDynamic("redDownArrow")(redDownArrow)
    __obj.updateDynamic("yellowDownInclineArrow")(yellowDownInclineArrow)
    __obj.updateDynamic("yellowSideArrow")(yellowSideArrow)
    __obj.updateDynamic("yellowUpInclineArrow")(yellowUpInclineArrow)
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[FiveArrowsSet]
  }
}

