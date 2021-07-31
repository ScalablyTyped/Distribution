package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Response extends StObject {
  
  /** A reply from adding a banded range. */
  var addBanding: js.UndefOr[AddBandingResponse] = js.undefined
  
  /** A reply from adding a chart. */
  var addChart: js.UndefOr[AddChartResponse] = js.undefined
  
  /** A reply from adding a data source. */
  var addDataSource: js.UndefOr[AddDataSourceResponse] = js.undefined
  
  /** A reply from adding a dimension group. */
  var addDimensionGroup: js.UndefOr[AddDimensionGroupResponse] = js.undefined
  
  /** A reply from adding a filter view. */
  var addFilterView: js.UndefOr[AddFilterViewResponse] = js.undefined
  
  /** A reply from adding a named range. */
  var addNamedRange: js.UndefOr[AddNamedRangeResponse] = js.undefined
  
  /** A reply from adding a protected range. */
  var addProtectedRange: js.UndefOr[AddProtectedRangeResponse] = js.undefined
  
  /** A reply from adding a sheet. */
  var addSheet: js.UndefOr[AddSheetResponse] = js.undefined
  
  /** A reply from adding a slicer. */
  var addSlicer: js.UndefOr[AddSlicerResponse] = js.undefined
  
  /** A reply from creating a developer metadata entry. */
  var createDeveloperMetadata: js.UndefOr[CreateDeveloperMetadataResponse] = js.undefined
  
  /** A reply from deleting a conditional format rule. */
  var deleteConditionalFormatRule: js.UndefOr[DeleteConditionalFormatRuleResponse] = js.undefined
  
  /** A reply from deleting a developer metadata entry. */
  var deleteDeveloperMetadata: js.UndefOr[DeleteDeveloperMetadataResponse] = js.undefined
  
  /** A reply from deleting a dimension group. */
  var deleteDimensionGroup: js.UndefOr[DeleteDimensionGroupResponse] = js.undefined
  
  /** A reply from removing rows containing duplicate values. */
  var deleteDuplicates: js.UndefOr[DeleteDuplicatesResponse] = js.undefined
  
  /** A reply from duplicating a filter view. */
  var duplicateFilterView: js.UndefOr[DuplicateFilterViewResponse] = js.undefined
  
  /** A reply from duplicating a sheet. */
  var duplicateSheet: js.UndefOr[DuplicateSheetResponse] = js.undefined
  
  /** A reply from doing a find/replace. */
  var findReplace: js.UndefOr[FindReplaceResponse] = js.undefined
  
  /** A reply from refreshing data source objects. */
  var refreshDataSource: js.UndefOr[RefreshDataSourceResponse] = js.undefined
  
  /** A reply from trimming whitespace. */
  var trimWhitespace: js.UndefOr[TrimWhitespaceResponse] = js.undefined
  
  /** A reply from updating a conditional format rule. */
  var updateConditionalFormatRule: js.UndefOr[UpdateConditionalFormatRuleResponse] = js.undefined
  
  /** A reply from updating a data source. */
  var updateDataSource: js.UndefOr[UpdateDataSourceResponse] = js.undefined
  
  /** A reply from updating a developer metadata entry. */
  var updateDeveloperMetadata: js.UndefOr[UpdateDeveloperMetadataResponse] = js.undefined
  
  /** A reply from updating an embedded object's position. */
  var updateEmbeddedObjectPosition: js.UndefOr[UpdateEmbeddedObjectPositionResponse] = js.undefined
}
object Response {
  
  @scala.inline
  def apply(): Response = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Response]
  }
  
  @scala.inline
  implicit class ResponseMutableBuilder[Self <: Response] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddBanding(value: AddBandingResponse): Self = StObject.set(x, "addBanding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddBandingUndefined: Self = StObject.set(x, "addBanding", js.undefined)
    
    @scala.inline
    def setAddChart(value: AddChartResponse): Self = StObject.set(x, "addChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddChartUndefined: Self = StObject.set(x, "addChart", js.undefined)
    
    @scala.inline
    def setAddDataSource(value: AddDataSourceResponse): Self = StObject.set(x, "addDataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddDataSourceUndefined: Self = StObject.set(x, "addDataSource", js.undefined)
    
    @scala.inline
    def setAddDimensionGroup(value: AddDimensionGroupResponse): Self = StObject.set(x, "addDimensionGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddDimensionGroupUndefined: Self = StObject.set(x, "addDimensionGroup", js.undefined)
    
    @scala.inline
    def setAddFilterView(value: AddFilterViewResponse): Self = StObject.set(x, "addFilterView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddFilterViewUndefined: Self = StObject.set(x, "addFilterView", js.undefined)
    
    @scala.inline
    def setAddNamedRange(value: AddNamedRangeResponse): Self = StObject.set(x, "addNamedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddNamedRangeUndefined: Self = StObject.set(x, "addNamedRange", js.undefined)
    
    @scala.inline
    def setAddProtectedRange(value: AddProtectedRangeResponse): Self = StObject.set(x, "addProtectedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddProtectedRangeUndefined: Self = StObject.set(x, "addProtectedRange", js.undefined)
    
    @scala.inline
    def setAddSheet(value: AddSheetResponse): Self = StObject.set(x, "addSheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddSheetUndefined: Self = StObject.set(x, "addSheet", js.undefined)
    
    @scala.inline
    def setAddSlicer(value: AddSlicerResponse): Self = StObject.set(x, "addSlicer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddSlicerUndefined: Self = StObject.set(x, "addSlicer", js.undefined)
    
    @scala.inline
    def setCreateDeveloperMetadata(value: CreateDeveloperMetadataResponse): Self = StObject.set(x, "createDeveloperMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateDeveloperMetadataUndefined: Self = StObject.set(x, "createDeveloperMetadata", js.undefined)
    
    @scala.inline
    def setDeleteConditionalFormatRule(value: DeleteConditionalFormatRuleResponse): Self = StObject.set(x, "deleteConditionalFormatRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteConditionalFormatRuleUndefined: Self = StObject.set(x, "deleteConditionalFormatRule", js.undefined)
    
    @scala.inline
    def setDeleteDeveloperMetadata(value: DeleteDeveloperMetadataResponse): Self = StObject.set(x, "deleteDeveloperMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteDeveloperMetadataUndefined: Self = StObject.set(x, "deleteDeveloperMetadata", js.undefined)
    
    @scala.inline
    def setDeleteDimensionGroup(value: DeleteDimensionGroupResponse): Self = StObject.set(x, "deleteDimensionGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteDimensionGroupUndefined: Self = StObject.set(x, "deleteDimensionGroup", js.undefined)
    
    @scala.inline
    def setDeleteDuplicates(value: DeleteDuplicatesResponse): Self = StObject.set(x, "deleteDuplicates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteDuplicatesUndefined: Self = StObject.set(x, "deleteDuplicates", js.undefined)
    
    @scala.inline
    def setDuplicateFilterView(value: DuplicateFilterViewResponse): Self = StObject.set(x, "duplicateFilterView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuplicateFilterViewUndefined: Self = StObject.set(x, "duplicateFilterView", js.undefined)
    
    @scala.inline
    def setDuplicateSheet(value: DuplicateSheetResponse): Self = StObject.set(x, "duplicateSheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuplicateSheetUndefined: Self = StObject.set(x, "duplicateSheet", js.undefined)
    
    @scala.inline
    def setFindReplace(value: FindReplaceResponse): Self = StObject.set(x, "findReplace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindReplaceUndefined: Self = StObject.set(x, "findReplace", js.undefined)
    
    @scala.inline
    def setRefreshDataSource(value: RefreshDataSourceResponse): Self = StObject.set(x, "refreshDataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshDataSourceUndefined: Self = StObject.set(x, "refreshDataSource", js.undefined)
    
    @scala.inline
    def setTrimWhitespace(value: TrimWhitespaceResponse): Self = StObject.set(x, "trimWhitespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrimWhitespaceUndefined: Self = StObject.set(x, "trimWhitespace", js.undefined)
    
    @scala.inline
    def setUpdateConditionalFormatRule(value: UpdateConditionalFormatRuleResponse): Self = StObject.set(x, "updateConditionalFormatRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateConditionalFormatRuleUndefined: Self = StObject.set(x, "updateConditionalFormatRule", js.undefined)
    
    @scala.inline
    def setUpdateDataSource(value: UpdateDataSourceResponse): Self = StObject.set(x, "updateDataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateDataSourceUndefined: Self = StObject.set(x, "updateDataSource", js.undefined)
    
    @scala.inline
    def setUpdateDeveloperMetadata(value: UpdateDeveloperMetadataResponse): Self = StObject.set(x, "updateDeveloperMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateDeveloperMetadataUndefined: Self = StObject.set(x, "updateDeveloperMetadata", js.undefined)
    
    @scala.inline
    def setUpdateEmbeddedObjectPosition(value: UpdateEmbeddedObjectPositionResponse): Self = StObject.set(x, "updateEmbeddedObjectPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateEmbeddedObjectPositionUndefined: Self = StObject.set(x, "updateEmbeddedObjectPosition", js.undefined)
  }
}
