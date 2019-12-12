package typings.officeDashJsDashPreview.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * A container for the visible content on a page. A Paragraph can contain any one ParagraphType type of content.
  *
  * [Api set: OneNoteApi 1.1]
  */
@js.native
trait ParagraphLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the ID of the Paragraph object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the Image object in the Paragraph. Throws an exception if ParagraphType is not Image.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var image: js.UndefOr[ImageLoadOptions] = js.native
  /**
    *
    * Gets the Ink collection in the Paragraph. Throws an exception if ParagraphType is not Ink.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var inkWords: js.UndefOr[InkWordCollectionLoadOptions] = js.native
  /**
    *
    * Gets the Outline object that contains the Paragraph.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var outline: js.UndefOr[OutlineLoadOptions] = js.native
  /**
    *
    * The collection of paragraphs under this paragraph. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var paragraphs: js.UndefOr[ParagraphCollectionLoadOptions] = js.native
  /**
    *
    * Gets the parent paragraph object. Throws if a parent paragraph does not exist.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var parentParagraph: js.UndefOr[ParagraphLoadOptions] = js.native
  /**
    *
    * Gets the parent paragraph object. Returns null if a parent paragraph does not exist.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var parentParagraphOrNull: js.UndefOr[ParagraphLoadOptions] = js.native
  /**
    *
    * Gets the TableCell object that contains the Paragraph if one exists. If parent is not a TableCell, throws ItemNotFound.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var parentTableCell: js.UndefOr[TableCellLoadOptions] = js.native
  /**
    *
    * Gets the TableCell object that contains the Paragraph if one exists. If parent is not a TableCell, returns null.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var parentTableCellOrNull: js.UndefOr[TableCellLoadOptions] = js.native
  /**
    *
    * Gets the RichText object in the Paragraph. Throws an exception if ParagraphType is not RichText.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var richText: js.UndefOr[RichTextLoadOptions] = js.native
  /**
    *
    * Gets the Table object in the Paragraph. Throws an exception if ParagraphType is not Table.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var table: js.UndefOr[TableLoadOptions] = js.native
  /**
    *
    * Gets the type of the Paragraph object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var `type`: js.UndefOr[Boolean] = js.native
}

