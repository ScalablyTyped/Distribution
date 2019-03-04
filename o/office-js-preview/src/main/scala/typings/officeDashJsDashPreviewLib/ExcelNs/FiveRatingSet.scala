package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FiveRatingSet
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[Icon] {
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
    NumberDictionary: /* index */ org.scalablytyped.runtime.NumberDictionary[Icon] = null
  ): FiveRatingSet = {
    val __obj = js.Dynamic.literal(fourBars = fourBars, noBars = noBars, oneBar = oneBar, threeBars = threeBars, twoBars = twoBars)
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[FiveRatingSet]
  }
}

