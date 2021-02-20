package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkbookChartAxis extends Entity {
  
  // Represents the formatting of a chart object, which includes line and font formatting. Read-only.
  var format: js.UndefOr[NullableOption[WorkbookChartAxisFormat]] = js.native
  
  // Returns a gridlines object that represents the major gridlines for the specified axis. Read-only.
  var majorGridlines: js.UndefOr[NullableOption[WorkbookChartGridlines]] = js.native
  
  /**
    * Represents the interval between two major tick marks. Can be set to a numeric value or an empty string. The returned
    * value is always a number.
    */
  var majorUnit: js.UndefOr[NullableOption[_]] = js.native
  
  /**
    * Represents the maximum value on the value axis. Can be set to a numeric value or an empty string (for automatic axis
    * values). The returned value is always a number.
    */
  var maximum: js.UndefOr[NullableOption[_]] = js.native
  
  /**
    * Represents the minimum value on the value axis. Can be set to a numeric value or an empty string (for automatic axis
    * values). The returned value is always a number.
    */
  var minimum: js.UndefOr[NullableOption[_]] = js.native
  
  // Returns a Gridlines object that represents the minor gridlines for the specified axis. Read-only.
  var minorGridlines: js.UndefOr[NullableOption[WorkbookChartGridlines]] = js.native
  
  /**
    * Represents the interval between two minor tick marks. 'Can be set to a numeric value or an empty string (for automatic
    * axis values). The returned value is always a number.
    */
  var minorUnit: js.UndefOr[NullableOption[_]] = js.native
  
  // Represents the axis title. Read-only.
  var title: js.UndefOr[NullableOption[WorkbookChartAxisTitle]] = js.native
}
object WorkbookChartAxis {
  
  @scala.inline
  def apply(): WorkbookChartAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookChartAxis]
  }
  
  @scala.inline
  implicit class WorkbookChartAxisMutableBuilder[Self <: WorkbookChartAxis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: NullableOption[WorkbookChartAxisFormat]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatNull: Self = StObject.set(x, "format", null)
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setMajorGridlines(value: NullableOption[WorkbookChartGridlines]): Self = StObject.set(x, "majorGridlines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorGridlinesNull: Self = StObject.set(x, "majorGridlines", null)
    
    @scala.inline
    def setMajorGridlinesUndefined: Self = StObject.set(x, "majorGridlines", js.undefined)
    
    @scala.inline
    def setMajorUnit(value: NullableOption[_]): Self = StObject.set(x, "majorUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorUnitNull: Self = StObject.set(x, "majorUnit", null)
    
    @scala.inline
    def setMajorUnitUndefined: Self = StObject.set(x, "majorUnit", js.undefined)
    
    @scala.inline
    def setMaximum(value: NullableOption[_]): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumNull: Self = StObject.set(x, "maximum", null)
    
    @scala.inline
    def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
    
    @scala.inline
    def setMinimum(value: NullableOption[_]): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumNull: Self = StObject.set(x, "minimum", null)
    
    @scala.inline
    def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
    
    @scala.inline
    def setMinorGridlines(value: NullableOption[WorkbookChartGridlines]): Self = StObject.set(x, "minorGridlines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorGridlinesNull: Self = StObject.set(x, "minorGridlines", null)
    
    @scala.inline
    def setMinorGridlinesUndefined: Self = StObject.set(x, "minorGridlines", js.undefined)
    
    @scala.inline
    def setMinorUnit(value: NullableOption[_]): Self = StObject.set(x, "minorUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorUnitNull: Self = StObject.set(x, "minorUnit", null)
    
    @scala.inline
    def setMinorUnitUndefined: Self = StObject.set(x, "minorUnit", js.undefined)
    
    @scala.inline
    def setTitle(value: NullableOption[WorkbookChartAxisTitle]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleNull: Self = StObject.set(x, "title", null)
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
