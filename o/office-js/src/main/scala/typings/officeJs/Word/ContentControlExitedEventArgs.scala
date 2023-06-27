package typings.officeJs.Word

import typings.officeJs.officeJsStrings.ContentControlAdded
import typings.officeJs.officeJsStrings.ContentControlDataChanged
import typings.officeJs.officeJsStrings.ContentControlDeleted
import typings.officeJs.officeJsStrings.ContentControlEntered
import typings.officeJs.officeJsStrings.ContentControlExited
import typings.officeJs.officeJsStrings.ContentControlSelectionChanged
import typings.officeJs.officeJsStrings.Local
import typings.officeJs.officeJsStrings.Remote
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about the content control that raised contentControlExited event.
  *
  * @remarks
  * [Api set: WordApi 1.5]
  */
trait ContentControlExitedEventArgs extends StObject {
  
  /**
    * The event type. See Word.EventType for details.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var eventType: EventType | ContentControlDeleted | ContentControlSelectionChanged | ContentControlDataChanged | ContentControlAdded | ContentControlEntered | ContentControlExited
  
  /**
    * Gets the content control IDs.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var ids: js.Array[Double]
  
  /**
    * The source of the event. It can be local or remote (through coauthoring).
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var source: EventSource | Local | Remote
}
object ContentControlExitedEventArgs {
  
  inline def apply(
    eventType: EventType | ContentControlDeleted | ContentControlSelectionChanged | ContentControlDataChanged | ContentControlAdded | ContentControlEntered | ContentControlExited,
    ids: js.Array[Double],
    source: EventSource | Local | Remote
  ): ContentControlExitedEventArgs = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentControlExitedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentControlExitedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setEventType(
      value: EventType | ContentControlDeleted | ContentControlSelectionChanged | ContentControlDataChanged | ContentControlAdded | ContentControlEntered | ContentControlExited
    ): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setIds(value: js.Array[Double]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsVarargs(value: Double*): Self = StObject.set(x, "ids", js.Array(value*))
    
    inline def setSource(value: EventSource | Local | Remote): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
