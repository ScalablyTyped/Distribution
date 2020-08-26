package typings.officeJsPreview.OneNote

import typings.officeJsPreview.officeJsPreviewStrings.Bullet
import typings.officeJsPreview.officeJsPreviewStrings.None
import typings.officeJsPreview.officeJsPreviewStrings.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * List information for paragraph.
  *
  * [Api set: OneNoteApi 1.1]
  */
@js.native
trait ParagraphInfo extends js.Object {
  /**
    *
    * //
    Bullet list type of paragraph
    *
    * [Api set: OneNoteApi 1.1]
    */
  var bulletType: String = js.native
  /**
    *
    * //
    Index of paragraph in list
    *
    * [Api set: OneNoteApi 1.1]
    */
  var index: Double = js.native
  /**
    *
    * //
    Type of list in paragraph
    *
    * [Api set: OneNoteApi 1.1]
    */
  var listType: ListType | None | Number | Bullet = js.native
  /**
    *
    * //
    number list type of paragraph
    *
    * [Api set: OneNoteApi 1.1]
    */
  var numberType: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63 */ js.Any = js.native
}

object ParagraphInfo {
  @scala.inline
  def apply(
    bulletType: String,
    index: Double,
    listType: ListType | None | Number | Bullet,
    numberType: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63 */ js.Any
  ): ParagraphInfo = {
    val __obj = js.Dynamic.literal(bulletType = bulletType.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], listType = listType.asInstanceOf[js.Any], numberType = numberType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParagraphInfo]
  }
  @scala.inline
  implicit class ParagraphInfoOps[Self <: ParagraphInfo] (val x: Self) extends AnyVal {
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
    def setBulletType(value: String): Self = this.set("bulletType", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setListType(value: ListType | None | Number | Bullet): Self = this.set("listType", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumberType(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63 */ js.Any): Self = this.set("numberType", value.asInstanceOf[js.Any])
  }
  
}

