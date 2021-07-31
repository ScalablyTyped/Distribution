package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkbookRangeBorder
  extends StObject
     with Entity {
  
  /**
    * HTML color code representing the color of the border line, of the form #RRGGBB (e.g. 'FFA500') or as a named HTML color
    * (e.g. 'orange').
    */
  var color: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Constant value that indicates the specific side of the border. The possible values are: EdgeTop, EdgeBottom, EdgeLeft,
    * EdgeRight, InsideVertical, InsideHorizontal, DiagonalDown, DiagonalUp. Read-only.
    */
  var sideIndex: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * One of the constants of line style specifying the line style for the border. The possible values are: None, Continuous,
    * Dash, DashDot, DashDotDot, Dot, Double, SlantDashDot.
    */
  var style: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Specifies the weight of the border around a range. The possible values are: Hairline, Thin, Medium, Thick.
  var weight: js.UndefOr[NullableOption[String]] = js.undefined
}
object WorkbookRangeBorder {
  
  @scala.inline
  def apply(): WorkbookRangeBorder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookRangeBorder]
  }
  
  @scala.inline
  implicit class WorkbookRangeBorderMutableBuilder[Self <: WorkbookRangeBorder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: NullableOption[String]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorNull: Self = StObject.set(x, "color", null)
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setSideIndex(value: NullableOption[String]): Self = StObject.set(x, "sideIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSideIndexNull: Self = StObject.set(x, "sideIndex", null)
    
    @scala.inline
    def setSideIndexUndefined: Self = StObject.set(x, "sideIndex", js.undefined)
    
    @scala.inline
    def setStyle(value: NullableOption[String]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setWeight(value: NullableOption[String]): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightNull: Self = StObject.set(x, "weight", null)
    
    @scala.inline
    def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
