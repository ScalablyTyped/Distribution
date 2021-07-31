package typings.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides options for how to get the data in a binding.
  *
  * @remarks
  *
  * If the rows option is used, the value must be "thisRow".
  */
trait GetBindingDataOptions extends StObject {
  
  /**
    * A user-defined item of any type that is returned, unchanged, in the asyncContext property of the AsyncResult object that is passed to a callback.
    */
  var asyncContext: js.UndefOr[js.Any] = js.undefined
  
  /**
    * The expected shape of the selection. Use {@link Office.CoercionType} or text value. Default: The original, uncoerced type of the binding.
    */
  var coercionType: js.UndefOr[CoercionType | String] = js.undefined
  
  /**
    * For table or matrix bindings, specifies the number of columns offset from the startColumn. Default is all subsequent columns.
    */
  var columnCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Specify whether to get only the visible (filtered in) data or all the data (default is all). Useful when filtering data.
    * Use Office.FilterType or text value.
    */
  var filterType: js.UndefOr[FilterType | String] = js.undefined
  
  /**
    * For table or matrix bindings, specifies the number of rows offset from the startRow. Default is all subsequent rows.
    */
  var rowCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Only for table bindings in content add-ins for Access. Specifies the pre-defined string "thisRow" to get data in the currently selected row.
    *
    * **Important**: We no longer recommend that you create and use Access web apps and databases in SharePoint.
    * As an alternative, we recommend that you use {@link https://powerapps.microsoft.com/ | Microsoft PowerApps}
    * to build no-code business solutions for web and mobile devices.
    */
  var rows: js.UndefOr[String] = js.undefined
  
  /**
    * For table or matrix bindings, specifies the zero-based starting column for a subset of the data in the binding. Default is first column.
    */
  var startColumn: js.UndefOr[Double] = js.undefined
  
  /**
    * For table or matrix bindings, specifies the zero-based starting row for a subset of the data in the binding. Default is first row.
    */
  var startRow: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies whether values, such as numbers and dates, are returned with their formatting applied. Use Office.ValueFormat or text value.
    * Default: Unformatted data.
    */
  var valueFormat: js.UndefOr[ValueFormat | String] = js.undefined
}
object GetBindingDataOptions {
  
  @scala.inline
  def apply(): GetBindingDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBindingDataOptions]
  }
  
  @scala.inline
  implicit class GetBindingDataOptionsMutableBuilder[Self <: GetBindingDataOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsyncContext(value: js.Any): Self = StObject.set(x, "asyncContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncContextUndefined: Self = StObject.set(x, "asyncContext", js.undefined)
    
    @scala.inline
    def setCoercionType(value: CoercionType | String): Self = StObject.set(x, "coercionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoercionTypeUndefined: Self = StObject.set(x, "coercionType", js.undefined)
    
    @scala.inline
    def setColumnCount(value: Double): Self = StObject.set(x, "columnCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnCountUndefined: Self = StObject.set(x, "columnCount", js.undefined)
    
    @scala.inline
    def setFilterType(value: FilterType | String): Self = StObject.set(x, "filterType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterTypeUndefined: Self = StObject.set(x, "filterType", js.undefined)
    
    @scala.inline
    def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowCountUndefined: Self = StObject.set(x, "rowCount", js.undefined)
    
    @scala.inline
    def setRows(value: String): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setStartColumn(value: Double): Self = StObject.set(x, "startColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartColumnUndefined: Self = StObject.set(x, "startColumn", js.undefined)
    
    @scala.inline
    def setStartRow(value: Double): Self = StObject.set(x, "startRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartRowUndefined: Self = StObject.set(x, "startRow", js.undefined)
    
    @scala.inline
    def setValueFormat(value: ValueFormat | String): Self = StObject.set(x, "valueFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueFormatUndefined: Self = StObject.set(x, "valueFormat", js.undefined)
  }
}
