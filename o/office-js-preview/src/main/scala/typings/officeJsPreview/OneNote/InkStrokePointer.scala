package typings.officeJsPreview.OneNote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Weak reference to an ink stroke object and its content parent.
  *
  * [Api set: OneNoteApi 1.1]
  */
@js.native
trait InkStrokePointer extends js.Object {
  /**
    *
    * Represents the id of the page content object corresponding to this stroke
    *
    * [Api set: OneNoteApi 1.1]
    */
  var contentId: String = js.native
  /**
    *
    * Represents the id of the ink stroke
    *
    * [Api set: OneNoteApi 1.1]
    */
  var inkStrokeId: String = js.native
}

object InkStrokePointer {
  @scala.inline
  def apply(contentId: String, inkStrokeId: String): InkStrokePointer = {
    val __obj = js.Dynamic.literal(contentId = contentId.asInstanceOf[js.Any], inkStrokeId = inkStrokeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InkStrokePointer]
  }
  @scala.inline
  implicit class InkStrokePointerOps[Self <: InkStrokePointer] (val x: Self) extends AnyVal {
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
    def setContentId(value: String): Self = this.set("contentId", value.asInstanceOf[js.Any])
    @scala.inline
    def setInkStrokeId(value: String): Self = this.set("inkStrokeId", value.asInstanceOf[js.Any])
  }
  
}

