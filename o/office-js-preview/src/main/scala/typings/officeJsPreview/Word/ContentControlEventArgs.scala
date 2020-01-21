package typings.officeJsPreview.Word

import typings.officeJsPreview.officeJsPreviewStrings.AnnotationAdded
import typings.officeJsPreview.officeJsPreviewStrings.AnnotationChanged
import typings.officeJsPreview.officeJsPreviewStrings.AnnotationDeleted
import typings.officeJsPreview.officeJsPreviewStrings.ContentControlAdded
import typings.officeJsPreview.officeJsPreviewStrings.ContentControlDataChanged
import typings.officeJsPreview.officeJsPreviewStrings.ContentControlDeleted
import typings.officeJsPreview.officeJsPreviewStrings.ContentControlSelectionChanged
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
  var eventType: EventType | ContentControlDeleted | ContentControlSelectionChanged | ContentControlDataChanged | ContentControlAdded | AnnotationAdded | AnnotationChanged | AnnotationDeleted
}

object ContentControlEventArgs {
  @scala.inline
  def apply(
    contentControl: ContentControl,
    eventType: EventType | ContentControlDeleted | ContentControlSelectionChanged | ContentControlDataChanged | ContentControlAdded | AnnotationAdded | AnnotationChanged | AnnotationDeleted
  ): ContentControlEventArgs = {
    val __obj = js.Dynamic.literal(contentControl = contentControl.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ContentControlEventArgs]
  }
}

