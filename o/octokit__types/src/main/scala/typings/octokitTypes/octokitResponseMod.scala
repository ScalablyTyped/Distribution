package typings.octokitTypes

import typings.octokitTypes.responseHeadersMod.ResponseHeaders
import typings.octokitTypes.urlMod.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object octokitResponseMod {
  
  trait OctokitResponse[T] extends StObject {
    
    /**
      *  This is the data you would see in https://developer.Octokit.com/v3/
      */
    var data: T
    
    var headers: ResponseHeaders
    
    /**
      * http response code
      */
    var status: Double
    
    /**
      * URL of response after all redirects
      */
    var url: Url
  }
  object OctokitResponse {
    
    inline def apply[T](data: T, headers: ResponseHeaders, status: Double, url: Url): OctokitResponse[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[OctokitResponse[T]]
    }
    
    extension [Self <: OctokitResponse[?], T](x: Self & OctokitResponse[T]) {
      
      inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: ResponseHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: Url): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
