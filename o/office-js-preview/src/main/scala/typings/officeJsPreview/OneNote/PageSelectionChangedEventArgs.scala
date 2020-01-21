package typings.officeJsPreview.OneNote

import typings.officeJsPreview.officeJsPreviewStrings.PageSelectionChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the binding that raised the Page selection changed event
  *
  * [Api set: OneNoteApi 1.1]
  */
trait PageSelectionChangedEventArgs extends js.Object {
  /**
    *
    * Active Page id before change
    *
    * [Api set: OneNoteApi 1.3]
    */
  var oldId: String
  /**
    *
    * Gets the type of the event. See EventType for details.
    *
    * [Api set: OneNoteApi 1.3]
    */
  var `type`: PageSelectionChanged
}

object PageSelectionChangedEventArgs {
  @scala.inline
  def apply(oldId: String, `type`: PageSelectionChanged): PageSelectionChangedEventArgs = {
    val __obj = js.Dynamic.literal(oldId = oldId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageSelectionChangedEventArgs]
  }
}

