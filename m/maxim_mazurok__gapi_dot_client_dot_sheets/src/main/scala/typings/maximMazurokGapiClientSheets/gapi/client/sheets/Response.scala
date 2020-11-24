package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Response extends js.Object {
  
  /** A reply from adding a banded range. */
  var addBanding: js.UndefOr[AddBandingResponse] = js.native
  
  /** A reply from adding a chart. */
  var addChart: js.UndefOr[AddChartResponse] = js.native
  
  /** A reply from adding a data source. */
  var addDataSource: js.UndefOr[AddDataSourceResponse] = js.native
  
  /** A reply from adding a dimension group. */
  var addDimensionGroup: js.UndefOr[AddDimensionGroupResponse] = js.native
  
  /** A reply from adding a filter view. */
  var addFilterView: js.UndefOr[AddFilterViewResponse] = js.native
  
  /** A reply from adding a named range. */
  var addNamedRange: js.UndefOr[AddNamedRangeResponse] = js.native
  
  /** A reply from adding a protected range. */
  var addProtectedRange: js.UndefOr[AddProtectedRangeResponse] = js.native
  
  /** A reply from adding a sheet. */
  var addSheet: js.UndefOr[AddSheetResponse] = js.native
  
  /** A reply from adding a slicer. */
  var addSlicer: js.UndefOr[AddSlicerResponse] = js.native
  
  /** A reply from creating a developer metadata entry. */
  var createDeveloperMetadata: js.UndefOr[CreateDeveloperMetadataResponse] = js.native
  
  /** A reply from deleting a conditional format rule. */
  var deleteConditionalFormatRule: js.UndefOr[DeleteConditionalFormatRuleResponse] = js.native
  
  /** A reply from deleting a developer metadata entry. */
  var deleteDeveloperMetadata: js.UndefOr[DeleteDeveloperMetadataResponse] = js.native
  
  /** A reply from deleting a dimension group. */
  var deleteDimensionGroup: js.UndefOr[DeleteDimensionGroupResponse] = js.native
  
  /** A reply from removing rows containing duplicate values. */
  var deleteDuplicates: js.UndefOr[DeleteDuplicatesResponse] = js.native
  
  /** A reply from duplicating a filter view. */
  var duplicateFilterView: js.UndefOr[DuplicateFilterViewResponse] = js.native
  
  /** A reply from duplicating a sheet. */
  var duplicateSheet: js.UndefOr[DuplicateSheetResponse] = js.native
  
  /** A reply from doing a find/replace. */
  var findReplace: js.UndefOr[FindReplaceResponse] = js.native
  
  /** A reply from refreshing data source objects. */
  var refreshDataSource: js.UndefOr[RefreshDataSourceResponse] = js.native
  
  /** A reply from trimming whitespace. */
  var trimWhitespace: js.UndefOr[TrimWhitespaceResponse] = js.native
  
  /** A reply from updating a conditional format rule. */
  var updateConditionalFormatRule: js.UndefOr[UpdateConditionalFormatRuleResponse] = js.native
  
  /** A reply from updating a data source. */
  var updateDataSource: js.UndefOr[UpdateDataSourceResponse] = js.native
  
  /** A reply from updating a developer metadata entry. */
  var updateDeveloperMetadata: js.UndefOr[UpdateDeveloperMetadataResponse] = js.native
  
  /** A reply from updating an embedded object's position. */
  var updateEmbeddedObjectPosition: js.UndefOr[UpdateEmbeddedObjectPositionResponse] = js.native
}
object Response {
  
  @scala.inline
  def apply(): Response = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Response]
  }
  
  @scala.inline
  implicit class ResponseOps[Self <: Response] (val x: Self) extends AnyVal {
    
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
    def setAddBanding(value: AddBandingResponse): Self = this.set("addBanding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddBanding: Self = this.set("addBanding", js.undefined)
    
    @scala.inline
    def setAddChart(value: AddChartResponse): Self = this.set("addChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddChart: Self = this.set("addChart", js.undefined)
    
    @scala.inline
    def setAddDataSource(value: AddDataSourceResponse): Self = this.set("addDataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddDataSource: Self = this.set("addDataSource", js.undefined)
    
    @scala.inline
    def setAddDimensionGroup(value: AddDimensionGroupResponse): Self = this.set("addDimensionGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddDimensionGroup: Self = this.set("addDimensionGroup", js.undefined)
    
    @scala.inline
    def setAddFilterView(value: AddFilterViewResponse): Self = this.set("addFilterView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddFilterView: Self = this.set("addFilterView", js.undefined)
    
    @scala.inline
    def setAddNamedRange(value: AddNamedRangeResponse): Self = this.set("addNamedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddNamedRange: Self = this.set("addNamedRange", js.undefined)
    
    @scala.inline
    def setAddProtectedRange(value: AddProtectedRangeResponse): Self = this.set("addProtectedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddProtectedRange: Self = this.set("addProtectedRange", js.undefined)
    
    @scala.inline
    def setAddSheet(value: AddSheetResponse): Self = this.set("addSheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddSheet: Self = this.set("addSheet", js.undefined)
    
    @scala.inline
    def setAddSlicer(value: AddSlicerResponse): Self = this.set("addSlicer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddSlicer: Self = this.set("addSlicer", js.undefined)
    
    @scala.inline
    def setCreateDeveloperMetadata(value: CreateDeveloperMetadataResponse): Self = this.set("createDeveloperMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateDeveloperMetadata: Self = this.set("createDeveloperMetadata", js.undefined)
    
    @scala.inline
    def setDeleteConditionalFormatRule(value: DeleteConditionalFormatRuleResponse): Self = this.set("deleteConditionalFormatRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteConditionalFormatRule: Self = this.set("deleteConditionalFormatRule", js.undefined)
    
    @scala.inline
    def setDeleteDeveloperMetadata(value: DeleteDeveloperMetadataResponse): Self = this.set("deleteDeveloperMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteDeveloperMetadata: Self = this.set("deleteDeveloperMetadata", js.undefined)
    
    @scala.inline
    def setDeleteDimensionGroup(value: DeleteDimensionGroupResponse): Self = this.set("deleteDimensionGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteDimensionGroup: Self = this.set("deleteDimensionGroup", js.undefined)
    
    @scala.inline
    def setDeleteDuplicates(value: DeleteDuplicatesResponse): Self = this.set("deleteDuplicates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteDuplicates: Self = this.set("deleteDuplicates", js.undefined)
    
    @scala.inline
    def setDuplicateFilterView(value: DuplicateFilterViewResponse): Self = this.set("duplicateFilterView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuplicateFilterView: Self = this.set("duplicateFilterView", js.undefined)
    
    @scala.inline
    def setDuplicateSheet(value: DuplicateSheetResponse): Self = this.set("duplicateSheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuplicateSheet: Self = this.set("duplicateSheet", js.undefined)
    
    @scala.inline
    def setFindReplace(value: FindReplaceResponse): Self = this.set("findReplace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFindReplace: Self = this.set("findReplace", js.undefined)
    
    @scala.inline
    def setRefreshDataSource(value: RefreshDataSourceResponse): Self = this.set("refreshDataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshDataSource: Self = this.set("refreshDataSource", js.undefined)
    
    @scala.inline
    def setTrimWhitespace(value: TrimWhitespaceResponse): Self = this.set("trimWhitespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrimWhitespace: Self = this.set("trimWhitespace", js.undefined)
    
    @scala.inline
    def setUpdateConditionalFormatRule(value: UpdateConditionalFormatRuleResponse): Self = this.set("updateConditionalFormatRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateConditionalFormatRule: Self = this.set("updateConditionalFormatRule", js.undefined)
    
    @scala.inline
    def setUpdateDataSource(value: UpdateDataSourceResponse): Self = this.set("updateDataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateDataSource: Self = this.set("updateDataSource", js.undefined)
    
    @scala.inline
    def setUpdateDeveloperMetadata(value: UpdateDeveloperMetadataResponse): Self = this.set("updateDeveloperMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateDeveloperMetadata: Self = this.set("updateDeveloperMetadata", js.undefined)
    
    @scala.inline
    def setUpdateEmbeddedObjectPosition(value: UpdateEmbeddedObjectPositionResponse): Self = this.set("updateEmbeddedObjectPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateEmbeddedObjectPosition: Self = this.set("updateEmbeddedObjectPosition", js.undefined)
  }
}
