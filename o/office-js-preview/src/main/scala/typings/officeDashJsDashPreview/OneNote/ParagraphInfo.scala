package typings.officeDashJsDashPreview.OneNote

import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Bullet
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.None
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * List information for paragraph.
  *
  * [Api set: OneNoteApi 1.1]
  */
trait ParagraphInfo extends js.Object {
  /**
    *
    * //
    Bullet list type of paragraph
    *
    * [Api set: OneNoteApi 1.1]
    */
  var bulletType: String
  /**
    *
    * //
    Index of paragraph in list
    *
    * [Api set: OneNoteApi 1.1]
    */
  var index: Double
  /**
    *
    * //
    Type of list in paragraph
    *
    * [Api set: OneNoteApi 1.1]
    */
  var listType: ListType | None | Number | Bullet
  /**
    *
    * //
    number list type of paragraph
    *
    * [Api set: OneNoteApi 1.1]
    */
  var numberType: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63 */ js.Any
}

object ParagraphInfo {
  @scala.inline
  def apply(
    bulletType: String,
    index: Double,
    listType: ListType | None | Number | Bullet,
    numberType: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63 */ js.Any
  ): ParagraphInfo = {
    val __obj = js.Dynamic.literal(bulletType = bulletType, index = index, listType = listType.asInstanceOf[js.Any], numberType = numberType)
  
    __obj.asInstanceOf[ParagraphInfo]
  }
}

