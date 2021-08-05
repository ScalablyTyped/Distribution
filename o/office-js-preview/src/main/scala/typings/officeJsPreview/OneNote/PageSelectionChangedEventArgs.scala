package typings.officeJsPreview.OneNote

import typings.officeJsPreview.officeJsPreviewStrings.PageSelectionChanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Provides information about the binding that raised the Page selection changed event
  *
  * [Api set: OneNoteApi 1.1]
  */
trait PageSelectionChangedEventArgs extends StObject {
  
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
  
  inline def apply(oldId: String): PageSelectionChangedEventArgs = {
    val __obj = js.Dynamic.literal(oldId = oldId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("PageSelectionChanged")
    __obj.asInstanceOf[PageSelectionChangedEventArgs]
  }
  
  extension [Self <: PageSelectionChangedEventArgs](x: Self) {
    
    inline def setOldId(value: String): Self = StObject.set(x, "oldId", value.asInstanceOf[js.Any])
    
    inline def setType(value: PageSelectionChanged): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
