package typings.officeDashJsDashPreview.ExcelNs

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FourArrowsSet extends /* index */ NumberDictionary[Icon] {
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
    NumberDictionary: /* index */ NumberDictionary[Icon] = null
  ): FourArrowsSet = {
    val __obj = js.Dynamic.literal(greenUpArrow = greenUpArrow, redDownArrow = redDownArrow, yellowDownInclineArrow = yellowDownInclineArrow, yellowUpInclineArrow = yellowUpInclineArrow)
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[FourArrowsSet]
  }
}

