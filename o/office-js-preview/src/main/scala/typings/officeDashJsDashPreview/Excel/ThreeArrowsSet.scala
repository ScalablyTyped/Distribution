package typings.officeDashJsDashPreview.Excel

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreeArrowsSet extends /* index */ NumberDictionary[Icon] {
  var greenUpArrow: Icon
  var redDownArrow: Icon
  var yellowSideArrow: Icon
}

object ThreeArrowsSet {
  @scala.inline
  def apply(
    greenUpArrow: Icon,
    redDownArrow: Icon,
    yellowSideArrow: Icon,
    NumberDictionary: /* index */ NumberDictionary[Icon] = null
  ): ThreeArrowsSet = {
    val __obj = js.Dynamic.literal(greenUpArrow = greenUpArrow, redDownArrow = redDownArrow, yellowSideArrow = yellowSideArrow)
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[ThreeArrowsSet]
  }
}

