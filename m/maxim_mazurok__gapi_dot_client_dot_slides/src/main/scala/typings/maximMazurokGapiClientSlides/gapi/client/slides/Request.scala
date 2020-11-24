package typings.maximMazurokGapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Request extends js.Object {
  
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
  implicit class RequestOps[Self <: Request] (val x: Self) extends AnyVal {
    
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
    def setCreateImage(value: CreateImageRequest): Self = this.set("createImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateImage: Self = this.set("createImage", js.undefined)
    
    @scala.inline
    def setCreateLine(value: CreateLineRequest): Self = this.set("createLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateLine: Self = this.set("createLine", js.undefined)
    
    @scala.inline
    def setCreateParagraphBullets(value: CreateParagraphBulletsRequest): Self = this.set("createParagraphBullets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateParagraphBullets: Self = this.set("createParagraphBullets", js.undefined)
    
    @scala.inline
    def setCreateShape(value: CreateShapeRequest): Self = this.set("createShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateShape: Self = this.set("createShape", js.undefined)
    
    @scala.inline
    def setCreateSheetsChart(value: CreateSheetsChartRequest): Self = this.set("createSheetsChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateSheetsChart: Self = this.set("createSheetsChart", js.undefined)
    
    @scala.inline
    def setCreateSlide(value: CreateSlideRequest): Self = this.set("createSlide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateSlide: Self = this.set("createSlide", js.undefined)
    
    @scala.inline
    def setCreateTable(value: CreateTableRequest): Self = this.set("createTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTable: Self = this.set("createTable", js.undefined)
    
    @scala.inline
    def setCreateVideo(value: CreateVideoRequest): Self = this.set("createVideo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateVideo: Self = this.set("createVideo", js.undefined)
    
    @scala.inline
    def setDeleteObject(value: DeleteObjectRequest): Self = this.set("deleteObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteObject: Self = this.set("deleteObject", js.undefined)
    
    @scala.inline
    def setDeleteParagraphBullets(value: DeleteParagraphBulletsRequest): Self = this.set("deleteParagraphBullets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteParagraphBullets: Self = this.set("deleteParagraphBullets", js.undefined)
    
    @scala.inline
    def setDeleteTableColumn(value: DeleteTableColumnRequest): Self = this.set("deleteTableColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteTableColumn: Self = this.set("deleteTableColumn", js.undefined)
    
    @scala.inline
    def setDeleteTableRow(value: DeleteTableRowRequest): Self = this.set("deleteTableRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteTableRow: Self = this.set("deleteTableRow", js.undefined)
    
    @scala.inline
    def setDeleteText(value: DeleteTextRequest): Self = this.set("deleteText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteText: Self = this.set("deleteText", js.undefined)
    
    @scala.inline
    def setDuplicateObject(value: DuplicateObjectRequest): Self = this.set("duplicateObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuplicateObject: Self = this.set("duplicateObject", js.undefined)
    
    @scala.inline
    def setGroupObjects(value: GroupObjectsRequest): Self = this.set("groupObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupObjects: Self = this.set("groupObjects", js.undefined)
    
    @scala.inline
    def setInsertTableColumns(value: InsertTableColumnsRequest): Self = this.set("insertTableColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertTableColumns: Self = this.set("insertTableColumns", js.undefined)
    
    @scala.inline
    def setInsertTableRows(value: InsertTableRowsRequest): Self = this.set("insertTableRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertTableRows: Self = this.set("insertTableRows", js.undefined)
    
    @scala.inline
    def setInsertText(value: InsertTextRequest): Self = this.set("insertText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertText: Self = this.set("insertText", js.undefined)
    
    @scala.inline
    def setMergeTableCells(value: MergeTableCellsRequest): Self = this.set("mergeTableCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMergeTableCells: Self = this.set("mergeTableCells", js.undefined)
    
    @scala.inline
    def setRefreshSheetsChart(value: RefreshSheetsChartRequest): Self = this.set("refreshSheetsChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshSheetsChart: Self = this.set("refreshSheetsChart", js.undefined)
    
    @scala.inline
    def setReplaceAllShapesWithImage(value: ReplaceAllShapesWithImageRequest): Self = this.set("replaceAllShapesWithImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplaceAllShapesWithImage: Self = this.set("replaceAllShapesWithImage", js.undefined)
    
    @scala.inline
    def setReplaceAllShapesWithSheetsChart(value: ReplaceAllShapesWithSheetsChartRequest): Self = this.set("replaceAllShapesWithSheetsChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplaceAllShapesWithSheetsChart: Self = this.set("replaceAllShapesWithSheetsChart", js.undefined)
    
    @scala.inline
    def setReplaceAllText(value: ReplaceAllTextRequest): Self = this.set("replaceAllText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplaceAllText: Self = this.set("replaceAllText", js.undefined)
    
    @scala.inline
    def setReplaceImage(value: ReplaceImageRequest): Self = this.set("replaceImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplaceImage: Self = this.set("replaceImage", js.undefined)
    
    @scala.inline
    def setRerouteLine(value: RerouteLineRequest): Self = this.set("rerouteLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRerouteLine: Self = this.set("rerouteLine", js.undefined)
    
    @scala.inline
    def setUngroupObjects(value: UngroupObjectsRequest): Self = this.set("ungroupObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUngroupObjects: Self = this.set("ungroupObjects", js.undefined)
    
    @scala.inline
    def setUnmergeTableCells(value: UnmergeTableCellsRequest): Self = this.set("unmergeTableCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnmergeTableCells: Self = this.set("unmergeTableCells", js.undefined)
    
    @scala.inline
    def setUpdateImageProperties(value: UpdateImagePropertiesRequest): Self = this.set("updateImageProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateImageProperties: Self = this.set("updateImageProperties", js.undefined)
    
    @scala.inline
    def setUpdateLineCategory(value: UpdateLineCategoryRequest): Self = this.set("updateLineCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateLineCategory: Self = this.set("updateLineCategory", js.undefined)
    
    @scala.inline
    def setUpdateLineProperties(value: UpdateLinePropertiesRequest): Self = this.set("updateLineProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateLineProperties: Self = this.set("updateLineProperties", js.undefined)
    
    @scala.inline
    def setUpdatePageElementAltText(value: UpdatePageElementAltTextRequest): Self = this.set("updatePageElementAltText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatePageElementAltText: Self = this.set("updatePageElementAltText", js.undefined)
    
    @scala.inline
    def setUpdatePageElementTransform(value: UpdatePageElementTransformRequest): Self = this.set("updatePageElementTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatePageElementTransform: Self = this.set("updatePageElementTransform", js.undefined)
    
    @scala.inline
    def setUpdatePageElementsZOrder(value: UpdatePageElementsZOrderRequest): Self = this.set("updatePageElementsZOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatePageElementsZOrder: Self = this.set("updatePageElementsZOrder", js.undefined)
    
    @scala.inline
    def setUpdatePageProperties(value: UpdatePagePropertiesRequest): Self = this.set("updatePageProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatePageProperties: Self = this.set("updatePageProperties", js.undefined)
    
    @scala.inline
    def setUpdateParagraphStyle(value: UpdateParagraphStyleRequest): Self = this.set("updateParagraphStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateParagraphStyle: Self = this.set("updateParagraphStyle", js.undefined)
    
    @scala.inline
    def setUpdateShapeProperties(value: UpdateShapePropertiesRequest): Self = this.set("updateShapeProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateShapeProperties: Self = this.set("updateShapeProperties", js.undefined)
    
    @scala.inline
    def setUpdateSlidesPosition(value: UpdateSlidesPositionRequest): Self = this.set("updateSlidesPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateSlidesPosition: Self = this.set("updateSlidesPosition", js.undefined)
    
    @scala.inline
    def setUpdateTableBorderProperties(value: UpdateTableBorderPropertiesRequest): Self = this.set("updateTableBorderProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTableBorderProperties: Self = this.set("updateTableBorderProperties", js.undefined)
    
    @scala.inline
    def setUpdateTableCellProperties(value: UpdateTableCellPropertiesRequest): Self = this.set("updateTableCellProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTableCellProperties: Self = this.set("updateTableCellProperties", js.undefined)
    
    @scala.inline
    def setUpdateTableColumnProperties(value: UpdateTableColumnPropertiesRequest): Self = this.set("updateTableColumnProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTableColumnProperties: Self = this.set("updateTableColumnProperties", js.undefined)
    
    @scala.inline
    def setUpdateTableRowProperties(value: UpdateTableRowPropertiesRequest): Self = this.set("updateTableRowProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTableRowProperties: Self = this.set("updateTableRowProperties", js.undefined)
    
    @scala.inline
    def setUpdateTextStyle(value: UpdateTextStyleRequest): Self = this.set("updateTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTextStyle: Self = this.set("updateTextStyle", js.undefined)
    
    @scala.inline
    def setUpdateVideoProperties(value: UpdateVideoPropertiesRequest): Self = this.set("updateVideoProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateVideoProperties: Self = this.set("updateVideoProperties", js.undefined)
  }
}
