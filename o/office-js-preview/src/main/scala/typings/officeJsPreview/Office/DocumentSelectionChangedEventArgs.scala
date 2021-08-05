package typings.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about the document that raised the SelectionChanged event.
  */
trait DocumentSelectionChangedEventArgs extends StObject {
  
  /**
    * Gets an {@link Office.Document} object that represents the document that raised the SelectionChanged event.
    */
  var document: Document
  
  /**
    * Get an {@link Office.EventType} enumeration value that identifies the kind of event that was raised.
    */
  var `type`: EventType
}
object DocumentSelectionChangedEventArgs {
  
  inline def apply(document: Document, `type`: EventType): DocumentSelectionChangedEventArgs = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentSelectionChangedEventArgs]
  }
  
  extension [Self <: DocumentSelectionChangedEventArgs](x: Self) {
    
    inline def setDocument(value: Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setType(value: EventType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
