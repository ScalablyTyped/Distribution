package typings.officeDashJs.Excel

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FiveArrowsSet extends /* index */ NumberDictionary[Icon] {
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
    NumberDictionary: /* index */ NumberDictionary[Icon] = null
  ): FiveArrowsSet = {
    val __obj = js.Dynamic.literal(greenUpArrow = greenUpArrow, redDownArrow = redDownArrow, yellowDownInclineArrow = yellowDownInclineArrow, yellowSideArrow = yellowSideArrow, yellowUpInclineArrow = yellowUpInclineArrow)
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[FiveArrowsSet]
  }
}

