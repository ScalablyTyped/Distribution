package typings.officeJs.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about the document that raised the SelectionChanged event.
  */
@js.native
trait DocumentSelectionChangedEventArgs extends StObject {
  
  /**
    * Gets an {@link Office.Document} object that represents the document that raised the SelectionChanged event.
    */
  var document: Document = js.native
  
  /**
    * Get an {@link Office.EventType} enumeration value that identifies the kind of event that was raised.
    */
  var `type`: EventType = js.native
}
object DocumentSelectionChangedEventArgs {
  
  @scala.inline
  def apply(document: Document, `type`: EventType): DocumentSelectionChangedEventArgs = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentSelectionChangedEventArgs]
  }
  
  @scala.inline
  implicit class DocumentSelectionChangedEventArgsMutableBuilder[Self <: DocumentSelectionChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocument(value: Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: EventType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
