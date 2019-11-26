package typings.officeDashJsDashPreview.Excel

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FiveBoxesSet extends /* index */ NumberDictionary[Icon] {
  var fourFilledBoxes: Icon
  var noFilledBoxes: Icon
  var oneFilledBox: Icon
  var threeFilledBoxes: Icon
  var twoFilledBoxes: Icon
}

object FiveBoxesSet {
  @scala.inline
  def apply(
    fourFilledBoxes: Icon,
    noFilledBoxes: Icon,
    oneFilledBox: Icon,
    threeFilledBoxes: Icon,
    twoFilledBoxes: Icon,
    NumberDictionary: /* index */ NumberDictionary[Icon] = null
  ): FiveBoxesSet = {
    val __obj = js.Dynamic.literal(fourFilledBoxes = fourFilledBoxes.asInstanceOf[js.Any], noFilledBoxes = noFilledBoxes.asInstanceOf[js.Any], oneFilledBox = oneFilledBox.asInstanceOf[js.Any], threeFilledBoxes = threeFilledBoxes.asInstanceOf[js.Any], twoFilledBoxes = twoFilledBoxes.asInstanceOf[js.Any])
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[FiveBoxesSet]
  }
}

