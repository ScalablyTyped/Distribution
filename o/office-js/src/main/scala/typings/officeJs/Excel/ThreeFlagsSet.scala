package typings.officeJs.Excel

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreeFlagsSet extends /* index */ NumberDictionary[Icon] {
  var greenFlag: Icon
  var redFlag: Icon
  var yellowFlag: Icon
}

object ThreeFlagsSet {
  @scala.inline
  def apply(
    greenFlag: Icon,
    redFlag: Icon,
    yellowFlag: Icon,
    NumberDictionary: /* index */ NumberDictionary[Icon] = null
  ): ThreeFlagsSet = {
    val __obj = js.Dynamic.literal(greenFlag = greenFlag.asInstanceOf[js.Any], redFlag = redFlag.asInstanceOf[js.Any], yellowFlag = yellowFlag.asInstanceOf[js.Any])
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[ThreeFlagsSet]
  }
}

