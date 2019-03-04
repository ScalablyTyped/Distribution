package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FourRatingSet
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[Icon] {
  var fourBars: Icon
  var oneBar: Icon
  var threeBars: Icon
  var twoBars: Icon
}

object FourRatingSet {
  @scala.inline
  def apply(
    fourBars: Icon,
    oneBar: Icon,
    threeBars: Icon,
    twoBars: Icon,
    NumberDictionary: /* index */ org.scalablytyped.runtime.NumberDictionary[Icon] = null
  ): FourRatingSet = {
    val __obj = js.Dynamic.literal(fourBars = fourBars, oneBar = oneBar, threeBars = threeBars, twoBars = twoBars)
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[FourRatingSet]
  }
}

