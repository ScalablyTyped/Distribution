package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Request extends StObject {
  
  /** Creates an image. */
  var createImage: js.UndefOr[CreateImageRequest] = js.native
  
  /** Creates a line. */
  var createLine: js.UndefOr[CreateLineRequest] = js.native
  
  /** Creates bullets for paragraphs. */
  var createParagraphBullets: js.UndefOr[CreateParagraphBulletsRequest] = js.native
  
  /** Creates a new shape. */
  var createShape: js.UndefOr[CreateShapeRequest] = js.native
  
  /** Creates an embedded Google Sheets chart. */
  var createSheetsChart: js.UndefOr[CreateSheetsChartRequest] = js.native
  
  /** Creates a new slide. */
  var createSlide: js.UndefOr[CreateSlideRequest] = js.native
  
  /** Creates a new table. */
  var createTable: js.UndefOr[CreateTableRequest] = js.native
  
  /** Creates a video. */
  var createVideo: js.UndefOr[CreateVideoRequest] = js.native
  
  /** Deletes a page or page element from the presentation. */
  var deleteObject: js.UndefOr[DeleteObjectRequest] = js.native
  
  /** Deletes bullets from paragraphs. */
  var deleteParagraphBullets: js.UndefOr[DeleteParagraphBulletsRequest] = js.native
  
  /** Deletes a column from a table. */
  var deleteTableColumn: js.UndefOr[DeleteTableColumnRequest] = js.native
  
  /** Deletes a row from a table. */
  var deleteTableRow: js.UndefOr[DeleteTableRowRequest] = js.native
  
  /** Deletes text from a shape or a table cell. */
  var deleteText: js.UndefOr[DeleteTextRequest] = js.native
  
  /** Duplicates a slide or page element. */
  var duplicateObject: js.UndefOr[DuplicateObjectRequest] = js.native
  
  /** Groups objects, such as page elements. */
  var groupObjects: js.UndefOr[GroupObjectsRequest] = js.native
  
  /** Inserts columns into a table. */
  var insertTableColumns: js.UndefOr[InsertTableColumnsRequest] = js.native
  
  /** Inserts rows into a table. */
  var insertTableRows: js.UndefOr[InsertTableRowsRequest] = js.native
  
  /** Inserts text into a shape or table cell. */
  var insertText: js.UndefOr[InsertTextRequest] = js.native
  
  /** Merges cells in a Table. */
  var mergeTableCells: js.UndefOr[MergeTableCellsRequest] = js.native
  
  /** Refreshes a Google Sheets chart. */
  var refreshSheetsChart: js.UndefOr[RefreshSheetsChartRequest] = js.native
  
  /** Replaces all shapes matching some criteria with an image. */
  var replaceAllShapesWithImage: js.UndefOr[ReplaceAllShapesWithImageRequest] = js.native
  
  /** Replaces all shapes matching some criteria with a Google Sheets chart. */
  var replaceAllShapesWithSheetsChart: js.UndefOr[ReplaceAllShapesWithSheetsChartRequest] = js.native
  
  /** Replaces all instances of specified text. */
  var replaceAllText: js.UndefOr[ReplaceAllTextRequest] = js.native
  
  /** Replaces an existing image with a new image. */
  var replaceImage: js.UndefOr[ReplaceImageRequest] = js.native
  
  /** Reroutes a line such that it's connected at the two closest connection sites on the connected page elements. */
  var rerouteLine: js.UndefOr[RerouteLineRequest] = js.native
  
  /** Ungroups objects, such as groups. */
  var ungroupObjects: js.UndefOr[UngroupObjectsRequest] = js.native
  
  /** Unmerges cells in a Table. */
  var unmergeTableCells: js.UndefOr[UnmergeTableCellsRequest] = js.native
  
  /** Updates the properties of an Image. */
  var updateImageProperties: js.UndefOr[UpdateImagePropertiesRequest] = js.native
  
  /** Updates the category of a line. */
  var updateLineCategory: js.UndefOr[UpdateLineCategoryRequest] = js.native
  
  /** Updates the properties of a Line. */
  var updateLineProperties: js.UndefOr[UpdateLinePropertiesRequest] = js.native
  
  /** Updates the alt text title and/or description of a page element. */
  var updatePageElementAltText: js.UndefOr[UpdatePageElementAltTextRequest] = js.native
  
  /** Updates the transform of a page element. */
  var updatePageElementTransform: js.UndefOr[UpdatePageElementTransformRequest] = js.native
  
  /** Updates the Z-order of page elements. */
  var updatePageElementsZOrder: js.UndefOr[UpdatePageElementsZOrderRequest] = js.native
  
  /** Updates the properties of a Page. */
  var updatePageProperties: js.UndefOr[UpdatePagePropertiesRequest] = js.native
  
  /** Updates the styling of paragraphs within a Shape or Table. */
  var updateParagraphStyle: js.UndefOr[UpdateParagraphStyleRequest] = js.native
  
  /** Updates the properties of a Shape. */
  var updateShapeProperties: js.UndefOr[UpdateShapePropertiesRequest] = js.native
  
  /** Updates the position of a set of slides in the presentation. */
  var updateSlidesPosition: js.UndefOr[UpdateSlidesPositionRequest] = js.native
  
  /** Updates the properties of the table borders in a Table. */
  var updateTableBorderProperties: js.UndefOr[UpdateTableBorderPropertiesRequest] = js.native
  
  /** Updates the properties of a TableCell. */
  var updateTableCellProperties: js.UndefOr[UpdateTableCellPropertiesRequest] = js.native
  
  /** Updates the properties of a Table column. */
  var updateTableColumnProperties: js.UndefOr[UpdateTableColumnPropertiesRequest] = js.native
  
  /** Updates the properties of a Table row. */
  var updateTableRowProperties: js.UndefOr[UpdateTableRowPropertiesRequest] = js.native
  
  /** Updates the styling of text within a Shape or Table. */
  var updateTextStyle: js.UndefOr[UpdateTextStyleRequest] = js.native
  
  /** Updates the properties of a Video. */
  var updateVideoProperties: js.UndefOr[UpdateVideoPropertiesRequest] = js.native
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
    def setCreateImage(value: CreateImageRequest): Self = StObject.set(x, "createImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateImageUndefined: Self = StObject.set(x, "createImage", js.undefined)
    
    @scala.inline
    def setCreateLine(value: CreateLineRequest): Self = StObject.set(x, "createLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateLineUndefined: Self = StObject.set(x, "createLine", js.undefined)
    
    @scala.inline
    def setCreateParagraphBullets(value: CreateParagraphBulletsRequest): Self = StObject.set(x, "createParagraphBullets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateParagraphBulletsUndefined: Self = StObject.set(x, "createParagraphBullets", js.undefined)
    
    @scala.inline
    def setCreateShape(value: CreateShapeRequest): Self = StObject.set(x, "createShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateShapeUndefined: Self = StObject.set(x, "createShape", js.undefined)
    
    @scala.inline
    def setCreateSheetsChart(value: CreateSheetsChartRequest): Self = StObject.set(x, "createSheetsChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateSheetsChartUndefined: Self = StObject.set(x, "createSheetsChart", js.undefined)
    
    @scala.inline
    def setCreateSlide(value: CreateSlideRequest): Self = StObject.set(x, "createSlide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateSlideUndefined: Self = StObject.set(x, "createSlide", js.undefined)
    
    @scala.inline
    def setCreateTable(value: CreateTableRequest): Self = StObject.set(x, "createTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTableUndefined: Self = StObject.set(x, "createTable", js.undefined)
    
    @scala.inline
    def setCreateVideo(value: CreateVideoRequest): Self = StObject.set(x, "createVideo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateVideoUndefined: Self = StObject.set(x, "createVideo", js.undefined)
    
    @scala.inline
    def setDeleteObject(value: DeleteObjectRequest): Self = StObject.set(x, "deleteObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteObjectUndefined: Self = StObject.set(x, "deleteObject", js.undefined)
    
    @scala.inline
    def setDeleteParagraphBullets(value: DeleteParagraphBulletsRequest): Self = StObject.set(x, "deleteParagraphBullets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteParagraphBulletsUndefined: Self = StObject.set(x, "deleteParagraphBullets", js.undefined)
    
    @scala.inline
    def setDeleteTableColumn(value: DeleteTableColumnRequest): Self = StObject.set(x, "deleteTableColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteTableColumnUndefined: Self = StObject.set(x, "deleteTableColumn", js.undefined)
    
    @scala.inline
    def setDeleteTableRow(value: DeleteTableRowRequest): Self = StObject.set(x, "deleteTableRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteTableRowUndefined: Self = StObject.set(x, "deleteTableRow", js.undefined)
    
    @scala.inline
    def setDeleteText(value: DeleteTextRequest): Self = StObject.set(x, "deleteText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteTextUndefined: Self = StObject.set(x, "deleteText", js.undefined)
    
    @scala.inline
    def setDuplicateObject(value: DuplicateObjectRequest): Self = StObject.set(x, "duplicateObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuplicateObjectUndefined: Self = StObject.set(x, "duplicateObject", js.undefined)
    
    @scala.inline
    def setGroupObjects(value: GroupObjectsRequest): Self = StObject.set(x, "groupObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupObjectsUndefined: Self = StObject.set(x, "groupObjects", js.undefined)
    
    @scala.inline
    def setInsertTableColumns(value: InsertTableColumnsRequest): Self = StObject.set(x, "insertTableColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertTableColumnsUndefined: Self = StObject.set(x, "insertTableColumns", js.undefined)
    
    @scala.inline
    def setInsertTableRows(value: InsertTableRowsRequest): Self = StObject.set(x, "insertTableRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertTableRowsUndefined: Self = StObject.set(x, "insertTableRows", js.undefined)
    
    @scala.inline
    def setInsertText(value: InsertTextRequest): Self = StObject.set(x, "insertText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertTextUndefined: Self = StObject.set(x, "insertText", js.undefined)
    
    @scala.inline
    def setMergeTableCells(value: MergeTableCellsRequest): Self = StObject.set(x, "mergeTableCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeTableCellsUndefined: Self = StObject.set(x, "mergeTableCells", js.undefined)
    
    @scala.inline
    def setRefreshSheetsChart(value: RefreshSheetsChartRequest): Self = StObject.set(x, "refreshSheetsChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshSheetsChartUndefined: Self = StObject.set(x, "refreshSheetsChart", js.undefined)
    
    @scala.inline
    def setReplaceAllShapesWithImage(value: ReplaceAllShapesWithImageRequest): Self = StObject.set(x, "replaceAllShapesWithImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceAllShapesWithImageUndefined: Self = StObject.set(x, "replaceAllShapesWithImage", js.undefined)
    
    @scala.inline
    def setReplaceAllShapesWithSheetsChart(value: ReplaceAllShapesWithSheetsChartRequest): Self = StObject.set(x, "replaceAllShapesWithSheetsChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceAllShapesWithSheetsChartUndefined: Self = StObject.set(x, "replaceAllShapesWithSheetsChart", js.undefined)
    
    @scala.inline
    def setReplaceAllText(value: ReplaceAllTextRequest): Self = StObject.set(x, "replaceAllText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceAllTextUndefined: Self = StObject.set(x, "replaceAllText", js.undefined)
    
    @scala.inline
    def setReplaceImage(value: ReplaceImageRequest): Self = StObject.set(x, "replaceImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceImageUndefined: Self = StObject.set(x, "replaceImage", js.undefined)
    
    @scala.inline
    def setRerouteLine(value: RerouteLineRequest): Self = StObject.set(x, "rerouteLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRerouteLineUndefined: Self = StObject.set(x, "rerouteLine", js.undefined)
    
    @scala.inline
    def setUngroupObjects(value: UngroupObjectsRequest): Self = StObject.set(x, "ungroupObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUngroupObjectsUndefined: Self = StObject.set(x, "ungroupObjects", js.undefined)
    
    @scala.inline
    def setUnmergeTableCells(value: UnmergeTableCellsRequest): Self = StObject.set(x, "unmergeTableCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnmergeTableCellsUndefined: Self = StObject.set(x, "unmergeTableCells", js.undefined)
    
    @scala.inline
    def setUpdateImageProperties(value: UpdateImagePropertiesRequest): Self = StObject.set(x, "updateImageProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateImagePropertiesUndefined: Self = StObject.set(x, "updateImageProperties", js.undefined)
    
    @scala.inline
    def setUpdateLineCategory(value: UpdateLineCategoryRequest): Self = StObject.set(x, "updateLineCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateLineCategoryUndefined: Self = StObject.set(x, "updateLineCategory", js.undefined)
    
    @scala.inline
    def setUpdateLineProperties(value: UpdateLinePropertiesRequest): Self = StObject.set(x, "updateLineProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateLinePropertiesUndefined: Self = StObject.set(x, "updateLineProperties", js.undefined)
    
    @scala.inline
    def setUpdatePageElementAltText(value: UpdatePageElementAltTextRequest): Self = StObject.set(x, "updatePageElementAltText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatePageElementAltTextUndefined: Self = StObject.set(x, "updatePageElementAltText", js.undefined)
    
    @scala.inline
    def setUpdatePageElementTransform(value: UpdatePageElementTransformRequest): Self = StObject.set(x, "updatePageElementTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatePageElementTransformUndefined: Self = StObject.set(x, "updatePageElementTransform", js.undefined)
    
    @scala.inline
    def setUpdatePageElementsZOrder(value: UpdatePageElementsZOrderRequest): Self = StObject.set(x, "updatePageElementsZOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatePageElementsZOrderUndefined: Self = StObject.set(x, "updatePageElementsZOrder", js.undefined)
    
    @scala.inline
    def setUpdatePageProperties(value: UpdatePagePropertiesRequest): Self = StObject.set(x, "updatePageProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatePagePropertiesUndefined: Self = StObject.set(x, "updatePageProperties", js.undefined)
    
    @scala.inline
    def setUpdateParagraphStyle(value: UpdateParagraphStyleRequest): Self = StObject.set(x, "updateParagraphStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateParagraphStyleUndefined: Self = StObject.set(x, "updateParagraphStyle", js.undefined)
    
    @scala.inline
    def setUpdateShapeProperties(value: UpdateShapePropertiesRequest): Self = StObject.set(x, "updateShapeProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateShapePropertiesUndefined: Self = StObject.set(x, "updateShapeProperties", js.undefined)
    
    @scala.inline
    def setUpdateSlidesPosition(value: UpdateSlidesPositionRequest): Self = StObject.set(x, "updateSlidesPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateSlidesPositionUndefined: Self = StObject.set(x, "updateSlidesPosition", js.undefined)
    
    @scala.inline
    def setUpdateTableBorderProperties(value: UpdateTableBorderPropertiesRequest): Self = StObject.set(x, "updateTableBorderProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTableBorderPropertiesUndefined: Self = StObject.set(x, "updateTableBorderProperties", js.undefined)
    
    @scala.inline
    def setUpdateTableCellProperties(value: UpdateTableCellPropertiesRequest): Self = StObject.set(x, "updateTableCellProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTableCellPropertiesUndefined: Self = StObject.set(x, "updateTableCellProperties", js.undefined)
    
    @scala.inline
    def setUpdateTableColumnProperties(value: UpdateTableColumnPropertiesRequest): Self = StObject.set(x, "updateTableColumnProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTableColumnPropertiesUndefined: Self = StObject.set(x, "updateTableColumnProperties", js.undefined)
    
    @scala.inline
    def setUpdateTableRowProperties(value: UpdateTableRowPropertiesRequest): Self = StObject.set(x, "updateTableRowProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTableRowPropertiesUndefined: Self = StObject.set(x, "updateTableRowProperties", js.undefined)
    
    @scala.inline
    def setUpdateTextStyle(value: UpdateTextStyleRequest): Self = StObject.set(x, "updateTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTextStyleUndefined: Self = StObject.set(x, "updateTextStyle", js.undefined)
    
    @scala.inline
    def setUpdateVideoProperties(value: UpdateVideoPropertiesRequest): Self = StObject.set(x, "updateVideoProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateVideoPropertiesUndefined: Self = StObject.set(x, "updateVideoProperties", js.undefined)
  }
}
