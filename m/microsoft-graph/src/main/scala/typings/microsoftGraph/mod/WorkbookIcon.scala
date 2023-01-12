package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkbookIcon extends StObject {
  
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
  
  inline def apply(): WorkbookIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookIcon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkbookIcon] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setSet(value: String): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
    
    inline def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
  }
}
