package typings.officeJs.OneNote.Interfaces

import typings.officeJs.OneNote.ParagraphType
import typings.officeJs.officeJsStrings.Image
import typings.officeJs.officeJsStrings.Ink
import typings.officeJs.officeJsStrings.Other
import typings.officeJs.officeJsStrings.RichText
import typings.officeJs.officeJsStrings.Table
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
  var id: js.UndefOr[String] = js.undefined
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
    * The collection of paragraphs under this paragraph. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var paragraphs: js.UndefOr[js.Array[ParagraphData]] = js.undefined
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
  var `type`: js.UndefOr[ParagraphType | RichText | Image | Table | Ink | Other] = js.undefined
}

object ParagraphData {
  @scala.inline
  def apply(
    id: String = null,
    image: ImageData = null,
    inkWords: js.Array[InkWordData] = null,
    paragraphs: js.Array[ParagraphData] = null,
    richText: RichTextData = null,
    table: TableData = null,
    `type`: ParagraphType | RichText | Image | Table | Ink | Other = null
  ): ParagraphData = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (inkWords != null) __obj.updateDynamic("inkWords")(inkWords.asInstanceOf[js.Any])
    if (paragraphs != null) __obj.updateDynamic("paragraphs")(paragraphs.asInstanceOf[js.Any])
    if (richText != null) __obj.updateDynamic("richText")(richText.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParagraphData]
  }
}

