package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFooterResponse extends StObject {
  
  /** The ID of the created footer. */
  var footerId: js.UndefOr[String] = js.undefined
}
object CreateFooterResponse {
  
  inline def apply(): CreateFooterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFooterResponse]
  }
  
  extension [Self <: CreateFooterResponse](x: Self) {
    
    inline def setFooterId(value: String): Self = StObject.set(x, "footerId", value.asInstanceOf[js.Any])
    
    inline def setFooterIdUndefined: Self = StObject.set(x, "footerId", js.undefined)
  }
}
