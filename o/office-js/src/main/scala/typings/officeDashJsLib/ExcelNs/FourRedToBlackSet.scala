package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FourRedToBlackSet
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[Icon] {
  var blackCircle: Icon
  var grayCircle: Icon
  var pinkCircle: Icon
  var redCircle: Icon
}

object FourRedToBlackSet {
  @scala.inline
  def apply(
    blackCircle: Icon,
    grayCircle: Icon,
    pinkCircle: Icon,
    redCircle: Icon,
    NumberDictionary: /* index */ org.scalablytyped.runtime.NumberDictionary[Icon] = null
  ): FourRedToBlackSet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("blackCircle")(blackCircle)
    __obj.updateDynamic("grayCircle")(grayCircle)
    __obj.updateDynamic("pinkCircle")(pinkCircle)
    __obj.updateDynamic("redCircle")(redCircle)
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[FourRedToBlackSet]
  }
}

