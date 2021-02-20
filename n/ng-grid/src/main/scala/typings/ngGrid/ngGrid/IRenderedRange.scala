package typings.ngGrid.ngGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRenderedRange extends StObject {
  
  var bottomRow: Double = js.native
  
  var topRow: Double = js.native
}
object IRenderedRange {
  
  @scala.inline
  def apply(bottomRow: Double, topRow: Double): IRenderedRange = {
    val __obj = js.Dynamic.literal(bottomRow = bottomRow.asInstanceOf[js.Any], topRow = topRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRenderedRange]
  }
  
  @scala.inline
  implicit class IRenderedRangeMutableBuilder[Self <: IRenderedRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottomRow(value: Double): Self = StObject.set(x, "bottomRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopRow(value: Double): Self = StObject.set(x, "topRow", value.asInstanceOf[js.Any])
  }
}
