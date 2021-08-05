package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkbookChartAxis
  extends StObject
     with Entity {
  
  // Represents the formatting of a chart object, which includes line and font formatting. Read-only.
  var format: js.UndefOr[NullableOption[WorkbookChartAxisFormat]] = js.undefined
  
  // Returns a gridlines object that represents the major gridlines for the specified axis. Read-only.
  var majorGridlines: js.UndefOr[NullableOption[WorkbookChartGridlines]] = js.undefined
  
  /**
    * Represents the interval between two major tick marks. Can be set to a numeric value or an empty string. The returned
    * value is always a number.
    */
  var majorUnit: js.UndefOr[NullableOption[js.Any]] = js.undefined
  
  /**
    * Represents the maximum value on the value axis. Can be set to a numeric value or an empty string (for automatic axis
    * values). The returned value is always a number.
    */
  var maximum: js.UndefOr[NullableOption[js.Any]] = js.undefined
  
  /**
    * Represents the minimum value on the value axis. Can be set to a numeric value or an empty string (for automatic axis
    * values). The returned value is always a number.
    */
  var minimum: js.UndefOr[NullableOption[js.Any]] = js.undefined
  
  // Returns a Gridlines object that represents the minor gridlines for the specified axis. Read-only.
  var minorGridlines: js.UndefOr[NullableOption[WorkbookChartGridlines]] = js.undefined
  
  /**
    * Represents the interval between two minor tick marks. 'Can be set to a numeric value or an empty string (for automatic
    * axis values). The returned value is always a number.
    */
  var minorUnit: js.UndefOr[NullableOption[js.Any]] = js.undefined
  
  // Represents the axis title. Read-only.
  var title: js.UndefOr[NullableOption[WorkbookChartAxisTitle]] = js.undefined
}
object WorkbookChartAxis {
  
  inline def apply(): WorkbookChartAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookChartAxis]
  }
  
  extension [Self <: WorkbookChartAxis](x: Self) {
    
    inline def setFormat(value: NullableOption[WorkbookChartAxisFormat]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatNull: Self = StObject.set(x, "format", null)
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setMajorGridlines(value: NullableOption[WorkbookChartGridlines]): Self = StObject.set(x, "majorGridlines", value.asInstanceOf[js.Any])
    
    inline def setMajorGridlinesNull: Self = StObject.set(x, "majorGridlines", null)
    
    inline def setMajorGridlinesUndefined: Self = StObject.set(x, "majorGridlines", js.undefined)
    
    inline def setMajorUnit(value: NullableOption[js.Any]): Self = StObject.set(x, "majorUnit", value.asInstanceOf[js.Any])
    
    inline def setMajorUnitNull: Self = StObject.set(x, "majorUnit", null)
    
    inline def setMajorUnitUndefined: Self = StObject.set(x, "majorUnit", js.undefined)
    
    inline def setMaximum(value: NullableOption[js.Any]): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
    
    inline def setMaximumNull: Self = StObject.set(x, "maximum", null)
    
    inline def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
    
    inline def setMinimum(value: NullableOption[js.Any]): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
    
    inline def setMinimumNull: Self = StObject.set(x, "minimum", null)
    
    inline def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
    
    inline def setMinorGridlines(value: NullableOption[WorkbookChartGridlines]): Self = StObject.set(x, "minorGridlines", value.asInstanceOf[js.Any])
    
    inline def setMinorGridlinesNull: Self = StObject.set(x, "minorGridlines", null)
    
    inline def setMinorGridlinesUndefined: Self = StObject.set(x, "minorGridlines", js.undefined)
    
    inline def setMinorUnit(value: NullableOption[js.Any]): Self = StObject.set(x, "minorUnit", value.asInstanceOf[js.Any])
    
    inline def setMinorUnitNull: Self = StObject.set(x, "minorUnit", null)
    
    inline def setMinorUnitUndefined: Self = StObject.set(x, "minorUnit", js.undefined)
    
    inline def setTitle(value: NullableOption[WorkbookChartAxisTitle]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
