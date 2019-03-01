package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreeArrowsSet
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[Icon] {
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
    NumberDictionary: /* index */ org.scalablytyped.runtime.NumberDictionary[Icon] = null
  ): ThreeArrowsSet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("greenUpArrow")(greenUpArrow)
    __obj.updateDynamic("redDownArrow")(redDownArrow)
    __obj.updateDynamic("yellowSideArrow")(yellowSideArrow)
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[ThreeArrowsSet]
  }
}

