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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a cell icon.
  *
  * @remarks
  * [Api set: ExcelApi 1.2]
  */
trait Icon extends StObject {
  
  /**
    * Specifies the index of the icon in the given set.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  var index: Double
  
  /**
    * Specifies the set that the icon is part of.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  var set: IconSet | Invalid | ThreeArrows | ThreeArrowsGray | ThreeFlags | ThreeTrafficLights1 | ThreeTrafficLights2 | ThreeSigns | ThreeSymbols | ThreeSymbols2 | FourArrows | FourArrowsGray | FourRedToBlack | FourRating | FourTrafficLights | FiveArrows | FiveArrowsGray | FiveRating | FiveQuarters | ThreeStars | ThreeTriangles | FiveBoxes
}
object Icon {
  
  inline def apply(
    index: Double,
    set: IconSet | Invalid | ThreeArrows | ThreeArrowsGray | ThreeFlags | ThreeTrafficLights1 | ThreeTrafficLights2 | ThreeSigns | ThreeSymbols | ThreeSymbols2 | FourArrows | FourArrowsGray | FourRedToBlack | FourRating | FourTrafficLights | FiveArrows | FiveArrowsGray | FiveRating | FiveQuarters | ThreeStars | ThreeTriangles | FiveBoxes
  ): Icon = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any])
    __obj.asInstanceOf[Icon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Icon] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setSet(
      value: IconSet | Invalid | ThreeArrows | ThreeArrowsGray | ThreeFlags | ThreeTrafficLights1 | ThreeTrafficLights2 | ThreeSigns | ThreeSymbols | ThreeSymbols2 | FourArrows | FourArrowsGray | FourRedToBlack | FourRating | FourTrafficLights | FiveArrows | FiveArrowsGray | FiveRating | FiveQuarters | ThreeStars | ThreeTriangles | FiveBoxes
    ): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
  }
}
