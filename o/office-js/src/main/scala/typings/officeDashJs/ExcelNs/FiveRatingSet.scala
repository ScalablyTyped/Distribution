package typings.officeDashJs.ExcelNs

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FiveRatingSet extends /* index */ NumberDictionary[Icon] {
  var fourBars: Icon
  var noBars: Icon
  var oneBar: Icon
  var threeBars: Icon
  var twoBars: Icon
}

object FiveRatingSet {
  @scala.inline
  def apply(
    fourBars: Icon,
    noBars: Icon,
    oneBar: Icon,
    threeBars: Icon,
    twoBars: Icon,
    NumberDictionary: /* index */ NumberDictionary[Icon] = null
  ): FiveRatingSet = {
    val __obj = js.Dynamic.literal(fourBars = fourBars, noBars = noBars, oneBar = oneBar, threeBars = threeBars, twoBars = twoBars)
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[FiveRatingSet]
  }
}

