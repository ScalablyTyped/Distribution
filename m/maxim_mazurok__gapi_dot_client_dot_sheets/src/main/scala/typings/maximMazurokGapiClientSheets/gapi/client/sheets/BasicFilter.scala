package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasicFilter extends js.Object {
  
  /**
    * The criteria for showing/hiding values per column. The map's key is the column index, and the value is the criteria for that column. This field is deprecated in favor of
    * filter_specs.
    */
  var criteria: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.sheets.gapi.client.sheets.FilterCriteria}
    */ typings.maximMazurokGapiClientSheets.maximMazurokGapiClientSheetsStrings.BasicFilter with TopLevel[js.Any]
  ] = js.native
  
  /** The filter criteria per column. Both criteria and filter_specs are populated in responses. If both fields are specified in an update request, this field takes precedence. */
  var filterSpecs: js.UndefOr[js.Array[FilterSpec]] = js.native
  
  /** The range the filter covers. */
  var range: js.UndefOr[GridRange] = js.native
  
  /** The sort order per column. Later specifications are used when values are equal in the earlier specifications. */
  var sortSpecs: js.UndefOr[js.Array[SortSpec]] = js.native
}
object BasicFilter {
  
  @scala.inline
  def apply(): BasicFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasicFilter]
  }
  
  @scala.inline
  implicit class BasicFilterOps[Self <: BasicFilter] (val x: Self) extends AnyVal {
    
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
    def setCriteria(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.sheets.gapi.client.sheets.FilterCriteria}
      */ typings.maximMazurokGapiClientSheets.maximMazurokGapiClientSheetsStrings.BasicFilter with TopLevel[js.Any]
    ): Self = this.set("criteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCriteria: Self = this.set("criteria", js.undefined)
    
    @scala.inline
    def setFilterSpecsVarargs(value: FilterSpec*): Self = this.set("filterSpecs", js.Array(value :_*))
    
    @scala.inline
    def setFilterSpecs(value: js.Array[FilterSpec]): Self = this.set("filterSpecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterSpecs: Self = this.set("filterSpecs", js.undefined)
    
    @scala.inline
    def setRange(value: GridRange): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    
    @scala.inline
    def setSortSpecsVarargs(value: SortSpec*): Self = this.set("sortSpecs", js.Array(value :_*))
    
    @scala.inline
    def setSortSpecs(value: js.Array[SortSpec]): Self = this.set("sortSpecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortSpecs: Self = this.set("sortSpecs", js.undefined)
  }
}
