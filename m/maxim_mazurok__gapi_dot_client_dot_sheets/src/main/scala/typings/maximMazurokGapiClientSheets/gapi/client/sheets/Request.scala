package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Request extends StObject {
  
  /** Adds a new banded range */
  var addBanding: js.UndefOr[AddBandingRequest] = js.undefined
  
  /** Adds a chart. */
  var addChart: js.UndefOr[AddChartRequest] = js.undefined
  
  /** Adds a new conditional format rule. */
  var addConditionalFormatRule: js.UndefOr[AddConditionalFormatRuleRequest] = js.undefined
  
  /** Adds a data source. */
  var addDataSource: js.UndefOr[AddDataSourceRequest] = js.undefined
  
  /** Creates a group over the specified range. */
  var addDimensionGroup: js.UndefOr[AddDimensionGroupRequest] = js.undefined
  
  /** Adds a filter view. */
  var addFilterView: js.UndefOr[AddFilterViewRequest] = js.undefined
  
  /** Adds a named range. */
  var addNamedRange: js.UndefOr[AddNamedRangeRequest] = js.undefined
  
  /** Adds a protected range. */
  var addProtectedRange: js.UndefOr[AddProtectedRangeRequest] = js.undefined
  
  /** Adds a sheet. */
  var addSheet: js.UndefOr[AddSheetRequest] = js.undefined
  
  /** Adds a slicer. */
  var addSlicer: js.UndefOr[AddSlicerRequest] = js.undefined
  
  /** Appends cells after the last row with data in a sheet. */
  var appendCells: js.UndefOr[AppendCellsRequest] = js.undefined
  
  /** Appends dimensions to the end of a sheet. */
  var appendDimension: js.UndefOr[AppendDimensionRequest] = js.undefined
  
  /** Automatically fills in more data based on existing data. */
  var autoFill: js.UndefOr[AutoFillRequest] = js.undefined
  
  /** Automatically resizes one or more dimensions based on the contents of the cells in that dimension. */
  var autoResizeDimensions: js.UndefOr[AutoResizeDimensionsRequest] = js.undefined
  
  /** Clears the basic filter on a sheet. */
  var clearBasicFilter: js.UndefOr[ClearBasicFilterRequest] = js.undefined
  
  /** Copies data from one area and pastes it to another. */
  var copyPaste: js.UndefOr[CopyPasteRequest] = js.undefined
  
  /** Creates new developer metadata */
  var createDeveloperMetadata: js.UndefOr[CreateDeveloperMetadataRequest] = js.undefined
  
  /** Cuts data from one area and pastes it to another. */
  var cutPaste: js.UndefOr[CutPasteRequest] = js.undefined
  
  /** Removes a banded range */
  var deleteBanding: js.UndefOr[DeleteBandingRequest] = js.undefined
  
  /** Deletes an existing conditional format rule. */
  var deleteConditionalFormatRule: js.UndefOr[DeleteConditionalFormatRuleRequest] = js.undefined
  
  /** Deletes a data source. */
  var deleteDataSource: js.UndefOr[DeleteDataSourceRequest] = js.undefined
  
  /** Deletes developer metadata */
  var deleteDeveloperMetadata: js.UndefOr[DeleteDeveloperMetadataRequest] = js.undefined
  
  /** Deletes rows or columns in a sheet. */
  var deleteDimension: js.UndefOr[DeleteDimensionRequest] = js.undefined
  
  /** Deletes a group over the specified range. */
  var deleteDimensionGroup: js.UndefOr[DeleteDimensionGroupRequest] = js.undefined
  
  /** Removes rows containing duplicate values in specified columns of a cell range. */
  var deleteDuplicates: js.UndefOr[DeleteDuplicatesRequest] = js.undefined
  
  /** Deletes an embedded object (e.g, chart, image) in a sheet. */
  var deleteEmbeddedObject: js.UndefOr[DeleteEmbeddedObjectRequest] = js.undefined
  
  /** Deletes a filter view from a sheet. */
  var deleteFilterView: js.UndefOr[DeleteFilterViewRequest] = js.undefined
  
  /** Deletes a named range. */
  var deleteNamedRange: js.UndefOr[DeleteNamedRangeRequest] = js.undefined
  
  /** Deletes a protected range. */
  var deleteProtectedRange: js.UndefOr[DeleteProtectedRangeRequest] = js.undefined
  
  /** Deletes a range of cells from a sheet, shifting the remaining cells. */
  var deleteRange: js.UndefOr[DeleteRangeRequest] = js.undefined
  
  /** Deletes a sheet. */
  var deleteSheet: js.UndefOr[DeleteSheetRequest] = js.undefined
  
  /** Duplicates a filter view. */
  var duplicateFilterView: js.UndefOr[DuplicateFilterViewRequest] = js.undefined
  
  /** Duplicates a sheet. */
  var duplicateSheet: js.UndefOr[DuplicateSheetRequest] = js.undefined
  
  /** Finds and replaces occurrences of some text with other text. */
  var findReplace: js.UndefOr[FindReplaceRequest] = js.undefined
  
  /** Inserts new rows or columns in a sheet. */
  var insertDimension: js.UndefOr[InsertDimensionRequest] = js.undefined
  
  /** Inserts new cells in a sheet, shifting the existing cells. */
  var insertRange: js.UndefOr[InsertRangeRequest] = js.undefined
  
  /** Merges cells together. */
  var mergeCells: js.UndefOr[MergeCellsRequest] = js.undefined
  
  /** Moves rows or columns to another location in a sheet. */
  var moveDimension: js.UndefOr[MoveDimensionRequest] = js.undefined
  
  /** Pastes data (HTML or delimited) into a sheet. */
  var pasteData: js.UndefOr[PasteDataRequest] = js.undefined
  
  /** Randomizes the order of the rows in a range. */
  var randomizeRange: js.UndefOr[RandomizeRangeRequest] = js.undefined
  
  /** Refreshs one or multiple data sources and associated dbobjects. */
  var refreshDataSource: js.UndefOr[RefreshDataSourceRequest] = js.undefined
  
  /** Repeats a single cell across a range. */
  var repeatCell: js.UndefOr[RepeatCellRequest] = js.undefined
  
  /** Sets the basic filter on a sheet. */
  var setBasicFilter: js.UndefOr[SetBasicFilterRequest] = js.undefined
  
  /** Sets data validation for one or more cells. */
  var setDataValidation: js.UndefOr[SetDataValidationRequest] = js.undefined
  
  /** Sorts data in a range. */
  var sortRange: js.UndefOr[SortRangeRequest] = js.undefined
  
  /** Converts a column of text into many columns of text. */
  var textToColumns: js.UndefOr[TextToColumnsRequest] = js.undefined
  
  /** Trims cells of whitespace (such as spaces, tabs, or new lines). */
  var trimWhitespace: js.UndefOr[TrimWhitespaceRequest] = js.undefined
  
  /** Unmerges merged cells. */
  var unmergeCells: js.UndefOr[UnmergeCellsRequest] = js.undefined
  
  /** Updates a banded range */
  var updateBanding: js.UndefOr[UpdateBandingRequest] = js.undefined
  
  /** Updates the borders in a range of cells. */
  var updateBorders: js.UndefOr[UpdateBordersRequest] = js.undefined
  
  /** Updates many cells at once. */
  var updateCells: js.UndefOr[UpdateCellsRequest] = js.undefined
  
  /** Updates a chart's specifications. */
  var updateChartSpec: js.UndefOr[UpdateChartSpecRequest] = js.undefined
  
  /** Updates an existing conditional format rule. */
  var updateConditionalFormatRule: js.UndefOr[UpdateConditionalFormatRuleRequest] = js.undefined
  
  /** Updates a data source. */
  var updateDataSource: js.UndefOr[UpdateDataSourceRequest] = js.undefined
  
  /** Updates an existing developer metadata entry */
  var updateDeveloperMetadata: js.UndefOr[UpdateDeveloperMetadataRequest] = js.undefined
  
  /** Updates the state of the specified group. */
  var updateDimensionGroup: js.UndefOr[UpdateDimensionGroupRequest] = js.undefined
  
  /** Updates dimensions' properties. */
  var updateDimensionProperties: js.UndefOr[UpdateDimensionPropertiesRequest] = js.undefined
  
  /** Updates an embedded object's (e.g. chart, image) position. */
  var updateEmbeddedObjectPosition: js.UndefOr[UpdateEmbeddedObjectPositionRequest] = js.undefined
  
  /** Updates the properties of a filter view. */
  var updateFilterView: js.UndefOr[UpdateFilterViewRequest] = js.undefined
  
  /** Updates a named range. */
  var updateNamedRange: js.UndefOr[UpdateNamedRangeRequest] = js.undefined
  
  /** Updates a protected range. */
  var updateProtectedRange: js.UndefOr[UpdateProtectedRangeRequest] = js.undefined
  
  /** Updates a sheet's properties. */
  var updateSheetProperties: js.UndefOr[UpdateSheetPropertiesRequest] = js.undefined
  
  /** Updates a slicer's specifications. */
  var updateSlicerSpec: js.UndefOr[UpdateSlicerSpecRequest] = js.undefined
  
  /** Updates the spreadsheet's properties. */
  var updateSpreadsheetProperties: js.UndefOr[UpdateSpreadsheetPropertiesRequest] = js.undefined
}
object Request {
  
  @scala.inline
  def apply(): Request = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Request]
  }
  
  @scala.inline
  implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddBanding(value: AddBandingRequest): Self = StObject.set(x, "addBanding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddBandingUndefined: Self = StObject.set(x, "addBanding", js.undefined)
    
    @scala.inline
    def setAddChart(value: AddChartRequest): Self = StObject.set(x, "addChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddChartUndefined: Self = StObject.set(x, "addChart", js.undefined)
    
    @scala.inline
    def setAddConditionalFormatRule(value: AddConditionalFormatRuleRequest): Self = StObject.set(x, "addConditionalFormatRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddConditionalFormatRuleUndefined: Self = StObject.set(x, "addConditionalFormatRule", js.undefined)
    
    @scala.inline
    def setAddDataSource(value: AddDataSourceRequest): Self = StObject.set(x, "addDataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddDataSourceUndefined: Self = StObject.set(x, "addDataSource", js.undefined)
    
    @scala.inline
    def setAddDimensionGroup(value: AddDimensionGroupRequest): Self = StObject.set(x, "addDimensionGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddDimensionGroupUndefined: Self = StObject.set(x, "addDimensionGroup", js.undefined)
    
    @scala.inline
    def setAddFilterView(value: AddFilterViewRequest): Self = StObject.set(x, "addFilterView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddFilterViewUndefined: Self = StObject.set(x, "addFilterView", js.undefined)
    
    @scala.inline
    def setAddNamedRange(value: AddNamedRangeRequest): Self = StObject.set(x, "addNamedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddNamedRangeUndefined: Self = StObject.set(x, "addNamedRange", js.undefined)
    
    @scala.inline
    def setAddProtectedRange(value: AddProtectedRangeRequest): Self = StObject.set(x, "addProtectedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddProtectedRangeUndefined: Self = StObject.set(x, "addProtectedRange", js.undefined)
    
    @scala.inline
    def setAddSheet(value: AddSheetRequest): Self = StObject.set(x, "addSheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddSheetUndefined: Self = StObject.set(x, "addSheet", js.undefined)
    
    @scala.inline
    def setAddSlicer(value: AddSlicerRequest): Self = StObject.set(x, "addSlicer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddSlicerUndefined: Self = StObject.set(x, "addSlicer", js.undefined)
    
    @scala.inline
    def setAppendCells(value: AppendCellsRequest): Self = StObject.set(x, "appendCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppendCellsUndefined: Self = StObject.set(x, "appendCells", js.undefined)
    
    @scala.inline
    def setAppendDimension(value: AppendDimensionRequest): Self = StObject.set(x, "appendDimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppendDimensionUndefined: Self = StObject.set(x, "appendDimension", js.undefined)
    
    @scala.inline
    def setAutoFill(value: AutoFillRequest): Self = StObject.set(x, "autoFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFillUndefined: Self = StObject.set(x, "autoFill", js.undefined)
    
    @scala.inline
    def setAutoResizeDimensions(value: AutoResizeDimensionsRequest): Self = StObject.set(x, "autoResizeDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoResizeDimensionsUndefined: Self = StObject.set(x, "autoResizeDimensions", js.undefined)
    
    @scala.inline
    def setClearBasicFilter(value: ClearBasicFilterRequest): Self = StObject.set(x, "clearBasicFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearBasicFilterUndefined: Self = StObject.set(x, "clearBasicFilter", js.undefined)
    
    @scala.inline
    def setCopyPaste(value: CopyPasteRequest): Self = StObject.set(x, "copyPaste", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyPasteUndefined: Self = StObject.set(x, "copyPaste", js.undefined)
    
    @scala.inline
    def setCreateDeveloperMetadata(value: CreateDeveloperMetadataRequest): Self = StObject.set(x, "createDeveloperMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateDeveloperMetadataUndefined: Self = StObject.set(x, "createDeveloperMetadata", js.undefined)
    
    @scala.inline
    def setCutPaste(value: CutPasteRequest): Self = StObject.set(x, "cutPaste", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCutPasteUndefined: Self = StObject.set(x, "cutPaste", js.undefined)
    
    @scala.inline
    def setDeleteBanding(value: DeleteBandingRequest): Self = StObject.set(x, "deleteBanding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteBandingUndefined: Self = StObject.set(x, "deleteBanding", js.undefined)
    
    @scala.inline
    def setDeleteConditionalFormatRule(value: DeleteConditionalFormatRuleRequest): Self = StObject.set(x, "deleteConditionalFormatRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteConditionalFormatRuleUndefined: Self = StObject.set(x, "deleteConditionalFormatRule", js.undefined)
    
    @scala.inline
    def setDeleteDataSource(value: DeleteDataSourceRequest): Self = StObject.set(x, "deleteDataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteDataSourceUndefined: Self = StObject.set(x, "deleteDataSource", js.undefined)
    
    @scala.inline
    def setDeleteDeveloperMetadata(value: DeleteDeveloperMetadataRequest): Self = StObject.set(x, "deleteDeveloperMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteDeveloperMetadataUndefined: Self = StObject.set(x, "deleteDeveloperMetadata", js.undefined)
    
    @scala.inline
    def setDeleteDimension(value: DeleteDimensionRequest): Self = StObject.set(x, "deleteDimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteDimensionGroup(value: DeleteDimensionGroupRequest): Self = StObject.set(x, "deleteDimensionGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteDimensionGroupUndefined: Self = StObject.set(x, "deleteDimensionGroup", js.undefined)
    
    @scala.inline
    def setDeleteDimensionUndefined: Self = StObject.set(x, "deleteDimension", js.undefined)
    
    @scala.inline
    def setDeleteDuplicates(value: DeleteDuplicatesRequest): Self = StObject.set(x, "deleteDuplicates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteDuplicatesUndefined: Self = StObject.set(x, "deleteDuplicates", js.undefined)
    
    @scala.inline
    def setDeleteEmbeddedObject(value: DeleteEmbeddedObjectRequest): Self = StObject.set(x, "deleteEmbeddedObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteEmbeddedObjectUndefined: Self = StObject.set(x, "deleteEmbeddedObject", js.undefined)
    
    @scala.inline
    def setDeleteFilterView(value: DeleteFilterViewRequest): Self = StObject.set(x, "deleteFilterView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteFilterViewUndefined: Self = StObject.set(x, "deleteFilterView", js.undefined)
    
    @scala.inline
    def setDeleteNamedRange(value: DeleteNamedRangeRequest): Self = StObject.set(x, "deleteNamedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteNamedRangeUndefined: Self = StObject.set(x, "deleteNamedRange", js.undefined)
    
    @scala.inline
    def setDeleteProtectedRange(value: DeleteProtectedRangeRequest): Self = StObject.set(x, "deleteProtectedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteProtectedRangeUndefined: Self = StObject.set(x, "deleteProtectedRange", js.undefined)
    
    @scala.inline
    def setDeleteRange(value: DeleteRangeRequest): Self = StObject.set(x, "deleteRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteRangeUndefined: Self = StObject.set(x, "deleteRange", js.undefined)
    
    @scala.inline
    def setDeleteSheet(value: DeleteSheetRequest): Self = StObject.set(x, "deleteSheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteSheetUndefined: Self = StObject.set(x, "deleteSheet", js.undefined)
    
    @scala.inline
    def setDuplicateFilterView(value: DuplicateFilterViewRequest): Self = StObject.set(x, "duplicateFilterView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuplicateFilterViewUndefined: Self = StObject.set(x, "duplicateFilterView", js.undefined)
    
    @scala.inline
    def setDuplicateSheet(value: DuplicateSheetRequest): Self = StObject.set(x, "duplicateSheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuplicateSheetUndefined: Self = StObject.set(x, "duplicateSheet", js.undefined)
    
    @scala.inline
    def setFindReplace(value: FindReplaceRequest): Self = StObject.set(x, "findReplace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindReplaceUndefined: Self = StObject.set(x, "findReplace", js.undefined)
    
    @scala.inline
    def setInsertDimension(value: InsertDimensionRequest): Self = StObject.set(x, "insertDimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertDimensionUndefined: Self = StObject.set(x, "insertDimension", js.undefined)
    
    @scala.inline
    def setInsertRange(value: InsertRangeRequest): Self = StObject.set(x, "insertRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertRangeUndefined: Self = StObject.set(x, "insertRange", js.undefined)
    
    @scala.inline
    def setMergeCells(value: MergeCellsRequest): Self = StObject.set(x, "mergeCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeCellsUndefined: Self = StObject.set(x, "mergeCells", js.undefined)
    
    @scala.inline
    def setMoveDimension(value: MoveDimensionRequest): Self = StObject.set(x, "moveDimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveDimensionUndefined: Self = StObject.set(x, "moveDimension", js.undefined)
    
    @scala.inline
    def setPasteData(value: PasteDataRequest): Self = StObject.set(x, "pasteData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasteDataUndefined: Self = StObject.set(x, "pasteData", js.undefined)
    
    @scala.inline
    def setRandomizeRange(value: RandomizeRangeRequest): Self = StObject.set(x, "randomizeRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRandomizeRangeUndefined: Self = StObject.set(x, "randomizeRange", js.undefined)
    
    @scala.inline
    def setRefreshDataSource(value: RefreshDataSourceRequest): Self = StObject.set(x, "refreshDataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshDataSourceUndefined: Self = StObject.set(x, "refreshDataSource", js.undefined)
    
    @scala.inline
    def setRepeatCell(value: RepeatCellRequest): Self = StObject.set(x, "repeatCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatCellUndefined: Self = StObject.set(x, "repeatCell", js.undefined)
    
    @scala.inline
    def setSetBasicFilter(value: SetBasicFilterRequest): Self = StObject.set(x, "setBasicFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetBasicFilterUndefined: Self = StObject.set(x, "setBasicFilter", js.undefined)
    
    @scala.inline
    def setSetDataValidation(value: SetDataValidationRequest): Self = StObject.set(x, "setDataValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetDataValidationUndefined: Self = StObject.set(x, "setDataValidation", js.undefined)
    
    @scala.inline
    def setSortRange(value: SortRangeRequest): Self = StObject.set(x, "sortRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortRangeUndefined: Self = StObject.set(x, "sortRange", js.undefined)
    
    @scala.inline
    def setTextToColumns(value: TextToColumnsRequest): Self = StObject.set(x, "textToColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextToColumnsUndefined: Self = StObject.set(x, "textToColumns", js.undefined)
    
    @scala.inline
    def setTrimWhitespace(value: TrimWhitespaceRequest): Self = StObject.set(x, "trimWhitespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrimWhitespaceUndefined: Self = StObject.set(x, "trimWhitespace", js.undefined)
    
    @scala.inline
    def setUnmergeCells(value: UnmergeCellsRequest): Self = StObject.set(x, "unmergeCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnmergeCellsUndefined: Self = StObject.set(x, "unmergeCells", js.undefined)
    
    @scala.inline
    def setUpdateBanding(value: UpdateBandingRequest): Self = StObject.set(x, "updateBanding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateBandingUndefined: Self = StObject.set(x, "updateBanding", js.undefined)
    
    @scala.inline
    def setUpdateBorders(value: UpdateBordersRequest): Self = StObject.set(x, "updateBorders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateBordersUndefined: Self = StObject.set(x, "updateBorders", js.undefined)
    
    @scala.inline
    def setUpdateCells(value: UpdateCellsRequest): Self = StObject.set(x, "updateCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateCellsUndefined: Self = StObject.set(x, "updateCells", js.undefined)
    
    @scala.inline
    def setUpdateChartSpec(value: UpdateChartSpecRequest): Self = StObject.set(x, "updateChartSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateChartSpecUndefined: Self = StObject.set(x, "updateChartSpec", js.undefined)
    
    @scala.inline
    def setUpdateConditionalFormatRule(value: UpdateConditionalFormatRuleRequest): Self = StObject.set(x, "updateConditionalFormatRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateConditionalFormatRuleUndefined: Self = StObject.set(x, "updateConditionalFormatRule", js.undefined)
    
    @scala.inline
    def setUpdateDataSource(value: UpdateDataSourceRequest): Self = StObject.set(x, "updateDataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateDataSourceUndefined: Self = StObject.set(x, "updateDataSource", js.undefined)
    
    @scala.inline
    def setUpdateDeveloperMetadata(value: UpdateDeveloperMetadataRequest): Self = StObject.set(x, "updateDeveloperMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateDeveloperMetadataUndefined: Self = StObject.set(x, "updateDeveloperMetadata", js.undefined)
    
    @scala.inline
    def setUpdateDimensionGroup(value: UpdateDimensionGroupRequest): Self = StObject.set(x, "updateDimensionGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateDimensionGroupUndefined: Self = StObject.set(x, "updateDimensionGroup", js.undefined)
    
    @scala.inline
    def setUpdateDimensionProperties(value: UpdateDimensionPropertiesRequest): Self = StObject.set(x, "updateDimensionProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateDimensionPropertiesUndefined: Self = StObject.set(x, "updateDimensionProperties", js.undefined)
    
    @scala.inline
    def setUpdateEmbeddedObjectPosition(value: UpdateEmbeddedObjectPositionRequest): Self = StObject.set(x, "updateEmbeddedObjectPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateEmbeddedObjectPositionUndefined: Self = StObject.set(x, "updateEmbeddedObjectPosition", js.undefined)
    
    @scala.inline
    def setUpdateFilterView(value: UpdateFilterViewRequest): Self = StObject.set(x, "updateFilterView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateFilterViewUndefined: Self = StObject.set(x, "updateFilterView", js.undefined)
    
    @scala.inline
    def setUpdateNamedRange(value: UpdateNamedRangeRequest): Self = StObject.set(x, "updateNamedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateNamedRangeUndefined: Self = StObject.set(x, "updateNamedRange", js.undefined)
    
    @scala.inline
    def setUpdateProtectedRange(value: UpdateProtectedRangeRequest): Self = StObject.set(x, "updateProtectedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateProtectedRangeUndefined: Self = StObject.set(x, "updateProtectedRange", js.undefined)
    
    @scala.inline
    def setUpdateSheetProperties(value: UpdateSheetPropertiesRequest): Self = StObject.set(x, "updateSheetProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateSheetPropertiesUndefined: Self = StObject.set(x, "updateSheetProperties", js.undefined)
    
    @scala.inline
    def setUpdateSlicerSpec(value: UpdateSlicerSpecRequest): Self = StObject.set(x, "updateSlicerSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateSlicerSpecUndefined: Self = StObject.set(x, "updateSlicerSpec", js.undefined)
    
    @scala.inline
    def setUpdateSpreadsheetProperties(value: UpdateSpreadsheetPropertiesRequest): Self = StObject.set(x, "updateSpreadsheetProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateSpreadsheetPropertiesUndefined: Self = StObject.set(x, "updateSpreadsheetProperties", js.undefined)
  }
}
