package typings
package officeDashJsDashPreviewLib.OneNoteNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "paragraph.toJSON()". */

trait ParagraphData extends js.Object {
  /**
               *
               * Gets the ID of the Paragraph object. Read-only.
               *
               * [Api set: OneNoteApi 1.1]
               */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
              *
              * Gets the Image object in the Paragraph. Throws an exception if ParagraphType is not Image. Read-only.
              *
              * [Api set: OneNoteApi 1.1]
              */
  var image: js.UndefOr[ImageData] = js.undefined
  /**
              *
              * Gets the Ink collection in the Paragraph. Throws an exception if ParagraphType is not Ink. Read-only.
              *
              * [Api set: OneNoteApi 1.1]
              */
  var inkWords: js.UndefOr[js.Array[InkWordData]] = js.undefined
  /**
              *
              * Gets the Outline object that contains the Paragraph. Read-only.
              *
              * [Api set: OneNoteApi 1.1]
              */
  var outline: js.UndefOr[OutlineData] = js.undefined
  /**
              *
              * The collection of paragraphs under this paragraph. Read only
              *
              * [Api set: OneNoteApi 1.1]
              */
  var paragraphs: js.UndefOr[js.Array[ParagraphData]] = js.undefined
  /**
              *
              * Gets the parent paragraph object. Throws if a parent paragraph does not exist. Read-only.
              *
              * [Api set: OneNoteApi 1.1]
              */
  var parentParagraph: js.UndefOr[ParagraphData] = js.undefined
  /**
              *
              * Gets the parent paragraph object. Returns null if a parent paragraph does not exist. Read-only.
              *
              * [Api set: OneNoteApi 1.1]
              */
  var parentParagraphOrNull: js.UndefOr[ParagraphData] = js.undefined
  /**
              *
              * Gets the TableCell object that contains the Paragraph if one exists. If parent is not a TableCell, throws ItemNotFound. Read-only.
              *
              * [Api set: OneNoteApi 1.1]
              */
  var parentTableCell: js.UndefOr[TableCellData] = js.undefined
  /**
              *
              * Gets the TableCell object that contains the Paragraph if one exists. If parent is not a TableCell, returns null. Read-only.
              *
              * [Api set: OneNoteApi 1.1]
              */
  var parentTableCellOrNull: js.UndefOr[TableCellData] = js.undefined
  /**
              *
              * Gets the RichText object in the Paragraph. Throws an exception if ParagraphType is not RichText. Read-only
              *
              * [Api set: OneNoteApi 1.1]
              */
  var richText: js.UndefOr[RichTextData] = js.undefined
  /**
              *
              * Gets the Table object in the Paragraph. Throws an exception if ParagraphType is not Table. Read-only.
              *
              * [Api set: OneNoteApi 1.1]
              */
  var table: js.UndefOr[TableData] = js.undefined
  /**
               *
               * Gets the type of the Paragraph object. Read-only.
               *
               * [Api set: OneNoteApi 1.1]
               */
  var `type`: js.UndefOr[
    officeDashJsDashPreviewLib.OneNoteNs.ParagraphType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.RichText | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Image | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Table | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Ink | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Other
  ] = js.undefined
}

