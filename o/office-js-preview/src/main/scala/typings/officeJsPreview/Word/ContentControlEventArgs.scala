package typings.officeJsPreview.Word

import typings.officeJsPreview.officeJsPreviewStrings.CommentAdded
import typings.officeJsPreview.officeJsPreviewStrings.CommentChanged
import typings.officeJsPreview.officeJsPreviewStrings.CommentDeleted
import typings.officeJsPreview.officeJsPreviewStrings.CommentDeselected
import typings.officeJsPreview.officeJsPreviewStrings.CommentSelected
import typings.officeJsPreview.officeJsPreviewStrings.ContentControlAdded
import typings.officeJsPreview.officeJsPreviewStrings.ContentControlDataChanged
import typings.officeJsPreview.officeJsPreviewStrings.ContentControlDeleted
import typings.officeJsPreview.officeJsPreviewStrings.ContentControlSelectionChanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about the content control that raised an event.
  *
  * @remarks
  * [Api set: WordApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait ContentControlEventArgs extends StObject {
  
  /**
    * The object that raised the event. Load this object to get its properties.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var contentControl: ContentControl
  
  /**
    * The event type. See Word.EventType for details.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var eventType: EventType | ContentControlDeleted | ContentControlSelectionChanged | ContentControlDataChanged | ContentControlAdded | CommentDeleted | CommentSelected | CommentDeselected | CommentChanged | CommentAdded
}
object ContentControlEventArgs {
  
  inline def apply(
    contentControl: ContentControl,
    eventType: EventType | ContentControlDeleted | ContentControlSelectionChanged | ContentControlDataChanged | ContentControlAdded | CommentDeleted | CommentSelected | CommentDeselected | CommentChanged | CommentAdded
  ): ContentControlEventArgs = {
    val __obj = js.Dynamic.literal(contentControl = contentControl.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentControlEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentControlEventArgs] (val x: Self) extends AnyVal {
    
    inline def setContentControl(value: ContentControl): Self = StObject.set(x, "contentControl", value.asInstanceOf[js.Any])
    
    inline def setEventType(
      value: EventType | ContentControlDeleted | ContentControlSelectionChanged | ContentControlDataChanged | ContentControlAdded | CommentDeleted | CommentSelected | CommentDeselected | CommentChanged | CommentAdded
    ): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
  }
}
