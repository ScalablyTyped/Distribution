package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Request extends StObject {
  
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
  implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateFooter(value: CreateFooterRequest): Self = StObject.set(x, "createFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateFooterUndefined: Self = StObject.set(x, "createFooter", js.undefined)
    
    @scala.inline
    def setCreateFootnote(value: CreateFootnoteRequest): Self = StObject.set(x, "createFootnote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateFootnoteUndefined: Self = StObject.set(x, "createFootnote", js.undefined)
    
    @scala.inline
    def setCreateHeader(value: CreateHeaderRequest): Self = StObject.set(x, "createHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateHeaderUndefined: Self = StObject.set(x, "createHeader", js.undefined)
    
    @scala.inline
    def setCreateNamedRange(value: CreateNamedRangeRequest): Self = StObject.set(x, "createNamedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateNamedRangeUndefined: Self = StObject.set(x, "createNamedRange", js.undefined)
    
    @scala.inline
    def setCreateParagraphBullets(value: CreateParagraphBulletsRequest): Self = StObject.set(x, "createParagraphBullets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateParagraphBulletsUndefined: Self = StObject.set(x, "createParagraphBullets", js.undefined)
    
    @scala.inline
    def setDeleteContentRange(value: DeleteContentRangeRequest): Self = StObject.set(x, "deleteContentRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteContentRangeUndefined: Self = StObject.set(x, "deleteContentRange", js.undefined)
    
    @scala.inline
    def setDeleteFooter(value: DeleteFooterRequest): Self = StObject.set(x, "deleteFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteFooterUndefined: Self = StObject.set(x, "deleteFooter", js.undefined)
    
    @scala.inline
    def setDeleteHeader(value: DeleteHeaderRequest): Self = StObject.set(x, "deleteHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteHeaderUndefined: Self = StObject.set(x, "deleteHeader", js.undefined)
    
    @scala.inline
    def setDeleteNamedRange(value: DeleteNamedRangeRequest): Self = StObject.set(x, "deleteNamedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteNamedRangeUndefined: Self = StObject.set(x, "deleteNamedRange", js.undefined)
    
    @scala.inline
    def setDeleteParagraphBullets(value: DeleteParagraphBulletsRequest): Self = StObject.set(x, "deleteParagraphBullets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteParagraphBulletsUndefined: Self = StObject.set(x, "deleteParagraphBullets", js.undefined)
    
    @scala.inline
    def setDeletePositionedObject(value: DeletePositionedObjectRequest): Self = StObject.set(x, "deletePositionedObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletePositionedObjectUndefined: Self = StObject.set(x, "deletePositionedObject", js.undefined)
    
    @scala.inline
    def setDeleteTableColumn(value: DeleteTableColumnRequest): Self = StObject.set(x, "deleteTableColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteTableColumnUndefined: Self = StObject.set(x, "deleteTableColumn", js.undefined)
    
    @scala.inline
    def setDeleteTableRow(value: DeleteTableRowRequest): Self = StObject.set(x, "deleteTableRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteTableRowUndefined: Self = StObject.set(x, "deleteTableRow", js.undefined)
    
    @scala.inline
    def setInsertInlineImage(value: InsertInlineImageRequest): Self = StObject.set(x, "insertInlineImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertInlineImageUndefined: Self = StObject.set(x, "insertInlineImage", js.undefined)
    
    @scala.inline
    def setInsertPageBreak(value: InsertPageBreakRequest): Self = StObject.set(x, "insertPageBreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertPageBreakUndefined: Self = StObject.set(x, "insertPageBreak", js.undefined)
    
    @scala.inline
    def setInsertSectionBreak(value: InsertSectionBreakRequest): Self = StObject.set(x, "insertSectionBreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertSectionBreakUndefined: Self = StObject.set(x, "insertSectionBreak", js.undefined)
    
    @scala.inline
    def setInsertTable(value: InsertTableRequest): Self = StObject.set(x, "insertTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertTableColumn(value: InsertTableColumnRequest): Self = StObject.set(x, "insertTableColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertTableColumnUndefined: Self = StObject.set(x, "insertTableColumn", js.undefined)
    
    @scala.inline
    def setInsertTableRow(value: InsertTableRowRequest): Self = StObject.set(x, "insertTableRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertTableRowUndefined: Self = StObject.set(x, "insertTableRow", js.undefined)
    
    @scala.inline
    def setInsertTableUndefined: Self = StObject.set(x, "insertTable", js.undefined)
    
    @scala.inline
    def setInsertText(value: InsertTextRequest): Self = StObject.set(x, "insertText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertTextUndefined: Self = StObject.set(x, "insertText", js.undefined)
    
    @scala.inline
    def setMergeTableCells(value: MergeTableCellsRequest): Self = StObject.set(x, "mergeTableCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeTableCellsUndefined: Self = StObject.set(x, "mergeTableCells", js.undefined)
    
    @scala.inline
    def setReplaceAllText(value: ReplaceAllTextRequest): Self = StObject.set(x, "replaceAllText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceAllTextUndefined: Self = StObject.set(x, "replaceAllText", js.undefined)
    
    @scala.inline
    def setReplaceImage(value: ReplaceImageRequest): Self = StObject.set(x, "replaceImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceImageUndefined: Self = StObject.set(x, "replaceImage", js.undefined)
    
    @scala.inline
    def setReplaceNamedRangeContent(value: ReplaceNamedRangeContentRequest): Self = StObject.set(x, "replaceNamedRangeContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceNamedRangeContentUndefined: Self = StObject.set(x, "replaceNamedRangeContent", js.undefined)
    
    @scala.inline
    def setUnmergeTableCells(value: UnmergeTableCellsRequest): Self = StObject.set(x, "unmergeTableCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnmergeTableCellsUndefined: Self = StObject.set(x, "unmergeTableCells", js.undefined)
    
    @scala.inline
    def setUpdateDocumentStyle(value: UpdateDocumentStyleRequest): Self = StObject.set(x, "updateDocumentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateDocumentStyleUndefined: Self = StObject.set(x, "updateDocumentStyle", js.undefined)
    
    @scala.inline
    def setUpdateParagraphStyle(value: UpdateParagraphStyleRequest): Self = StObject.set(x, "updateParagraphStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateParagraphStyleUndefined: Self = StObject.set(x, "updateParagraphStyle", js.undefined)
    
    @scala.inline
    def setUpdateSectionStyle(value: UpdateSectionStyleRequest): Self = StObject.set(x, "updateSectionStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateSectionStyleUndefined: Self = StObject.set(x, "updateSectionStyle", js.undefined)
    
    @scala.inline
    def setUpdateTableCellStyle(value: UpdateTableCellStyleRequest): Self = StObject.set(x, "updateTableCellStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTableCellStyleUndefined: Self = StObject.set(x, "updateTableCellStyle", js.undefined)
    
    @scala.inline
    def setUpdateTableColumnProperties(value: UpdateTableColumnPropertiesRequest): Self = StObject.set(x, "updateTableColumnProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTableColumnPropertiesUndefined: Self = StObject.set(x, "updateTableColumnProperties", js.undefined)
    
    @scala.inline
    def setUpdateTableRowStyle(value: UpdateTableRowStyleRequest): Self = StObject.set(x, "updateTableRowStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTableRowStyleUndefined: Self = StObject.set(x, "updateTableRowStyle", js.undefined)
    
    @scala.inline
    def setUpdateTextStyle(value: UpdateTextStyleRequest): Self = StObject.set(x, "updateTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTextStyleUndefined: Self = StObject.set(x, "updateTextStyle", js.undefined)
  }
}
