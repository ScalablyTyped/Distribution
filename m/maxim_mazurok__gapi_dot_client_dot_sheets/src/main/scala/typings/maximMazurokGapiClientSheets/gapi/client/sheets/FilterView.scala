package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterView extends StObject {
  
  /**
    * The criteria for showing/hiding values per column. The map's key is the column index, and the value is the criteria for that column. This field is deprecated in favor of
    * filter_specs.
    */
  var criteria: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.sheets.gapi.client.sheets.FilterCriteria}
    */ typings.maximMazurokGapiClientSheets.maximMazurokGapiClientSheetsStrings.FilterView with TopLevel[js.Any]
  ] = js.native
  
  /**
    * The filter criteria for showing/hiding values per column. Both criteria and filter_specs are populated in responses. If both fields are specified in an update request, this field
    * takes precedence.
    */
  var filterSpecs: js.UndefOr[js.Array[FilterSpec]] = js.native
  
  /** The ID of the filter view. */
  var filterViewId: js.UndefOr[Double] = js.native
  
  /** The named range this filter view is backed by, if any. When writing, only one of range or named_range_id may be set. */
  var namedRangeId: js.UndefOr[String] = js.native
  
  /** The range this filter view covers. When writing, only one of range or named_range_id may be set. */
  var range: js.UndefOr[GridRange] = js.native
  
  /** The sort order per column. Later specifications are used when values are equal in the earlier specifications. */
  var sortSpecs: js.UndefOr[js.Array[SortSpec]] = js.native
  
  /** The name of the filter view. */
  var title: js.UndefOr[String] = js.native
}
object FilterView {
  
  @scala.inline
  def apply(): FilterView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterView]
  }
  
  @scala.inline
  implicit class FilterViewMutableBuilder[Self <: FilterView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCriteria(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.sheets.gapi.client.sheets.FilterCriteria}
      */ typings.maximMazurokGapiClientSheets.maximMazurokGapiClientSheetsStrings.FilterView with TopLevel[js.Any]
    ): Self = StObject.set(x, "criteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCriteriaUndefined: Self = StObject.set(x, "criteria", js.undefined)
    
    @scala.inline
    def setFilterSpecs(value: js.Array[FilterSpec]): Self = StObject.set(x, "filterSpecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterSpecsUndefined: Self = StObject.set(x, "filterSpecs", js.undefined)
    
    @scala.inline
    def setFilterSpecsVarargs(value: FilterSpec*): Self = StObject.set(x, "filterSpecs", js.Array(value :_*))
    
    @scala.inline
    def setFilterViewId(value: Double): Self = StObject.set(x, "filterViewId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterViewIdUndefined: Self = StObject.set(x, "filterViewId", js.undefined)
    
    @scala.inline
    def setNamedRangeId(value: String): Self = StObject.set(x, "namedRangeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedRangeIdUndefined: Self = StObject.set(x, "namedRangeId", js.undefined)
    
    @scala.inline
    def setRange(value: GridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    @scala.inline
    def setSortSpecs(value: js.Array[SortSpec]): Self = StObject.set(x, "sortSpecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortSpecsUndefined: Self = StObject.set(x, "sortSpecs", js.undefined)
    
    @scala.inline
    def setSortSpecsVarargs(value: SortSpec*): Self = StObject.set(x, "sortSpecs", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
