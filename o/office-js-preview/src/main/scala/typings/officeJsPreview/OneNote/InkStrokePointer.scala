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
trait InkStrokePointer extends js.Object {
  /**
    *
    * Represents the id of the page content object corresponding to this stroke
    *
    * [Api set: OneNoteApi 1.1]
    */
  var contentId: String
  /**
    *
    * Represents the id of the ink stroke
    *
    * [Api set: OneNoteApi 1.1]
    */
  var inkStrokeId: String
}

object InkStrokePointer {
  @scala.inline
  def apply(contentId: String, inkStrokeId: String): InkStrokePointer = {
    val __obj = js.Dynamic.literal(contentId = contentId.asInstanceOf[js.Any], inkStrokeId = inkStrokeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InkStrokePointer]
  }
}

