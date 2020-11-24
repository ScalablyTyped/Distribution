package typings.officeJs.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides options for how to get the data in a binding.
  *
  * @remarks
  * 
  * If the rows option is used, the value must be "thisRow".
  */
@js.native
trait GetBindingDataOptions extends js.Object {
  
  /**
    * A user-defined item of any type that is returned, unchanged, in the asyncContext property of the AsyncResult object that is passed to a callback.
    */
  var asyncContext: js.UndefOr[js.Any] = js.native
  
  /**
    * The expected shape of the selection. Use {@link Office.CoercionType} or text value. Default: The original, uncoerced type of the binding.
    */
  var coercionType: js.UndefOr[CoercionType | String] = js.native
  
  /**
    * For table or matrix bindings, specifies the number of columns offset from the startColumn. Default is all subsequent columns.
    */
  var columnCount: js.UndefOr[Double] = js.native
  
  /**
    * Specify whether to get only the visible (filtered in) data or all the data (default is all). Useful when filtering data. 
    * Use Office.FilterType or text value.
    */
  var filterType: js.UndefOr[FilterType | String] = js.native
  
  /**
    * For table or matrix bindings, specifies the number of rows offset from the startRow. Default is all subsequent rows.
    */
  var rowCount: js.UndefOr[Double] = js.native
  
  /**
    * Only for table bindings in content add-ins for Access. Specifies the pre-defined string "thisRow" to get data in the currently selected row.
    * 
    * **Important**: We no longer recommend that you create and use Access web apps and databases in SharePoint.
    * As an alternative, we recommend that you use {@link https://powerapps.microsoft.com/ | Microsoft PowerApps}
    * to build no-code business solutions for web and mobile devices.
    */
  var rows: js.UndefOr[String] = js.native
  
  /**
    * For table or matrix bindings, specifies the zero-based starting column for a subset of the data in the binding. Default is first column.
    */
  var startColumn: js.UndefOr[Double] = js.native
  
  /**
    * For table or matrix bindings, specifies the zero-based starting row for a subset of the data in the binding. Default is first row.
    */
  var startRow: js.UndefOr[Double] = js.native
  
  /**
    * Specifies whether values, such as numbers and dates, are returned with their formatting applied. Use Office.ValueFormat or text value. 
    * Default: Unformatted data.
    */
  var valueFormat: js.UndefOr[ValueFormat | String] = js.native
}
object GetBindingDataOptions {
  
  @scala.inline
  def apply(): GetBindingDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBindingDataOptions]
  }
  
  @scala.inline
  implicit class GetBindingDataOptionsOps[Self <: GetBindingDataOptions] (val x: Self) extends AnyVal {
    
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
    def setAsyncContext(value: js.Any): Self = this.set("asyncContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsyncContext: Self = this.set("asyncContext", js.undefined)
    
    @scala.inline
    def setCoercionType(value: CoercionType | String): Self = this.set("coercionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoercionType: Self = this.set("coercionType", js.undefined)
    
    @scala.inline
    def setColumnCount(value: Double): Self = this.set("columnCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnCount: Self = this.set("columnCount", js.undefined)
    
    @scala.inline
    def setFilterType(value: FilterType | String): Self = this.set("filterType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterType: Self = this.set("filterType", js.undefined)
    
    @scala.inline
    def setRowCount(value: Double): Self = this.set("rowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowCount: Self = this.set("rowCount", js.undefined)
    
    @scala.inline
    def setRows(value: String): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    
    @scala.inline
    def setStartColumn(value: Double): Self = this.set("startColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartColumn: Self = this.set("startColumn", js.undefined)
    
    @scala.inline
    def setStartRow(value: Double): Self = this.set("startRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartRow: Self = this.set("startRow", js.undefined)
    
    @scala.inline
    def setValueFormat(value: ValueFormat | String): Self = this.set("valueFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueFormat: Self = this.set("valueFormat", js.undefined)
  }
}
