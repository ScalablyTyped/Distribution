package typings.officeDashJsDashPreview.ExcelNs

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FourRatingSet extends /* index */ NumberDictionary[Icon] {
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
    NumberDictionary: /* index */ NumberDictionary[Icon] = null
  ): FourRatingSet = {
    val __obj = js.Dynamic.literal(fourBars = fourBars, oneBar = oneBar, threeBars = threeBars, twoBars = twoBars)
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[FourRatingSet]
  }
}

