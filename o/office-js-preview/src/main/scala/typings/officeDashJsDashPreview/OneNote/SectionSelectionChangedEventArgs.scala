package typings.officeDashJsDashPreview.OneNote

import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.SectionSelectionChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the binding that raised the section selection changed event
  *
  * [Api set: OneNoteApi 1.5]
  */
trait SectionSelectionChangedEventArgs extends js.Object {
  /**
    *
    * Active Section id before change
    *
    * [Api set: OneNoteApi 1.5]
    */
  var oldId: String
  /**
    *
    * Gets the type of the event. See EventType for details.
    *
    * [Api set: OneNoteApi 1.5]
    */
  var `type`: SectionSelectionChanged
}

object SectionSelectionChangedEventArgs {
  @scala.inline
  def apply(oldId: String, `type`: SectionSelectionChanged): SectionSelectionChangedEventArgs = {
    val __obj = js.Dynamic.literal(oldId = oldId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SectionSelectionChangedEventArgs]
  }
}

