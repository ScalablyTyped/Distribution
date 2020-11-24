package typings.officeJs.Excel

import typings.officeJs.officeJsStrings.FiveArrows
import typings.officeJs.officeJsStrings.FiveArrowsGray
import typings.officeJs.officeJsStrings.FiveBoxes
import typings.officeJs.officeJsStrings.FiveQuarters
import typings.officeJs.officeJsStrings.FiveRating
import typings.officeJs.officeJsStrings.FourArrows
import typings.officeJs.officeJsStrings.FourArrowsGray
import typings.officeJs.officeJsStrings.FourRating
import typings.officeJs.officeJsStrings.FourRedToBlack
import typings.officeJs.officeJsStrings.FourTrafficLights
import typings.officeJs.officeJsStrings.Invalid
import typings.officeJs.officeJsStrings.ThreeArrows
import typings.officeJs.officeJsStrings.ThreeArrowsGray
import typings.officeJs.officeJsStrings.ThreeFlags
import typings.officeJs.officeJsStrings.ThreeSigns
import typings.officeJs.officeJsStrings.ThreeStars
import typings.officeJs.officeJsStrings.ThreeSymbols
import typings.officeJs.officeJsStrings.ThreeSymbols2
import typings.officeJs.officeJsStrings.ThreeTrafficLights1
import typings.officeJs.officeJsStrings.ThreeTrafficLights2
import typings.officeJs.officeJsStrings.ThreeTriangles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a cell icon.
  *
  * [Api set: ExcelApi 1.2]
  */
@js.native
trait Icon extends js.Object {
  
  /**
    *
    * Specifies the index of the icon in the given set.
    *
    * [Api set: ExcelApi 1.2]
    */
  var index: Double = js.native
  
  /**
    *
    * Specifies the set that the icon is part of.
    *
    * [Api set: ExcelApi 1.2]
    */
  var set: IconSet | Invalid | ThreeArrows | ThreeArrowsGray | ThreeFlags | ThreeTrafficLights1 | ThreeTrafficLights2 | ThreeSigns | ThreeSymbols | ThreeSymbols2 | FourArrows | FourArrowsGray | FourRedToBlack | FourRating | FourTrafficLights | FiveArrows | FiveArrowsGray | FiveRating | FiveQuarters | ThreeStars | ThreeTriangles | FiveBoxes = js.native
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
  
  @scala.inline
  implicit class IconOps[Self <: Icon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSet(
      value: IconSet | Invalid | ThreeArrows | ThreeArrowsGray | ThreeFlags | ThreeTrafficLights1 | ThreeTrafficLights2 | ThreeSigns | ThreeSymbols | ThreeSymbols2 | FourArrows | FourArrowsGray | FourRedToBlack | FourRating | FourTrafficLights | FiveArrows | FiveArrowsGray | FiveRating | FiveQuarters | ThreeStars | ThreeTriangles | FiveBoxes
    ): Self = this.set("set", value.asInstanceOf[js.Any])
  }
}
