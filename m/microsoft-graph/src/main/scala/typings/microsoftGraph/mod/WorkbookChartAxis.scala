package typings.microsoftGraph.mod

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
  implicit class WorkbookChartAxisOps[Self <: WorkbookChartAxis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFormat(value: NullableOption[WorkbookChartAxisFormat]): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setFormatNull: Self = this.set("format", null)
    
    @scala.inline
    def setMajorGridlines(value: NullableOption[WorkbookChartGridlines]): Self = this.set("majorGridlines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMajorGridlines: Self = this.set("majorGridlines", js.undefined)
    
    @scala.inline
    def setMajorGridlinesNull: Self = this.set("majorGridlines", null)
    
    @scala.inline
    def setMajorUnit(value: NullableOption[_]): Self = this.set("majorUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMajorUnit: Self = this.set("majorUnit", js.undefined)
    
    @scala.inline
    def setMajorUnitNull: Self = this.set("majorUnit", null)
    
    @scala.inline
    def setMaximum(value: NullableOption[_]): Self = this.set("maximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximum: Self = this.set("maximum", js.undefined)
    
    @scala.inline
    def setMaximumNull: Self = this.set("maximum", null)
    
    @scala.inline
    def setMinimum(value: NullableOption[_]): Self = this.set("minimum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimum: Self = this.set("minimum", js.undefined)
    
    @scala.inline
    def setMinimumNull: Self = this.set("minimum", null)
    
    @scala.inline
    def setMinorGridlines(value: NullableOption[WorkbookChartGridlines]): Self = this.set("minorGridlines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinorGridlines: Self = this.set("minorGridlines", js.undefined)
    
    @scala.inline
    def setMinorGridlinesNull: Self = this.set("minorGridlines", null)
    
    @scala.inline
    def setMinorUnit(value: NullableOption[_]): Self = this.set("minorUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinorUnit: Self = this.set("minorUnit", js.undefined)
    
    @scala.inline
    def setMinorUnitNull: Self = this.set("minorUnit", null)
    
    @scala.inline
    def setTitle(value: NullableOption[WorkbookChartAxisTitle]): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTitleNull: Self = this.set("title", null)
  }
}
