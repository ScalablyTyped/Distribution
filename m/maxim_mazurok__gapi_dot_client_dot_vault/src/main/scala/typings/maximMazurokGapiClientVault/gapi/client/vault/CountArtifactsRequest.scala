package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CountArtifactsRequest extends StObject {
  
  /** The search query. */
  var query: js.UndefOr[Query] = js.undefined
  
  /** Sets the granularity of the count results. */
  var view: js.UndefOr[String] = js.undefined
}
object CountArtifactsRequest {
  
  inline def apply(): CountArtifactsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CountArtifactsRequest]
  }
  
  extension [Self <: CountArtifactsRequest](x: Self) {
    
    inline def setQuery(value: Query): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
