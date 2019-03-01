package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreeFlagsSet
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[Icon] {
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
    NumberDictionary: /* index */ org.scalablytyped.runtime.NumberDictionary[Icon] = null
  ): ThreeFlagsSet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("greenFlag")(greenFlag)
    __obj.updateDynamic("redFlag")(redFlag)
    __obj.updateDynamic("yellowFlag")(yellowFlag)
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[ThreeFlagsSet]
  }
}

