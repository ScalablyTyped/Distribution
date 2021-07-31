package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkbookChartGridlines
  extends StObject
     with Entity {
  
  // Represents the formatting of chart gridlines. Read-only.
  var format: js.UndefOr[NullableOption[WorkbookChartGridlinesFormat]] = js.undefined
  
  // Boolean value representing if the axis gridlines are visible or not.
  var visible: js.UndefOr[Boolean] = js.undefined
}
object WorkbookChartGridlines {
  
  @scala.inline
  def apply(): WorkbookChartGridlines = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookChartGridlines]
  }
  
  @scala.inline
  implicit class WorkbookChartGridlinesMutableBuilder[Self <: WorkbookChartGridlines] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: NullableOption[WorkbookChartGridlinesFormat]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatNull: Self = StObject.set(x, "format", null)
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
