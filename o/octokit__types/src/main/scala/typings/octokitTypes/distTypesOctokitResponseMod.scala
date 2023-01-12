package typings.octokitTypes

import typings.octokitTypes.distTypesResponseHeadersMod.ResponseHeaders
import typings.octokitTypes.distTypesUrlMod.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesOctokitResponseMod {
  
  trait OctokitResponse[T, S /* <: Double */] extends StObject {
    
    /**
      * Response data as documented in the REST API reference documentation at https://docs.github.com/rest/reference
      */
    var data: T
    
    var headers: ResponseHeaders
    
    /**
      * http response code
      */
    var status: S
    
    /**
      * URL of response after all redirects
      */
    var url: Url
  }
  object OctokitResponse {
    
    inline def apply[T, S /* <: Double */](data: T, headers: ResponseHeaders, status: S, url: Url): OctokitResponse[T, S] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[OctokitResponse[T, S]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OctokitResponse[?, ?], T, S /* <: Double */] (val x: Self & (OctokitResponse[T, S])) extends AnyVal {
      
      inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: ResponseHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: S): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: Url): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
