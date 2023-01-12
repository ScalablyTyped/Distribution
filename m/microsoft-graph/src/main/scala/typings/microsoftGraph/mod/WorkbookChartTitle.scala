package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkbookChartTitle
  extends StObject
     with Entity {
  
  // Represents the formatting of a chart title, which includes fill and font formatting. Read-only.
  var format: js.UndefOr[NullableOption[WorkbookChartTitleFormat]] = js.undefined
  
  // Boolean value representing if the chart title will overlay the chart or not.
  var overlay: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Represents the title text of a chart.
  var text: js.UndefOr[NullableOption[String]] = js.undefined
  
  // A boolean value the represents the visibility of a chart title object.
  var visible: js.UndefOr[Boolean] = js.undefined
}
object WorkbookChartTitle {
  
  inline def apply(): WorkbookChartTitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookChartTitle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkbookChartTitle] (val x: Self) extends AnyVal {
    
    inline def setFormat(value: NullableOption[WorkbookChartTitleFormat]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatNull: Self = StObject.set(x, "format", null)
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setOverlay(value: NullableOption[Boolean]): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
    
    inline def setOverlayNull: Self = StObject.set(x, "overlay", null)
    
    inline def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
    
    inline def setText(value: NullableOption[String]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
