package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Request extends StObject {
  
  /** Creates an image. */
  var createImage: js.UndefOr[CreateImageRequest] = js.undefined
  
  /** Creates a line. */
  var createLine: js.UndefOr[CreateLineRequest] = js.undefined
  
  /** Creates bullets for paragraphs. */
  var createParagraphBullets: js.UndefOr[CreateParagraphBulletsRequest] = js.undefined
  
  /** Creates a new shape. */
  var createShape: js.UndefOr[CreateShapeRequest] = js.undefined
  
  /** Creates an embedded Google Sheets chart. */
  var createSheetsChart: js.UndefOr[CreateSheetsChartRequest] = js.undefined
  
  /** Creates a new slide. */
  var createSlide: js.UndefOr[CreateSlideRequest] = js.undefined
  
  /** Creates a new table. */
  var createTable: js.UndefOr[CreateTableRequest] = js.undefined
  
  /** Creates a video. */
  var createVideo: js.UndefOr[CreateVideoRequest] = js.undefined
  
  /** Deletes a page or page element from the presentation. */
  var deleteObject: js.UndefOr[DeleteObjectRequest] = js.undefined
  
  /** Deletes bullets from paragraphs. */
  var deleteParagraphBullets: js.UndefOr[DeleteParagraphBulletsRequest] = js.undefined
  
  /** Deletes a column from a table. */
  var deleteTableColumn: js.UndefOr[DeleteTableColumnRequest] = js.undefined
  
  /** Deletes a row from a table. */
  var deleteTableRow: js.UndefOr[DeleteTableRowRequest] = js.undefined
  
  /** Deletes text from a shape or a table cell. */
  var deleteText: js.UndefOr[DeleteTextRequest] = js.undefined
  
  /** Duplicates a slide or page element. */
  var duplicateObject: js.UndefOr[DuplicateObjectRequest] = js.undefined
  
  /** Groups objects, such as page elements. */
  var groupObjects: js.UndefOr[GroupObjectsRequest] = js.undefined
  
  /** Inserts columns into a table. */
  var insertTableColumns: js.UndefOr[InsertTableColumnsRequest] = js.undefined
  
  /** Inserts rows into a table. */
  var insertTableRows: js.UndefOr[InsertTableRowsRequest] = js.undefined
  
  /** Inserts text into a shape or table cell. */
  var insertText: js.UndefOr[InsertTextRequest] = js.undefined
  
  /** Merges cells in a Table. */
  var mergeTableCells: js.UndefOr[MergeTableCellsRequest] = js.undefined
  
  /** Refreshes a Google Sheets chart. */
  var refreshSheetsChart: js.UndefOr[RefreshSheetsChartRequest] = js.undefined
  
  /** Replaces all shapes matching some criteria with an image. */
  var replaceAllShapesWithImage: js.UndefOr[ReplaceAllShapesWithImageRequest] = js.undefined
  
  /** Replaces all shapes matching some criteria with a Google Sheets chart. */
  var replaceAllShapesWithSheetsChart: js.UndefOr[ReplaceAllShapesWithSheetsChartRequest] = js.undefined
  
  /** Replaces all instances of specified text. */
  var replaceAllText: js.UndefOr[ReplaceAllTextRequest] = js.undefined
  
  /** Replaces an existing image with a new image. */
  var replaceImage: js.UndefOr[ReplaceImageRequest] = js.undefined
  
  /** Reroutes a line such that it's connected at the two closest connection sites on the connected page elements. */
  var rerouteLine: js.UndefOr[RerouteLineRequest] = js.undefined
  
  /** Ungroups objects, such as groups. */
  var ungroupObjects: js.UndefOr[UngroupObjectsRequest] = js.undefined
  
  /** Unmerges cells in a Table. */
  var unmergeTableCells: js.UndefOr[UnmergeTableCellsRequest] = js.undefined
  
  /** Updates the properties of an Image. */
  var updateImageProperties: js.UndefOr[UpdateImagePropertiesRequest] = js.undefined
  
  /** Updates the category of a line. */
  var updateLineCategory: js.UndefOr[UpdateLineCategoryRequest] = js.undefined
  
  /** Updates the properties of a Line. */
  var updateLineProperties: js.UndefOr[UpdateLinePropertiesRequest] = js.undefined
  
  /** Updates the alt text title and/or description of a page element. */
  var updatePageElementAltText: js.UndefOr[UpdatePageElementAltTextRequest] = js.undefined
  
  /** Updates the transform of a page element. */
  var updatePageElementTransform: js.UndefOr[UpdatePageElementTransformRequest] = js.undefined
  
  /** Updates the Z-order of page elements. */
  var updatePageElementsZOrder: js.UndefOr[UpdatePageElementsZOrderRequest] = js.undefined
  
  /** Updates the properties of a Page. */
  var updatePageProperties: js.UndefOr[UpdatePagePropertiesRequest] = js.undefined
  
  /** Updates the styling of paragraphs within a Shape or Table. */
  var updateParagraphStyle: js.UndefOr[UpdateParagraphStyleRequest] = js.undefined
  
  /** Updates the properties of a Shape. */
  var updateShapeProperties: js.UndefOr[UpdateShapePropertiesRequest] = js.undefined
  
  /** Updates the position of a set of slides in the presentation. */
  var updateSlidesPosition: js.UndefOr[UpdateSlidesPositionRequest] = js.undefined
  
  /** Updates the properties of the table borders in a Table. */
  var updateTableBorderProperties: js.UndefOr[UpdateTableBorderPropertiesRequest] = js.undefined
  
  /** Updates the properties of a TableCell. */
  var updateTableCellProperties: js.UndefOr[UpdateTableCellPropertiesRequest] = js.undefined
  
  /** Updates the properties of a Table column. */
  var updateTableColumnProperties: js.UndefOr[UpdateTableColumnPropertiesRequest] = js.undefined
  
  /** Updates the properties of a Table row. */
  var updateTableRowProperties: js.UndefOr[UpdateTableRowPropertiesRequest] = js.undefined
  
  /** Updates the styling of text within a Shape or Table. */
  var updateTextStyle: js.UndefOr[UpdateTextStyleRequest] = js.undefined
  
  /** Updates the properties of a Video. */
  var updateVideoProperties: js.UndefOr[UpdateVideoPropertiesRequest] = js.undefined
}
object Request {
  
  inline def apply(): Request = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Request]
  }
  
  extension [Self <: Request](x: Self) {
    
    inline def setCreateImage(value: CreateImageRequest): Self = StObject.set(x, "createImage", value.asInstanceOf[js.Any])
    
    inline def setCreateImageUndefined: Self = StObject.set(x, "createImage", js.undefined)
    
    inline def setCreateLine(value: CreateLineRequest): Self = StObject.set(x, "createLine", value.asInstanceOf[js.Any])
    
    inline def setCreateLineUndefined: Self = StObject.set(x, "createLine", js.undefined)
    
    inline def setCreateParagraphBullets(value: CreateParagraphBulletsRequest): Self = StObject.set(x, "createParagraphBullets", value.asInstanceOf[js.Any])
    
    inline def setCreateParagraphBulletsUndefined: Self = StObject.set(x, "createParagraphBullets", js.undefined)
    
    inline def setCreateShape(value: CreateShapeRequest): Self = StObject.set(x, "createShape", value.asInstanceOf[js.Any])
    
    inline def setCreateShapeUndefined: Self = StObject.set(x, "createShape", js.undefined)
    
    inline def setCreateSheetsChart(value: CreateSheetsChartRequest): Self = StObject.set(x, "createSheetsChart", value.asInstanceOf[js.Any])
    
    inline def setCreateSheetsChartUndefined: Self = StObject.set(x, "createSheetsChart", js.undefined)
    
    inline def setCreateSlide(value: CreateSlideRequest): Self = StObject.set(x, "createSlide", value.asInstanceOf[js.Any])
    
    inline def setCreateSlideUndefined: Self = StObject.set(x, "createSlide", js.undefined)
    
    inline def setCreateTable(value: CreateTableRequest): Self = StObject.set(x, "createTable", value.asInstanceOf[js.Any])
    
    inline def setCreateTableUndefined: Self = StObject.set(x, "createTable", js.undefined)
    
    inline def setCreateVideo(value: CreateVideoRequest): Self = StObject.set(x, "createVideo", value.asInstanceOf[js.Any])
    
    inline def setCreateVideoUndefined: Self = StObject.set(x, "createVideo", js.undefined)
    
    inline def setDeleteObject(value: DeleteObjectRequest): Self = StObject.set(x, "deleteObject", value.asInstanceOf[js.Any])
    
    inline def setDeleteObjectUndefined: Self = StObject.set(x, "deleteObject", js.undefined)
    
    inline def setDeleteParagraphBullets(value: DeleteParagraphBulletsRequest): Self = StObject.set(x, "deleteParagraphBullets", value.asInstanceOf[js.Any])
    
    inline def setDeleteParagraphBulletsUndefined: Self = StObject.set(x, "deleteParagraphBullets", js.undefined)
    
    inline def setDeleteTableColumn(value: DeleteTableColumnRequest): Self = StObject.set(x, "deleteTableColumn", value.asInstanceOf[js.Any])
    
    inline def setDeleteTableColumnUndefined: Self = StObject.set(x, "deleteTableColumn", js.undefined)
    
    inline def setDeleteTableRow(value: DeleteTableRowRequest): Self = StObject.set(x, "deleteTableRow", value.asInstanceOf[js.Any])
    
    inline def setDeleteTableRowUndefined: Self = StObject.set(x, "deleteTableRow", js.undefined)
    
    inline def setDeleteText(value: DeleteTextRequest): Self = StObject.set(x, "deleteText", value.asInstanceOf[js.Any])
    
    inline def setDeleteTextUndefined: Self = StObject.set(x, "deleteText", js.undefined)
    
    inline def setDuplicateObject(value: DuplicateObjectRequest): Self = StObject.set(x, "duplicateObject", value.asInstanceOf[js.Any])
    
    inline def setDuplicateObjectUndefined: Self = StObject.set(x, "duplicateObject", js.undefined)
    
    inline def setGroupObjects(value: GroupObjectsRequest): Self = StObject.set(x, "groupObjects", value.asInstanceOf[js.Any])
    
    inline def setGroupObjectsUndefined: Self = StObject.set(x, "groupObjects", js.undefined)
    
    inline def setInsertTableColumns(value: InsertTableColumnsRequest): Self = StObject.set(x, "insertTableColumns", value.asInstanceOf[js.Any])
    
    inline def setInsertTableColumnsUndefined: Self = StObject.set(x, "insertTableColumns", js.undefined)
    
    inline def setInsertTableRows(value: InsertTableRowsRequest): Self = StObject.set(x, "insertTableRows", value.asInstanceOf[js.Any])
    
    inline def setInsertTableRowsUndefined: Self = StObject.set(x, "insertTableRows", js.undefined)
    
    inline def setInsertText(value: InsertTextRequest): Self = StObject.set(x, "insertText", value.asInstanceOf[js.Any])
    
    inline def setInsertTextUndefined: Self = StObject.set(x, "insertText", js.undefined)
    
    inline def setMergeTableCells(value: MergeTableCellsRequest): Self = StObject.set(x, "mergeTableCells", value.asInstanceOf[js.Any])
    
    inline def setMergeTableCellsUndefined: Self = StObject.set(x, "mergeTableCells", js.undefined)
    
    inline def setRefreshSheetsChart(value: RefreshSheetsChartRequest): Self = StObject.set(x, "refreshSheetsChart", value.asInstanceOf[js.Any])
    
    inline def setRefreshSheetsChartUndefined: Self = StObject.set(x, "refreshSheetsChart", js.undefined)
    
    inline def setReplaceAllShapesWithImage(value: ReplaceAllShapesWithImageRequest): Self = StObject.set(x, "replaceAllShapesWithImage", value.asInstanceOf[js.Any])
    
    inline def setReplaceAllShapesWithImageUndefined: Self = StObject.set(x, "replaceAllShapesWithImage", js.undefined)
    
    inline def setReplaceAllShapesWithSheetsChart(value: ReplaceAllShapesWithSheetsChartRequest): Self = StObject.set(x, "replaceAllShapesWithSheetsChart", value.asInstanceOf[js.Any])
    
    inline def setReplaceAllShapesWithSheetsChartUndefined: Self = StObject.set(x, "replaceAllShapesWithSheetsChart", js.undefined)
    
    inline def setReplaceAllText(value: ReplaceAllTextRequest): Self = StObject.set(x, "replaceAllText", value.asInstanceOf[js.Any])
    
    inline def setReplaceAllTextUndefined: Self = StObject.set(x, "replaceAllText", js.undefined)
    
    inline def setReplaceImage(value: ReplaceImageRequest): Self = StObject.set(x, "replaceImage", value.asInstanceOf[js.Any])
    
    inline def setReplaceImageUndefined: Self = StObject.set(x, "replaceImage", js.undefined)
    
    inline def setRerouteLine(value: RerouteLineRequest): Self = StObject.set(x, "rerouteLine", value.asInstanceOf[js.Any])
    
    inline def setRerouteLineUndefined: Self = StObject.set(x, "rerouteLine", js.undefined)
    
    inline def setUngroupObjects(value: UngroupObjectsRequest): Self = StObject.set(x, "ungroupObjects", value.asInstanceOf[js.Any])
    
    inline def setUngroupObjectsUndefined: Self = StObject.set(x, "ungroupObjects", js.undefined)
    
    inline def setUnmergeTableCells(value: UnmergeTableCellsRequest): Self = StObject.set(x, "unmergeTableCells", value.asInstanceOf[js.Any])
    
    inline def setUnmergeTableCellsUndefined: Self = StObject.set(x, "unmergeTableCells", js.undefined)
    
    inline def setUpdateImageProperties(value: UpdateImagePropertiesRequest): Self = StObject.set(x, "updateImageProperties", value.asInstanceOf[js.Any])
    
    inline def setUpdateImagePropertiesUndefined: Self = StObject.set(x, "updateImageProperties", js.undefined)
    
    inline def setUpdateLineCategory(value: UpdateLineCategoryRequest): Self = StObject.set(x, "updateLineCategory", value.asInstanceOf[js.Any])
    
    inline def setUpdateLineCategoryUndefined: Self = StObject.set(x, "updateLineCategory", js.undefined)
    
    inline def setUpdateLineProperties(value: UpdateLinePropertiesRequest): Self = StObject.set(x, "updateLineProperties", value.asInstanceOf[js.Any])
    
    inline def setUpdateLinePropertiesUndefined: Self = StObject.set(x, "updateLineProperties", js.undefined)
    
    inline def setUpdatePageElementAltText(value: UpdatePageElementAltTextRequest): Self = StObject.set(x, "updatePageElementAltText", value.asInstanceOf[js.Any])
    
    inline def setUpdatePageElementAltTextUndefined: Self = StObject.set(x, "updatePageElementAltText", js.undefined)
    
    inline def setUpdatePageElementTransform(value: UpdatePageElementTransformRequest): Self = StObject.set(x, "updatePageElementTransform", value.asInstanceOf[js.Any])
    
    inline def setUpdatePageElementTransformUndefined: Self = StObject.set(x, "updatePageElementTransform", js.undefined)
    
    inline def setUpdatePageElementsZOrder(value: UpdatePageElementsZOrderRequest): Self = StObject.set(x, "updatePageElementsZOrder", value.asInstanceOf[js.Any])
    
    inline def setUpdatePageElementsZOrderUndefined: Self = StObject.set(x, "updatePageElementsZOrder", js.undefined)
    
    inline def setUpdatePageProperties(value: UpdatePagePropertiesRequest): Self = StObject.set(x, "updatePageProperties", value.asInstanceOf[js.Any])
    
    inline def setUpdatePagePropertiesUndefined: Self = StObject.set(x, "updatePageProperties", js.undefined)
    
    inline def setUpdateParagraphStyle(value: UpdateParagraphStyleRequest): Self = StObject.set(x, "updateParagraphStyle", value.asInstanceOf[js.Any])
    
    inline def setUpdateParagraphStyleUndefined: Self = StObject.set(x, "updateParagraphStyle", js.undefined)
    
    inline def setUpdateShapeProperties(value: UpdateShapePropertiesRequest): Self = StObject.set(x, "updateShapeProperties", value.asInstanceOf[js.Any])
    
    inline def setUpdateShapePropertiesUndefined: Self = StObject.set(x, "updateShapeProperties", js.undefined)
    
    inline def setUpdateSlidesPosition(value: UpdateSlidesPositionRequest): Self = StObject.set(x, "updateSlidesPosition", value.asInstanceOf[js.Any])
    
    inline def setUpdateSlidesPositionUndefined: Self = StObject.set(x, "updateSlidesPosition", js.undefined)
    
    inline def setUpdateTableBorderProperties(value: UpdateTableBorderPropertiesRequest): Self = StObject.set(x, "updateTableBorderProperties", value.asInstanceOf[js.Any])
    
    inline def setUpdateTableBorderPropertiesUndefined: Self = StObject.set(x, "updateTableBorderProperties", js.undefined)
    
    inline def setUpdateTableCellProperties(value: UpdateTableCellPropertiesRequest): Self = StObject.set(x, "updateTableCellProperties", value.asInstanceOf[js.Any])
    
    inline def setUpdateTableCellPropertiesUndefined: Self = StObject.set(x, "updateTableCellProperties", js.undefined)
    
    inline def setUpdateTableColumnProperties(value: UpdateTableColumnPropertiesRequest): Self = StObject.set(x, "updateTableColumnProperties", value.asInstanceOf[js.Any])
    
    inline def setUpdateTableColumnPropertiesUndefined: Self = StObject.set(x, "updateTableColumnProperties", js.undefined)
    
    inline def setUpdateTableRowProperties(value: UpdateTableRowPropertiesRequest): Self = StObject.set(x, "updateTableRowProperties", value.asInstanceOf[js.Any])
    
    inline def setUpdateTableRowPropertiesUndefined: Self = StObject.set(x, "updateTableRowProperties", js.undefined)
    
    inline def setUpdateTextStyle(value: UpdateTextStyleRequest): Self = StObject.set(x, "updateTextStyle", value.asInstanceOf[js.Any])
    
    inline def setUpdateTextStyleUndefined: Self = StObject.set(x, "updateTextStyle", js.undefined)
    
    inline def setUpdateVideoProperties(value: UpdateVideoPropertiesRequest): Self = StObject.set(x, "updateVideoProperties", value.asInstanceOf[js.Any])
    
    inline def setUpdateVideoPropertiesUndefined: Self = StObject.set(x, "updateVideoProperties", js.undefined)
  }
}
