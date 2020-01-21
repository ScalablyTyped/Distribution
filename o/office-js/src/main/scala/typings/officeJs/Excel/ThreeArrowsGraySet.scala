package typings.officeJs.Excel

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreeArrowsGraySet extends /* index */ NumberDictionary[Icon] {
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
    NumberDictionary: /* index */ NumberDictionary[Icon] = null
  ): ThreeArrowsGraySet = {
    val __obj = js.Dynamic.literal(grayDownArrow = grayDownArrow.asInstanceOf[js.Any], graySideArrow = graySideArrow.asInstanceOf[js.Any], grayUpArrow = grayUpArrow.asInstanceOf[js.Any])
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[ThreeArrowsGraySet]
  }
}

