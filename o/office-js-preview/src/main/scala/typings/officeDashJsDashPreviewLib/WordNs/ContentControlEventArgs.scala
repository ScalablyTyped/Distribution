package typings
package officeDashJsDashPreviewLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the content control that raised an event.
  *
  * [Api set: WordApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait ContentControlEventArgs extends js.Object {
  /**
    *
    * The object that raised the event. Load this object to get its properties.
    *
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var contentControl: ContentControl
  /**
    *
    * The event type. See Word.EventType for details.
    *
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var eventType: EventType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ContentControlDeleted | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ContentControlSelectionChanged | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ContentControlDataChanged | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ContentControlAdded | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.AnnotationAdded | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.AnnotationChanged | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.AnnotationDeleted
}

object ContentControlEventArgs {
  @scala.inline
  def apply(
    contentControl: ContentControl,
    eventType: EventType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ContentControlDeleted | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ContentControlSelectionChanged | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ContentControlDataChanged | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ContentControlAdded | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.AnnotationAdded | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.AnnotationChanged | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.AnnotationDeleted
  ): ContentControlEventArgs = {
    val __obj = js.Dynamic.literal(contentControl = contentControl, eventType = eventType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ContentControlEventArgs]
  }
}

