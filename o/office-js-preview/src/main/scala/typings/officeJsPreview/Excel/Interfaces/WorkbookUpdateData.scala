package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the Workbook object, for use in `workbook.set({ ... })`. */
trait WorkbookUpdateData extends StObject {
  
  /**
    *
    * True if all charts in the workbook are tracking the actual data points to which they are attached.
    False if the charts track the index of the data points.
    *
    * [Api set: ExcelApi 1.9]
    */
  var chartDataPointTrack: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies if changes have been made since the workbook was last saved.
    You can set this property to true if you want to close a modified workbook without either saving it or being prompted to save it.
    *
    * [Api set: ExcelApi 1.9]
    */
  var isDirty: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Gets the workbook properties.
    *
    * [Api set: ExcelApi 1.7]
    */
  var properties: js.UndefOr[DocumentPropertiesUpdateData] = js.undefined
  
  /**
    *
    * Specifies whether the PivotTable's field list pane is shown at the workbook level.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var showPivotFieldList: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * True if the workbook uses the 1904 date system.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var use1904DateSystem: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * True if calculations in this workbook will be done using only the precision of the numbers as they're displayed.
    Data will permanently lose accuracy when switching this property from false to true.
    *
    * [Api set: ExcelApi 1.9]
    */
  var usePrecisionAsDisplayed: js.UndefOr[Boolean] = js.undefined
}
object WorkbookUpdateData {
  
  @scala.inline
  def apply(): WorkbookUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookUpdateData]
  }
  
  @scala.inline
  implicit class WorkbookUpdateDataMutableBuilder[Self <: WorkbookUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChartDataPointTrack(value: Boolean): Self = StObject.set(x, "chartDataPointTrack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartDataPointTrackUndefined: Self = StObject.set(x, "chartDataPointTrack", js.undefined)
    
    @scala.inline
    def setIsDirty(value: Boolean): Self = StObject.set(x, "isDirty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDirtyUndefined: Self = StObject.set(x, "isDirty", js.undefined)
    
    @scala.inline
    def setProperties(value: DocumentPropertiesUpdateData): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setShowPivotFieldList(value: Boolean): Self = StObject.set(x, "showPivotFieldList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowPivotFieldListUndefined: Self = StObject.set(x, "showPivotFieldList", js.undefined)
    
    @scala.inline
    def setUse1904DateSystem(value: Boolean): Self = StObject.set(x, "use1904DateSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUse1904DateSystemUndefined: Self = StObject.set(x, "use1904DateSystem", js.undefined)
    
    @scala.inline
    def setUsePrecisionAsDisplayed(value: Boolean): Self = StObject.set(x, "usePrecisionAsDisplayed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsePrecisionAsDisplayedUndefined: Self = StObject.set(x, "usePrecisionAsDisplayed", js.undefined)
  }
}
