package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreeArrowsGraySet
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[Icon] {
  var grayDownArrow: Icon
  var graySideArrow: Icon
  var grayUpArrow: Icon
}

object ThreeArrowsGraySet {
  @scala.inline
  def apply(
    grayDownArrow: Icon,
    graySideArrow: Icon,
    grayUpArrow: Icon,
    NumberDictionary: /* index */ org.scalablytyped.runtime.NumberDictionary[Icon] = null
  ): ThreeArrowsGraySet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("grayDownArrow")(grayDownArrow)
    __obj.updateDynamic("graySideArrow")(graySideArrow)
    __obj.updateDynamic("grayUpArrow")(grayUpArrow)
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[ThreeArrowsGraySet]
  }
}

