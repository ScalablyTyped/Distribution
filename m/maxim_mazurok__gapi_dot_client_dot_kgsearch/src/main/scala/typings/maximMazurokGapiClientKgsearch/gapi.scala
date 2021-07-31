package typings.maximMazurokGapiClientKgsearch

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientKgsearch.anon.Accesstoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  object client {
    
    object kgsearch {
      
      @js.native
      trait EntitiesResource extends StObject {
        
        /**
          * Searches Knowledge Graph for entities that match the constraints. A list of matched entities will be returned in response, which will be in JSON-LD format and compatible with
          * http://schema.org
          */
        def search(): Request[SearchResponse] = js.native
        def search(request: Accesstoken): Request[SearchResponse] = js.native
      }
      
      trait SearchResponse extends StObject {
        
        /** The local context applicable for the response. See more details at http://www.w3.org/TR/json-ld/#context-definitions. */
        var `@context`: js.UndefOr[js.Any] = js.undefined
        
        /** The schema type of top-level JSON-LD object, e.g. ItemList. */
        var `@type`: js.UndefOr[js.Any] = js.undefined
        
        /** The item list of search results. */
        var itemListElement: js.UndefOr[js.Array[js.Any]] = js.undefined
      }
      object SearchResponse {
        
        @scala.inline
        def apply(): SearchResponse = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[SearchResponse]
        }
        
        @scala.inline
        implicit class SearchResponseMutableBuilder[Self <: SearchResponse] (val x: Self) extends AnyVal {
          
          @scala.inline
          def `set@context`(value: js.Any): Self = StObject.set(x, "@context", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `set@contextUndefined`: Self = StObject.set(x, "@context", js.undefined)
          
          @scala.inline
          def `set@type`(value: js.Any): Self = StObject.set(x, "@type", value.asInstanceOf[js.Any])
          
          @scala.inline
          def `set@typeUndefined`: Self = StObject.set(x, "@type", js.undefined)
          
          @scala.inline
          def setItemListElement(value: js.Array[js.Any]): Self = StObject.set(x, "itemListElement", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setItemListElementUndefined: Self = StObject.set(x, "itemListElement", js.undefined)
          
          @scala.inline
          def setItemListElementVarargs(value: js.Any*): Self = StObject.set(x, "itemListElement", js.Array(value :_*))
        }
      }
    }
  }
}
