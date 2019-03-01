package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FourArrowsSet
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[Icon] {
  var greenUpArrow: Icon
  var redDownArrow: Icon
  var yellowDownInclineArrow: Icon
  var yellowUpInclineArrow: Icon
}

object FourArrowsSet {
  @scala.inline
  def apply(
    greenUpArrow: Icon,
    redDownArrow: Icon,
    yellowDownInclineArrow: Icon,
    yellowUpInclineArrow: Icon,
    NumberDictionary: /* index */ org.scalablytyped.runtime.NumberDictionary[Icon] = null
  ): FourArrowsSet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("greenUpArrow")(greenUpArrow)
    __obj.updateDynamic("redDownArrow")(redDownArrow)
    __obj.updateDynamic("yellowDownInclineArrow")(yellowDownInclineArrow)
    __obj.updateDynamic("yellowUpInclineArrow")(yellowUpInclineArrow)
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[FourArrowsSet]
  }
}

