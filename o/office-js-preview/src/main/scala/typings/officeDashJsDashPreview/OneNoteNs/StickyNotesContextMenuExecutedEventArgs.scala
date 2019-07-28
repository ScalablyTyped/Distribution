package typings.officeDashJsDashPreview.OneNoteNs

import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.StickyNotesContextMenuExecuted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the binding that raised the StickyNotesContextMenuExecuted event
  *
  * [Api set: OneNoteApi 1.5]
  */
trait StickyNotesContextMenuExecutedEventArgs extends js.Object {
  /**
    *
    * Gets the type of the event. See EventType for details.
    *
    * [Api set: OneNoteApi 1.5]
    */
  var `type`: StickyNotesContextMenuExecuted
}

object StickyNotesContextMenuExecutedEventArgs {
  @scala.inline
  def apply(`type`: StickyNotesContextMenuExecuted): StickyNotesContextMenuExecutedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[StickyNotesContextMenuExecutedEventArgs]
  }
}

