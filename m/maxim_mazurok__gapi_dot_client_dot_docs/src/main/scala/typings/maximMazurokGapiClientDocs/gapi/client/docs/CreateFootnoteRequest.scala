package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFootnoteRequest extends StObject {
  
  /**
    * Inserts the footnote reference at the end of the document body. Footnote references cannot be inserted inside a header, footer or footnote. Since footnote references can only be
    * inserted in the body, the segment ID field must be empty.
    */
  var endOfSegmentLocation: js.UndefOr[EndOfSegmentLocation] = js.undefined
  
  /**
    * Inserts the footnote reference at a specific index in the document. The footnote reference must be inserted inside the bounds of an existing Paragraph. For instance, it cannot be
    * inserted at a table's start index (i.e. between the table and its preceding paragraph). Footnote references cannot be inserted inside an equation, header, footer or footnote. Since
    * footnote references can only be inserted in the body, the segment ID field must be empty.
    */
  var location: js.UndefOr[Location] = js.undefined
}
object CreateFootnoteRequest {
  
  @scala.inline
  def apply(): CreateFootnoteRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFootnoteRequest]
  }
  
  @scala.inline
  implicit class CreateFootnoteRequestMutableBuilder[Self <: CreateFootnoteRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndOfSegmentLocation(value: EndOfSegmentLocation): Self = StObject.set(x, "endOfSegmentLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndOfSegmentLocationUndefined: Self = StObject.set(x, "endOfSegmentLocation", js.undefined)
    
    @scala.inline
    def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
  }
}
