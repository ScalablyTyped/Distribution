package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkbookChartAxisTitle
  extends StObject
     with Entity {
  
  // Represents the formatting of chart axis title. Read-only.
  var format: js.UndefOr[NullableOption[WorkbookChartAxisTitleFormat]] = js.undefined
  
  // Represents the axis title.
  var text: js.UndefOr[NullableOption[String]] = js.undefined
  
  // A boolean that specifies the visibility of an axis title.
  var visible: js.UndefOr[Boolean] = js.undefined
}
object WorkbookChartAxisTitle {
  
  @scala.inline
  def apply(): WorkbookChartAxisTitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookChartAxisTitle]
  }
  
  @scala.inline
  implicit class WorkbookChartAxisTitleMutableBuilder[Self <: WorkbookChartAxisTitle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: NullableOption[WorkbookChartAxisTitleFormat]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatNull: Self = StObject.set(x, "format", null)
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setText(value: NullableOption[String]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextNull: Self = StObject.set(x, "text", null)
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
