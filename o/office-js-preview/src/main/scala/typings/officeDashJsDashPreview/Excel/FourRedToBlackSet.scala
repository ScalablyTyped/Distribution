package typings.officeDashJsDashPreview.Excel

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FourRedToBlackSet extends /* index */ NumberDictionary[Icon] {
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
    NumberDictionary: /* index */ NumberDictionary[Icon] = null
  ): FourRedToBlackSet = {
    val __obj = js.Dynamic.literal(blackCircle = blackCircle, grayCircle = grayCircle, pinkCircle = pinkCircle, redCircle = redCircle)
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[FourRedToBlackSet]
  }
}

