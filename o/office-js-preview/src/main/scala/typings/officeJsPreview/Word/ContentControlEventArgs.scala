package typings.officeJsPreview.Word

import typings.officeJsPreview.officeJsPreviewStrings.CommentAdded
import typings.officeJsPreview.officeJsPreviewStrings.CommentChanged
import typings.officeJsPreview.officeJsPreviewStrings.CommentDeleted
import typings.officeJsPreview.officeJsPreviewStrings.CommentDeselected
import typings.officeJsPreview.officeJsPreviewStrings.CommentSelected
import typings.officeJsPreview.officeJsPreviewStrings.ContentControlAdded
import typings.officeJsPreview.officeJsPreviewStrings.ContentControlDataChanged
import typings.officeJsPreview.officeJsPreviewStrings.ContentControlDeleted
import typings.officeJsPreview.officeJsPreviewStrings.ContentControlEntered
import typings.officeJsPreview.officeJsPreviewStrings.ContentControlExited
import typings.officeJsPreview.officeJsPreviewStrings.ContentControlSelectionChanged
import typings.officeJsPreview.officeJsPreviewStrings.Local
import typings.officeJsPreview.officeJsPreviewStrings.Remote
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
  var eventType: EventType | ContentControlDeleted | ContentControlSelectionChanged | ContentControlDataChanged | ContentControlAdded | CommentDeleted | CommentSelected | CommentDeselected | CommentChanged | CommentAdded | ContentControlEntered | ContentControlExited
  
  /**
    * Gets the content control IDs.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var ids: js.Array[Double]
  
  /**
    * The source of the event. It can be local or remote (through coauthoring).
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var source: EventSource | Local | Remote
}
object ContentControlEventArgs {
  
  inline def apply(
    contentControl: ContentControl,
    eventType: EventType | ContentControlDeleted | ContentControlSelectionChanged | ContentControlDataChanged | ContentControlAdded | CommentDeleted | CommentSelected | CommentDeselected | CommentChanged | CommentAdded | ContentControlEntered | ContentControlExited,
    ids: js.Array[Double],
    source: EventSource | Local | Remote
  ): ContentControlEventArgs = {
    val __obj = js.Dynamic.literal(contentControl = contentControl.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentControlEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentControlEventArgs] (val x: Self) extends AnyVal {
    
    inline def setContentControl(value: ContentControl): Self = StObject.set(x, "contentControl", value.asInstanceOf[js.Any])
    
    inline def setEventType(
      value: EventType | ContentControlDeleted | ContentControlSelectionChanged | ContentControlDataChanged | ContentControlAdded | CommentDeleted | CommentSelected | CommentDeselected | CommentChanged | CommentAdded | ContentControlEntered | ContentControlExited
    ): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setIds(value: js.Array[Double]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsVarargs(value: Double*): Self = StObject.set(x, "ids", js.Array(value*))
    
    inline def setSource(value: EventSource | Local | Remote): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
