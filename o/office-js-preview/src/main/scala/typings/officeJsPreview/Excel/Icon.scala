package typings.officeJsPreview.Excel

import typings.officeJsPreview.officeJsPreviewStrings.FiveArrows
import typings.officeJsPreview.officeJsPreviewStrings.FiveArrowsGray
import typings.officeJsPreview.officeJsPreviewStrings.FiveBoxes
import typings.officeJsPreview.officeJsPreviewStrings.FiveQuarters
import typings.officeJsPreview.officeJsPreviewStrings.FiveRating
import typings.officeJsPreview.officeJsPreviewStrings.FourArrows
import typings.officeJsPreview.officeJsPreviewStrings.FourArrowsGray
import typings.officeJsPreview.officeJsPreviewStrings.FourRating
import typings.officeJsPreview.officeJsPreviewStrings.FourRedToBlack
import typings.officeJsPreview.officeJsPreviewStrings.FourTrafficLights
import typings.officeJsPreview.officeJsPreviewStrings.Invalid
import typings.officeJsPreview.officeJsPreviewStrings.ThreeArrows
import typings.officeJsPreview.officeJsPreviewStrings.ThreeArrowsGray
import typings.officeJsPreview.officeJsPreviewStrings.ThreeFlags
import typings.officeJsPreview.officeJsPreviewStrings.ThreeSigns
import typings.officeJsPreview.officeJsPreviewStrings.ThreeStars
import typings.officeJsPreview.officeJsPreviewStrings.ThreeSymbols
import typings.officeJsPreview.officeJsPreviewStrings.ThreeSymbols2
import typings.officeJsPreview.officeJsPreviewStrings.ThreeTrafficLights1
import typings.officeJsPreview.officeJsPreviewStrings.ThreeTrafficLights2
import typings.officeJsPreview.officeJsPreviewStrings.ThreeTriangles
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
  var set: IconSet | Invalid | ThreeArrows | ThreeArrowsGray | ThreeFlags | ThreeTrafficLights1 | ThreeTrafficLights2 | ThreeSigns | ThreeSymbols | ThreeSymbols2 | FourArrows | FourArrowsGray | FourRedToBlack | FourRating | FourTrafficLights | FiveArrows | FiveArrowsGray | FiveRating | FiveQuarters | ThreeStars | ThreeTriangles | FiveBoxes
}

object Icon {
  @scala.inline
  def apply(
    index: Double,
    set: IconSet | Invalid | ThreeArrows | ThreeArrowsGray | ThreeFlags | ThreeTrafficLights1 | ThreeTrafficLights2 | ThreeSigns | ThreeSymbols | ThreeSymbols2 | FourArrows | FourArrowsGray | FourRedToBlack | FourRating | FourTrafficLights | FiveArrows | FiveArrowsGray | FiveRating | FiveQuarters | ThreeStars | ThreeTriangles | FiveBoxes
  ): Icon = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Icon]
  }
}

