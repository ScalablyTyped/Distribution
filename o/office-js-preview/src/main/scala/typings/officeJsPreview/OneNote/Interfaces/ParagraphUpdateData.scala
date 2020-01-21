package typings.officeJsPreview.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the Paragraph object, for use in "paragraph.set({ ... })". */
trait ParagraphUpdateData extends js.Object {
  /**
    *
    * Gets the Image object in the Paragraph. Throws an exception if ParagraphType is not Image.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var image: js.UndefOr[ImageUpdateData] = js.undefined
  /**
    *
    * Gets the Table object in the Paragraph. Throws an exception if ParagraphType is not Table.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var table: js.UndefOr[TableUpdateData] = js.undefined
}

object ParagraphUpdateData {
  @scala.inline
  def apply(image: ImageUpdateData = null, table: TableUpdateData = null): ParagraphUpdateData = {
    val __obj = js.Dynamic.literal()
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParagraphUpdateData]
  }
}

