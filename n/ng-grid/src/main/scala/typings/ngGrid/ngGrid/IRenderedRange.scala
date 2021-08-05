package typings.ngGrid.ngGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRenderedRange extends StObject {
  
  var bottomRow: Double
  
  var topRow: Double
}
object IRenderedRange {
  
  inline def apply(bottomRow: Double, topRow: Double): IRenderedRange = {
    val __obj = js.Dynamic.literal(bottomRow = bottomRow.asInstanceOf[js.Any], topRow = topRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRenderedRange]
  }
  
  extension [Self <: IRenderedRange](x: Self) {
    
    inline def setBottomRow(value: Double): Self = StObject.set(x, "bottomRow", value.asInstanceOf[js.Any])
    
    inline def setTopRow(value: Double): Self = StObject.set(x, "topRow", value.asInstanceOf[js.Any])
  }
}
