package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a cell icon.
  *
  * [Api set: ExcelApi 1.2]
  */
trait Icon extends js.Object {
  /**
    *
    * Represents the index of the icon in the given set.
    *
    * [Api set: ExcelApi 1.2]
    */
  var index: scala.Double
  /**
    *
    * Represents the set that the icon is part of.
    *
    * [Api set: ExcelApi 1.2]
    */
  var set: IconSet | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Invalid | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThreeArrows | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThreeArrowsGray | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThreeFlags | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThreeTrafficLights1 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThreeTrafficLights2 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThreeSigns | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThreeSymbols | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThreeSymbols2 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FourArrows | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FourArrowsGray | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FourRedToBlack | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FourRating | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FourTrafficLights | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FiveArrows | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FiveArrowsGray | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FiveRating | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FiveQuarters | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThreeStars | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThreeTriangles | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FiveBoxes | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LinkedEntityFinanceIcon | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LinkedEntityMapIcon
}

object Icon {
  @scala.inline
  def apply(
    index: scala.Double,
    set: IconSet | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Invalid | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThreeArrows | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThreeArrowsGray | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThreeFlags | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThreeTrafficLights1 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThreeTrafficLights2 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThreeSigns | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThreeSymbols | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThreeSymbols2 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FourArrows | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FourArrowsGray | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FourRedToBlack | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FourRating | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FourTrafficLights | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FiveArrows | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FiveArrowsGray | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FiveRating | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FiveQuarters | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThreeStars | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThreeTriangles | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FiveBoxes | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LinkedEntityFinanceIcon | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LinkedEntityMapIcon
  ): Icon = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("set")(set.asInstanceOf[js.Any])
    __obj.asInstanceOf[Icon]
  }
}

