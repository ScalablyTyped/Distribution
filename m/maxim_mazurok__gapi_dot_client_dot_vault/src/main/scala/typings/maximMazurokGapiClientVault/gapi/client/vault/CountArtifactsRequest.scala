package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CountArtifactsRequest extends StObject {
  
  /** The search query. */
  var query: js.UndefOr[Query] = js.undefined
  
  /** Specifies the granularity of the count result returned in response. */
  var view: js.UndefOr[String] = js.undefined
}
object CountArtifactsRequest {
  
  @scala.inline
  def apply(): CountArtifactsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CountArtifactsRequest]
  }
  
  @scala.inline
  implicit class CountArtifactsRequestMutableBuilder[Self <: CountArtifactsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQuery(value: Query): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
