package typings
package officeDashJsDashPreviewLib.OneNoteNs

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
  var contentId: java.lang.String
  /**
    *
    * Represents the id of the ink stroke
    *
    * [Api set: OneNoteApi 1.1]
    */
  var inkStrokeId: java.lang.String
}

object InkStrokePointer {
  @scala.inline
  def apply(contentId: java.lang.String, inkStrokeId: java.lang.String): InkStrokePointer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("contentId")(contentId)
    __obj.updateDynamic("inkStrokeId")(inkStrokeId)
    __obj.asInstanceOf[InkStrokePointer]
  }
}

