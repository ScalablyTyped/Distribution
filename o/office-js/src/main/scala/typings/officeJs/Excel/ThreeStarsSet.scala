package typings.officeJs.Excel

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
    val __obj = js.Dynamic.literal(goldStar = goldStar.asInstanceOf[js.Any], halfGoldStar = halfGoldStar.asInstanceOf[js.Any], silverStar = silverStar.asInstanceOf[js.Any])
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[ThreeStarsSet]
  }
}

