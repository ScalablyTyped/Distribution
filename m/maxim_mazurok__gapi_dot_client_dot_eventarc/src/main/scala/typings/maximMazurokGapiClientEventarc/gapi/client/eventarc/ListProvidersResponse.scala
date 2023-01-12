package typings.maximMazurokGapiClientEventarc.gapi.client.eventarc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProvidersResponse extends StObject {
  
  /** A page token that can be sent to `ListProviders` to request the next page. If this is empty, then there are no more pages. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The requested providers, up to the number specified in `page_size`. */
  var providers: js.UndefOr[js.Array[Provider]] = js.undefined
  
  /** Unreachable resources, if any. */
  var unreachable: js.UndefOr[js.Array[String]] = js.undefined
}
object ListProvidersResponse {
  
  inline def apply(): ListProvidersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProvidersResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListProvidersResponse] (val x: Self) extends AnyVal {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setProviders(value: js.Array[Provider]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    inline def setProvidersUndefined: Self = StObject.set(x, "providers", js.undefined)
    
    inline def setProvidersVarargs(value: Provider*): Self = StObject.set(x, "providers", js.Array(value*))
    
    inline def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    inline def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    inline def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value*))
  }
}
