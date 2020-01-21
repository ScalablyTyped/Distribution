package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookIcon extends js.Object {
  // Represents the index of the icon in the given set.
  var index: js.UndefOr[Double] = js.undefined
  /**
    * Represents the set that the icon is part of. The possible values are: Invalid, ThreeArrows, ThreeArrowsGray,
    * ThreeFlags, ThreeTrafficLights1, ThreeTrafficLights2, ThreeSigns, ThreeSymbols, ThreeSymbols2, FourArrows,
    * FourArrowsGray, FourRedToBlack, FourRating, FourTrafficLights, FiveArrows, FiveArrowsGray, FiveRating, FiveQuarters,
    * ThreeStars, ThreeTriangles, FiveBoxes.
    */
  var set: js.UndefOr[String] = js.undefined
}

object WorkbookIcon {
  @scala.inline
  def apply(index: Int | Double = null, set: String = null): WorkbookIcon = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (set != null) __obj.updateDynamic("set")(set.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkbookIcon]
  }
}

