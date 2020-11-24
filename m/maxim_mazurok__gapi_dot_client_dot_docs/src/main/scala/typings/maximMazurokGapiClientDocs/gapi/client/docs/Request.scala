package typings.maximMazurokGapiClientDocs.gapi.client.docs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Request extends js.Object {
  
  /** Creates a footer. */
  var createFooter: js.UndefOr[CreateFooterRequest] = js.native
  
  /** Creates a footnote. */
  var createFootnote: js.UndefOr[CreateFootnoteRequest] = js.native
  
  /** Creates a header. */
  var createHeader: js.UndefOr[CreateHeaderRequest] = js.native
  
  /** Creates a named range. */
  var createNamedRange: js.UndefOr[CreateNamedRangeRequest] = js.native
  
  /** Creates bullets for paragraphs. */
  var createParagraphBullets: js.UndefOr[CreateParagraphBulletsRequest] = js.native
  
  /** Deletes content from the document. */
  var deleteContentRange: js.UndefOr[DeleteContentRangeRequest] = js.native
  
  /** Deletes a footer from the document. */
  var deleteFooter: js.UndefOr[DeleteFooterRequest] = js.native
  
  /** Deletes a header from the document. */
  var deleteHeader: js.UndefOr[DeleteHeaderRequest] = js.native
  
  /** Deletes a named range. */
  var deleteNamedRange: js.UndefOr[DeleteNamedRangeRequest] = js.native
  
  /** Deletes bullets from paragraphs. */
  var deleteParagraphBullets: js.UndefOr[DeleteParagraphBulletsRequest] = js.native
  
  /** Deletes a positioned object from the document. */
  var deletePositionedObject: js.UndefOr[DeletePositionedObjectRequest] = js.native
  
  /** Deletes a column from a table. */
  var deleteTableColumn: js.UndefOr[DeleteTableColumnRequest] = js.native
  
  /** Deletes a row from a table. */
  var deleteTableRow: js.UndefOr[DeleteTableRowRequest] = js.native
  
  /** Inserts an inline image at the specified location. */
  var insertInlineImage: js.UndefOr[InsertInlineImageRequest] = js.native
  
  /** Inserts a page break at the specified location. */
  var insertPageBreak: js.UndefOr[InsertPageBreakRequest] = js.native
  
  /** Inserts a section break at the specified location. */
  var insertSectionBreak: js.UndefOr[InsertSectionBreakRequest] = js.native
  
  /** Inserts a table at the specified location. */
  var insertTable: js.UndefOr[InsertTableRequest] = js.native
  
  /** Inserts an empty column into a table. */
  var insertTableColumn: js.UndefOr[InsertTableColumnRequest] = js.native
  
  /** Inserts an empty row into a table. */
  var insertTableRow: js.UndefOr[InsertTableRowRequest] = js.native
  
  /** Inserts text at the specified location. */
  var insertText: js.UndefOr[InsertTextRequest] = js.native
  
  /** Merges cells in a table. */
  var mergeTableCells: js.UndefOr[MergeTableCellsRequest] = js.native
  
  /** Replaces all instances of the specified text. */
  var replaceAllText: js.UndefOr[ReplaceAllTextRequest] = js.native
  
  /** Replaces an image in the document. */
  var replaceImage: js.UndefOr[ReplaceImageRequest] = js.native
  
  /** Replaces the content in a named range. */
  var replaceNamedRangeContent: js.UndefOr[ReplaceNamedRangeContentRequest] = js.native
  
  /** Unmerges cells in a table. */
  var unmergeTableCells: js.UndefOr[UnmergeTableCellsRequest] = js.native
  
  /** Updates the style of the document. */
  var updateDocumentStyle: js.UndefOr[UpdateDocumentStyleRequest] = js.native
  
  /** Updates the paragraph style at the specified range. */
  var updateParagraphStyle: js.UndefOr[UpdateParagraphStyleRequest] = js.native
  
  /** Updates the section style of the specified range. */
  var updateSectionStyle: js.UndefOr[UpdateSectionStyleRequest] = js.native
  
  /** Updates the style of table cells. */
  var updateTableCellStyle: js.UndefOr[UpdateTableCellStyleRequest] = js.native
  
  /** Updates the properties of columns in a table. */
  var updateTableColumnProperties: js.UndefOr[UpdateTableColumnPropertiesRequest] = js.native
  
  /** Updates the row style in a table. */
  var updateTableRowStyle: js.UndefOr[UpdateTableRowStyleRequest] = js.native
  
  /** Updates the text style at the specified range. */
  var updateTextStyle: js.UndefOr[UpdateTextStyleRequest] = js.native
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
    def setCreateFooter(value: CreateFooterRequest): Self = this.set("createFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateFooter: Self = this.set("createFooter", js.undefined)
    
    @scala.inline
    def setCreateFootnote(value: CreateFootnoteRequest): Self = this.set("createFootnote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateFootnote: Self = this.set("createFootnote", js.undefined)
    
    @scala.inline
    def setCreateHeader(value: CreateHeaderRequest): Self = this.set("createHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateHeader: Self = this.set("createHeader", js.undefined)
    
    @scala.inline
    def setCreateNamedRange(value: CreateNamedRangeRequest): Self = this.set("createNamedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateNamedRange: Self = this.set("createNamedRange", js.undefined)
    
    @scala.inline
    def setCreateParagraphBullets(value: CreateParagraphBulletsRequest): Self = this.set("createParagraphBullets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateParagraphBullets: Self = this.set("createParagraphBullets", js.undefined)
    
    @scala.inline
    def setDeleteContentRange(value: DeleteContentRangeRequest): Self = this.set("deleteContentRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteContentRange: Self = this.set("deleteContentRange", js.undefined)
    
    @scala.inline
    def setDeleteFooter(value: DeleteFooterRequest): Self = this.set("deleteFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteFooter: Self = this.set("deleteFooter", js.undefined)
    
    @scala.inline
    def setDeleteHeader(value: DeleteHeaderRequest): Self = this.set("deleteHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteHeader: Self = this.set("deleteHeader", js.undefined)
    
    @scala.inline
    def setDeleteNamedRange(value: DeleteNamedRangeRequest): Self = this.set("deleteNamedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteNamedRange: Self = this.set("deleteNamedRange", js.undefined)
    
    @scala.inline
    def setDeleteParagraphBullets(value: DeleteParagraphBulletsRequest): Self = this.set("deleteParagraphBullets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteParagraphBullets: Self = this.set("deleteParagraphBullets", js.undefined)
    
    @scala.inline
    def setDeletePositionedObject(value: DeletePositionedObjectRequest): Self = this.set("deletePositionedObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeletePositionedObject: Self = this.set("deletePositionedObject", js.undefined)
    
    @scala.inline
    def setDeleteTableColumn(value: DeleteTableColumnRequest): Self = this.set("deleteTableColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteTableColumn: Self = this.set("deleteTableColumn", js.undefined)
    
    @scala.inline
    def setDeleteTableRow(value: DeleteTableRowRequest): Self = this.set("deleteTableRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteTableRow: Self = this.set("deleteTableRow", js.undefined)
    
    @scala.inline
    def setInsertInlineImage(value: InsertInlineImageRequest): Self = this.set("insertInlineImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertInlineImage: Self = this.set("insertInlineImage", js.undefined)
    
    @scala.inline
    def setInsertPageBreak(value: InsertPageBreakRequest): Self = this.set("insertPageBreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertPageBreak: Self = this.set("insertPageBreak", js.undefined)
    
    @scala.inline
    def setInsertSectionBreak(value: InsertSectionBreakRequest): Self = this.set("insertSectionBreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertSectionBreak: Self = this.set("insertSectionBreak", js.undefined)
    
    @scala.inline
    def setInsertTable(value: InsertTableRequest): Self = this.set("insertTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertTable: Self = this.set("insertTable", js.undefined)
    
    @scala.inline
    def setInsertTableColumn(value: InsertTableColumnRequest): Self = this.set("insertTableColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertTableColumn: Self = this.set("insertTableColumn", js.undefined)
    
    @scala.inline
    def setInsertTableRow(value: InsertTableRowRequest): Self = this.set("insertTableRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertTableRow: Self = this.set("insertTableRow", js.undefined)
    
    @scala.inline
    def setInsertText(value: InsertTextRequest): Self = this.set("insertText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertText: Self = this.set("insertText", js.undefined)
    
    @scala.inline
    def setMergeTableCells(value: MergeTableCellsRequest): Self = this.set("mergeTableCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMergeTableCells: Self = this.set("mergeTableCells", js.undefined)
    
    @scala.inline
    def setReplaceAllText(value: ReplaceAllTextRequest): Self = this.set("replaceAllText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplaceAllText: Self = this.set("replaceAllText", js.undefined)
    
    @scala.inline
    def setReplaceImage(value: ReplaceImageRequest): Self = this.set("replaceImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplaceImage: Self = this.set("replaceImage", js.undefined)
    
    @scala.inline
    def setReplaceNamedRangeContent(value: ReplaceNamedRangeContentRequest): Self = this.set("replaceNamedRangeContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplaceNamedRangeContent: Self = this.set("replaceNamedRangeContent", js.undefined)
    
    @scala.inline
    def setUnmergeTableCells(value: UnmergeTableCellsRequest): Self = this.set("unmergeTableCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnmergeTableCells: Self = this.set("unmergeTableCells", js.undefined)
    
    @scala.inline
    def setUpdateDocumentStyle(value: UpdateDocumentStyleRequest): Self = this.set("updateDocumentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateDocumentStyle: Self = this.set("updateDocumentStyle", js.undefined)
    
    @scala.inline
    def setUpdateParagraphStyle(value: UpdateParagraphStyleRequest): Self = this.set("updateParagraphStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateParagraphStyle: Self = this.set("updateParagraphStyle", js.undefined)
    
    @scala.inline
    def setUpdateSectionStyle(value: UpdateSectionStyleRequest): Self = this.set("updateSectionStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateSectionStyle: Self = this.set("updateSectionStyle", js.undefined)
    
    @scala.inline
    def setUpdateTableCellStyle(value: UpdateTableCellStyleRequest): Self = this.set("updateTableCellStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTableCellStyle: Self = this.set("updateTableCellStyle", js.undefined)
    
    @scala.inline
    def setUpdateTableColumnProperties(value: UpdateTableColumnPropertiesRequest): Self = this.set("updateTableColumnProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTableColumnProperties: Self = this.set("updateTableColumnProperties", js.undefined)
    
    @scala.inline
    def setUpdateTableRowStyle(value: UpdateTableRowStyleRequest): Self = this.set("updateTableRowStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTableRowStyle: Self = this.set("updateTableRowStyle", js.undefined)
    
    @scala.inline
    def setUpdateTextStyle(value: UpdateTextStyleRequest): Self = this.set("updateTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTextStyle: Self = this.set("updateTextStyle", js.undefined)
  }
}
