package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFootnoteResponse extends StObject {
  
  /** The ID of the created footnote. */
  var footnoteId: js.UndefOr[String] = js.undefined
}
object CreateFootnoteResponse {
  
  inline def apply(): CreateFootnoteResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFootnoteResponse]
  }
  
  extension [Self <: CreateFootnoteResponse](x: Self) {
    
    inline def setFootnoteId(value: String): Self = StObject.set(x, "footnoteId", value.asInstanceOf[js.Any])
    
    inline def setFootnoteIdUndefined: Self = StObject.set(x, "footnoteId", js.undefined)
  }
}
