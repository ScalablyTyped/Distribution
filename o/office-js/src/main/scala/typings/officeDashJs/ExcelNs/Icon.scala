package typings.officeDashJs.ExcelNs

import typings.officeDashJs.officeDashJsStrings.FiveArrows
import typings.officeDashJs.officeDashJsStrings.FiveArrowsGray
import typings.officeDashJs.officeDashJsStrings.FiveBoxes
import typings.officeDashJs.officeDashJsStrings.FiveQuarters
import typings.officeDashJs.officeDashJsStrings.FiveRating
import typings.officeDashJs.officeDashJsStrings.FourArrows
import typings.officeDashJs.officeDashJsStrings.FourArrowsGray
import typings.officeDashJs.officeDashJsStrings.FourRating
import typings.officeDashJs.officeDashJsStrings.FourRedToBlack
import typings.officeDashJs.officeDashJsStrings.FourTrafficLights
import typings.officeDashJs.officeDashJsStrings.Invalid
import typings.officeDashJs.officeDashJsStrings.LinkedEntityFinanceIcon
import typings.officeDashJs.officeDashJsStrings.LinkedEntityMapIcon
import typings.officeDashJs.officeDashJsStrings.ThreeArrows
import typings.officeDashJs.officeDashJsStrings.ThreeArrowsGray
import typings.officeDashJs.officeDashJsStrings.ThreeFlags
import typings.officeDashJs.officeDashJsStrings.ThreeSigns
import typings.officeDashJs.officeDashJsStrings.ThreeStars
import typings.officeDashJs.officeDashJsStrings.ThreeSymbols
import typings.officeDashJs.officeDashJsStrings.ThreeSymbols2
import typings.officeDashJs.officeDashJsStrings.ThreeTrafficLights1
import typings.officeDashJs.officeDashJsStrings.ThreeTrafficLights2
import typings.officeDashJs.officeDashJsStrings.ThreeTriangles
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

