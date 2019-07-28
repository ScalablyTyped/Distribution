package typings.officeDashJsDashPreview.ExcelNs

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreeStarsSet extends /* index */ NumberDictionary[Icon] {
  var goldStar: Icon
  var halfGoldStar: Icon
  var silverStar: Icon
}

object ThreeStarsSet {
  @scala.inline
  def apply(
    goldStar: Icon,
    halfGoldStar: Icon,
    silverStar: Icon,
    NumberDictionary: /* index */ NumberDictionary[Icon] = null
  ): ThreeStarsSet = {
    val __obj = js.Dynamic.literal(goldStar = goldStar, halfGoldStar = halfGoldStar, silverStar = silverStar)
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[ThreeStarsSet]
  }
}

