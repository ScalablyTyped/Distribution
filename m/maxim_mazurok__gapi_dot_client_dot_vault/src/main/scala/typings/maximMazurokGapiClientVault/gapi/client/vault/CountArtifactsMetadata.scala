package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CountArtifactsMetadata extends StObject {
  
  /** End time of count operation. Available when operation is done. */
  var endTime: js.UndefOr[String] = js.undefined
  
  /** The matter ID of the associated matter. */
  var matterId: js.UndefOr[String] = js.undefined
  
  /** The search query from the request. */
  var query: js.UndefOr[Query] = js.undefined
  
  /** Creation time of count operation. */
  var startTime: js.UndefOr[String] = js.undefined
}
object CountArtifactsMetadata {
  
  inline def apply(): CountArtifactsMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CountArtifactsMetadata]
  }
  
  extension [Self <: CountArtifactsMetadata](x: Self) {
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setMatterId(value: String): Self = StObject.set(x, "matterId", value.asInstanceOf[js.Any])
    
    inline def setMatterIdUndefined: Self = StObject.set(x, "matterId", js.undefined)
    
    inline def setQuery(value: Query): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
