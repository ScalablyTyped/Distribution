package typings.officeDashJsDashPreview.ExcelNs

import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.FiveArrows
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.FiveArrowsGray
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.FiveBoxes
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.FiveQuarters
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.FiveRating
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.FourArrows
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.FourArrowsGray
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.FourRating
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.FourRedToBlack
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.FourTrafficLights
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Invalid
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.LinkedEntityFinanceIcon
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.LinkedEntityMapIcon
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThreeArrows
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThreeArrowsGray
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThreeFlags
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThreeSigns
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThreeStars
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThreeSymbols
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThreeSymbols2
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThreeTrafficLights1
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThreeTrafficLights2
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThreeTriangles
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
  var index: Double
  /**
    *
    * Represents the set that the icon is part of.
    *
    * [Api set: ExcelApi 1.2]
    */
  var set: IconSet | Invalid | ThreeArrows | ThreeArrowsGray | ThreeFlags | ThreeTrafficLights1 | ThreeTrafficLights2 | ThreeSigns | ThreeSymbols | ThreeSymbols2 | FourArrows | FourArrowsGray | FourRedToBlack | FourRating | FourTrafficLights | FiveArrows | FiveArrowsGray | FiveRating | FiveQuarters | ThreeStars | ThreeTriangles | FiveBoxes | LinkedEntityFinanceIcon | LinkedEntityMapIcon
}

object Icon {
  @scala.inline
  def apply(
    index: Double,
    set: IconSet | Invalid | ThreeArrows | ThreeArrowsGray | ThreeFlags | ThreeTrafficLights1 | ThreeTrafficLights2 | ThreeSigns | ThreeSymbols | ThreeSymbols2 | FourArrows | FourArrowsGray | FourRedToBlack | FourRating | FourTrafficLights | FiveArrows | FiveArrowsGray | FiveRating | FiveQuarters | ThreeStars | ThreeTriangles | FiveBoxes | LinkedEntityFinanceIcon | LinkedEntityMapIcon
  ): Icon = {
    val __obj = js.Dynamic.literal(index = index, set = set.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Icon]
  }
}

