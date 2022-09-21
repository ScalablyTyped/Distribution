package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Request extends StObject {
  
  /** Creates a footer. */
  var createFooter: js.UndefOr[CreateFooterRequest] = js.undefined
  
  /** Creates a footnote. */
  var createFootnote: js.UndefOr[CreateFootnoteRequest] = js.undefined
  
  /** Creates a header. */
  var createHeader: js.UndefOr[CreateHeaderRequest] = js.undefined
  
  /** Creates a named range. */
  var createNamedRange: js.UndefOr[CreateNamedRangeRequest] = js.undefined
  
  /** Creates bullets for paragraphs. */
  var createParagraphBullets: js.UndefOr[CreateParagraphBulletsRequest] = js.undefined
  
  /** Deletes content from the document. */
  var deleteContentRange: js.UndefOr[DeleteContentRangeRequest] = js.undefined
  
  /** Deletes a footer from the document. */
  var deleteFooter: js.UndefOr[DeleteFooterRequest] = js.undefined
  
  /** Deletes a header from the document. */
  var deleteHeader: js.UndefOr[DeleteHeaderRequest] = js.undefined
  
  /** Deletes a named range. */
  var deleteNamedRange: js.UndefOr[DeleteNamedRangeRequest] = js.undefined
  
  /** Deletes bullets from paragraphs. */
  var deleteParagraphBullets: js.UndefOr[DeleteParagraphBulletsRequest] = js.undefined
  
  /** Deletes a positioned object from the document. */
  var deletePositionedObject: js.UndefOr[DeletePositionedObjectRequest] = js.undefined
  
  /** Deletes a column from a table. */
  var deleteTableColumn: js.UndefOr[DeleteTableColumnRequest] = js.undefined
  
  /** Deletes a row from a table. */
  var deleteTableRow: js.UndefOr[DeleteTableRowRequest] = js.undefined
  
  /** Inserts an inline image at the specified location. */
  var insertInlineImage: js.UndefOr[InsertInlineImageRequest] = js.undefined
  
  /** Inserts a page break at the specified location. */
  var insertPageBreak: js.UndefOr[InsertPageBreakRequest] = js.undefined
  
  /** Inserts a section break at the specified location. */
  var insertSectionBreak: js.UndefOr[InsertSectionBreakRequest] = js.undefined
  
  /** Inserts a table at the specified location. */
  var insertTable: js.UndefOr[InsertTableRequest] = js.undefined
  
  /** Inserts an empty column into a table. */
  var insertTableColumn: js.UndefOr[InsertTableColumnRequest] = js.undefined
  
  /** Inserts an empty row into a table. */
  var insertTableRow: js.UndefOr[InsertTableRowRequest] = js.undefined
  
  /** Inserts text at the specified location. */
  var insertText: js.UndefOr[InsertTextRequest] = js.undefined
  
  /** Merges cells in a table. */
  var mergeTableCells: js.UndefOr[MergeTableCellsRequest] = js.undefined
  
  /** Updates the number of pinned header rows in a table. */
  var pinTableHeaderRows: js.UndefOr[PinTableHeaderRowsRequest] = js.undefined
  
  /** Replaces all instances of the specified text. */
  var replaceAllText: js.UndefOr[ReplaceAllTextRequest] = js.undefined
  
  /** Replaces an image in the document. */
  var replaceImage: js.UndefOr[ReplaceImageRequest] = js.undefined
  
  /** Replaces the content in a named range. */
  var replaceNamedRangeContent: js.UndefOr[ReplaceNamedRangeContentRequest] = js.undefined
  
  /** Unmerges cells in a table. */
  var unmergeTableCells: js.UndefOr[UnmergeTableCellsRequest] = js.undefined
  
  /** Updates the style of the document. */
  var updateDocumentStyle: js.UndefOr[UpdateDocumentStyleRequest] = js.undefined
  
  /** Updates the paragraph style at the specified range. */
  var updateParagraphStyle: js.UndefOr[UpdateParagraphStyleRequest] = js.undefined
  
  /** Updates the section style of the specified range. */
  var updateSectionStyle: js.UndefOr[UpdateSectionStyleRequest] = js.undefined
  
  /** Updates the style of table cells. */
  var updateTableCellStyle: js.UndefOr[UpdateTableCellStyleRequest] = js.undefined
  
  /** Updates the properties of columns in a table. */
  var updateTableColumnProperties: js.UndefOr[UpdateTableColumnPropertiesRequest] = js.undefined
  
  /** Updates the row style in a table. */
  var updateTableRowStyle: js.UndefOr[UpdateTableRowStyleRequest] = js.undefined
  
  /** Updates the text style at the specified range. */
  var updateTextStyle: js.UndefOr[UpdateTextStyleRequest] = js.undefined
}
object Request {
  
  inline def apply(): Request = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Request]
  }
  
  extension [Self <: Request](x: Self) {
    
    inline def setCreateFooter(value: CreateFooterRequest): Self = StObject.set(x, "createFooter", value.asInstanceOf[js.Any])
    
    inline def setCreateFooterUndefined: Self = StObject.set(x, "createFooter", js.undefined)
    
    inline def setCreateFootnote(value: CreateFootnoteRequest): Self = StObject.set(x, "createFootnote", value.asInstanceOf[js.Any])
    
    inline def setCreateFootnoteUndefined: Self = StObject.set(x, "createFootnote", js.undefined)
    
    inline def setCreateHeader(value: CreateHeaderRequest): Self = StObject.set(x, "createHeader", value.asInstanceOf[js.Any])
    
    inline def setCreateHeaderUndefined: Self = StObject.set(x, "createHeader", js.undefined)
    
    inline def setCreateNamedRange(value: CreateNamedRangeRequest): Self = StObject.set(x, "createNamedRange", value.asInstanceOf[js.Any])
    
    inline def setCreateNamedRangeUndefined: Self = StObject.set(x, "createNamedRange", js.undefined)
    
    inline def setCreateParagraphBullets(value: CreateParagraphBulletsRequest): Self = StObject.set(x, "createParagraphBullets", value.asInstanceOf[js.Any])
    
    inline def setCreateParagraphBulletsUndefined: Self = StObject.set(x, "createParagraphBullets", js.undefined)
    
    inline def setDeleteContentRange(value: DeleteContentRangeRequest): Self = StObject.set(x, "deleteContentRange", value.asInstanceOf[js.Any])
    
    inline def setDeleteContentRangeUndefined: Self = StObject.set(x, "deleteContentRange", js.undefined)
    
    inline def setDeleteFooter(value: DeleteFooterRequest): Self = StObject.set(x, "deleteFooter", value.asInstanceOf[js.Any])
    
    inline def setDeleteFooterUndefined: Self = StObject.set(x, "deleteFooter", js.undefined)
    
    inline def setDeleteHeader(value: DeleteHeaderRequest): Self = StObject.set(x, "deleteHeader", value.asInstanceOf[js.Any])
    
    inline def setDeleteHeaderUndefined: Self = StObject.set(x, "deleteHeader", js.undefined)
    
    inline def setDeleteNamedRange(value: DeleteNamedRangeRequest): Self = StObject.set(x, "deleteNamedRange", value.asInstanceOf[js.Any])
    
    inline def setDeleteNamedRangeUndefined: Self = StObject.set(x, "deleteNamedRange", js.undefined)
    
    inline def setDeleteParagraphBullets(value: DeleteParagraphBulletsRequest): Self = StObject.set(x, "deleteParagraphBullets", value.asInstanceOf[js.Any])
    
    inline def setDeleteParagraphBulletsUndefined: Self = StObject.set(x, "deleteParagraphBullets", js.undefined)
    
    inline def setDeletePositionedObject(value: DeletePositionedObjectRequest): Self = StObject.set(x, "deletePositionedObject", value.asInstanceOf[js.Any])
    
    inline def setDeletePositionedObjectUndefined: Self = StObject.set(x, "deletePositionedObject", js.undefined)
    
    inline def setDeleteTableColumn(value: DeleteTableColumnRequest): Self = StObject.set(x, "deleteTableColumn", value.asInstanceOf[js.Any])
    
    inline def setDeleteTableColumnUndefined: Self = StObject.set(x, "deleteTableColumn", js.undefined)
    
    inline def setDeleteTableRow(value: DeleteTableRowRequest): Self = StObject.set(x, "deleteTableRow", value.asInstanceOf[js.Any])
    
    inline def setDeleteTableRowUndefined: Self = StObject.set(x, "deleteTableRow", js.undefined)
    
    inline def setInsertInlineImage(value: InsertInlineImageRequest): Self = StObject.set(x, "insertInlineImage", value.asInstanceOf[js.Any])
    
    inline def setInsertInlineImageUndefined: Self = StObject.set(x, "insertInlineImage", js.undefined)
    
    inline def setInsertPageBreak(value: InsertPageBreakRequest): Self = StObject.set(x, "insertPageBreak", value.asInstanceOf[js.Any])
    
    inline def setInsertPageBreakUndefined: Self = StObject.set(x, "insertPageBreak", js.undefined)
    
    inline def setInsertSectionBreak(value: InsertSectionBreakRequest): Self = StObject.set(x, "insertSectionBreak", value.asInstanceOf[js.Any])
    
    inline def setInsertSectionBreakUndefined: Self = StObject.set(x, "insertSectionBreak", js.undefined)
    
    inline def setInsertTable(value: InsertTableRequest): Self = StObject.set(x, "insertTable", value.asInstanceOf[js.Any])
    
    inline def setInsertTableColumn(value: InsertTableColumnRequest): Self = StObject.set(x, "insertTableColumn", value.asInstanceOf[js.Any])
    
    inline def setInsertTableColumnUndefined: Self = StObject.set(x, "insertTableColumn", js.undefined)
    
    inline def setInsertTableRow(value: InsertTableRowRequest): Self = StObject.set(x, "insertTableRow", value.asInstanceOf[js.Any])
    
    inline def setInsertTableRowUndefined: Self = StObject.set(x, "insertTableRow", js.undefined)
    
    inline def setInsertTableUndefined: Self = StObject.set(x, "insertTable", js.undefined)
    
    inline def setInsertText(value: InsertTextRequest): Self = StObject.set(x, "insertText", value.asInstanceOf[js.Any])
    
    inline def setInsertTextUndefined: Self = StObject.set(x, "insertText", js.undefined)
    
    inline def setMergeTableCells(value: MergeTableCellsRequest): Self = StObject.set(x, "mergeTableCells", value.asInstanceOf[js.Any])
    
    inline def setMergeTableCellsUndefined: Self = StObject.set(x, "mergeTableCells", js.undefined)
    
    inline def setPinTableHeaderRows(value: PinTableHeaderRowsRequest): Self = StObject.set(x, "pinTableHeaderRows", value.asInstanceOf[js.Any])
    
    inline def setPinTableHeaderRowsUndefined: Self = StObject.set(x, "pinTableHeaderRows", js.undefined)
    
    inline def setReplaceAllText(value: ReplaceAllTextRequest): Self = StObject.set(x, "replaceAllText", value.asInstanceOf[js.Any])
    
    inline def setReplaceAllTextUndefined: Self = StObject.set(x, "replaceAllText", js.undefined)
    
    inline def setReplaceImage(value: ReplaceImageRequest): Self = StObject.set(x, "replaceImage", value.asInstanceOf[js.Any])
    
    inline def setReplaceImageUndefined: Self = StObject.set(x, "replaceImage", js.undefined)
    
    inline def setReplaceNamedRangeContent(value: ReplaceNamedRangeContentRequest): Self = StObject.set(x, "replaceNamedRangeContent", value.asInstanceOf[js.Any])
    
    inline def setReplaceNamedRangeContentUndefined: Self = StObject.set(x, "replaceNamedRangeContent", js.undefined)
    
    inline def setUnmergeTableCells(value: UnmergeTableCellsRequest): Self = StObject.set(x, "unmergeTableCells", value.asInstanceOf[js.Any])
    
    inline def setUnmergeTableCellsUndefined: Self = StObject.set(x, "unmergeTableCells", js.undefined)
    
    inline def setUpdateDocumentStyle(value: UpdateDocumentStyleRequest): Self = StObject.set(x, "updateDocumentStyle", value.asInstanceOf[js.Any])
    
    inline def setUpdateDocumentStyleUndefined: Self = StObject.set(x, "updateDocumentStyle", js.undefined)
    
    inline def setUpdateParagraphStyle(value: UpdateParagraphStyleRequest): Self = StObject.set(x, "updateParagraphStyle", value.asInstanceOf[js.Any])
    
    inline def setUpdateParagraphStyleUndefined: Self = StObject.set(x, "updateParagraphStyle", js.undefined)
    
    inline def setUpdateSectionStyle(value: UpdateSectionStyleRequest): Self = StObject.set(x, "updateSectionStyle", value.asInstanceOf[js.Any])
    
    inline def setUpdateSectionStyleUndefined: Self = StObject.set(x, "updateSectionStyle", js.undefined)
    
    inline def setUpdateTableCellStyle(value: UpdateTableCellStyleRequest): Self = StObject.set(x, "updateTableCellStyle", value.asInstanceOf[js.Any])
    
    inline def setUpdateTableCellStyleUndefined: Self = StObject.set(x, "updateTableCellStyle", js.undefined)
    
    inline def setUpdateTableColumnProperties(value: UpdateTableColumnPropertiesRequest): Self = StObject.set(x, "updateTableColumnProperties", value.asInstanceOf[js.Any])
    
    inline def setUpdateTableColumnPropertiesUndefined: Self = StObject.set(x, "updateTableColumnProperties", js.undefined)
    
    inline def setUpdateTableRowStyle(value: UpdateTableRowStyleRequest): Self = StObject.set(x, "updateTableRowStyle", value.asInstanceOf[js.Any])
    
    inline def setUpdateTableRowStyleUndefined: Self = StObject.set(x, "updateTableRowStyle", js.undefined)
    
    inline def setUpdateTextStyle(value: UpdateTextStyleRequest): Self = StObject.set(x, "updateTextStyle", value.asInstanceOf[js.Any])
    
    inline def setUpdateTextStyleUndefined: Self = StObject.set(x, "updateTextStyle", js.undefined)
  }
}
