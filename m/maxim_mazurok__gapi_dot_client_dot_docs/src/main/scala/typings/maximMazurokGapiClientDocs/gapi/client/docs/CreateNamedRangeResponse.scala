package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateNamedRangeResponse extends StObject {
  
  /** The ID of the created named range. */
  var namedRangeId: js.UndefOr[String] = js.undefined
}
object CreateNamedRangeResponse {
  
  inline def apply(): CreateNamedRangeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNamedRangeResponse]
  }
  
  extension [Self <: CreateNamedRangeResponse](x: Self) {
    
    inline def setNamedRangeId(value: String): Self = StObject.set(x, "namedRangeId", value.asInstanceOf[js.Any])
    
    inline def setNamedRangeIdUndefined: Self = StObject.set(x, "namedRangeId", js.undefined)
  }
}
